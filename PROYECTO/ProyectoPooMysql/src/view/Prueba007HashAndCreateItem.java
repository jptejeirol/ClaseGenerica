/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package view;
import java.util.ArrayList;
import java.util.List;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.CRC32;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Shape3D;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;
import javafx.scene.PerspectiveCamera;
import javafx.scene.transform.Rotate;
import javafx.geometry.Point3D;
import javafx.scene.control.TextArea;
import javafx.scene.shape.MeshView;
import javafx.scene.shape.TriangleMesh;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import javafx.scene.Node;
import javafx.scene.transform.Transform;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.CRC32;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.MeshView;
import javafx.scene.shape.Shape3D;
import javafx.scene.shape.Sphere;
import javafx.scene.shape.TriangleMesh;
import javafx.scene.transform.Transform;
import javafx.stage.Stage;


public class Prueba007HashAndCreateItem extends Application {

    private PerspectiveCamera camera;
    private double mouseX, mouseY;
    private double rotateX = 0, rotateY = 0;
    private double rotateSpeed = 0.2;
    private double zoomSpeed = 1.1;
    private double floorY = 1000;

    private List<Shape3D> shapes = new ArrayList<>();
    private boolean distancesFixed = false;
    private Shape3D selectedShape = null;
    private List<double[]> distances = new ArrayList<>();
    private Shape3D unanchoredShape = null;

    private Group root3D;
    private SubScene subScene;
    private Shape3D selectedObject;
    private double objectMouseOffsetX, objectMouseOffsetY;

    private Box floor = createFloor();
    private Box wallBack = createWallBack();
    private Box wallLeft = createWallLeft();
    private TextArea hashArea;
    private Button GenerarHashBtn, RegenerarEscenaBtn, fijarposicionesBtn;

    @Override
    public void start(Stage primaryStage) {
        root3D = new Group();
        subScene = new SubScene(root3D, 600, 400, true, javafx.scene.SceneAntialiasing.BALANCED);
        subScene.setFill(Color.LIGHTGRAY);

        camera = new PerspectiveCamera(true);
        camera.setTranslateZ(-2000);
        camera.setTranslateY(500);
        camera.setNearClip(1);
        camera.setFarClip(10000);
        camera.setFieldOfView(50);
        subScene.setCamera(camera);

        root3D.getChildren().addAll(floor, wallBack, wallLeft);

        subScene.setOnMousePressed(this::handleMousePressed);
        subScene.setOnMouseDragged(this::handleMouseDragged);
        subScene.setOnScroll(this::handleScroll);

        VBox controlPanel = createControlPanel();

        HBox mainLayout = new HBox(10);
        mainLayout.setPadding(new Insets(10));
        mainLayout.getChildren().addAll(subScene, controlPanel);

        Scene mainScene = new Scene(mainLayout);

        primaryStage.setTitle("RoomDesigner3D");
        primaryStage.setScene(mainScene);
        primaryStage.setWidth(800);
        primaryStage.setHeight(600);
        primaryStage.show();

        root3D.requestFocus();
    }

    private Box createFloor() {
        Box floor = new Box(3000, 10, 4000);
        floor.setMaterial(new PhongMaterial(Color.GRAY));
        floor.setTranslateY(floorY);
        return floor;
    }

    private Box createWallBack() {
        Box wallBack = new Box(3000, 2500, 10);
        wallBack.setMaterial(new PhongMaterial(Color.GRAY));
        wallBack.setTranslateZ(2000);
        return wallBack;
    }

    private Box createWallLeft() {
        Box wallLeft = new Box(10, 2500, 4000);
        wallLeft.setMaterial(new PhongMaterial(Color.GRAY));
        wallLeft.setTranslateX(-1500);
        return wallLeft;
    }

    private VBox createControlPanel() {
        VBox controlPanel = new VBox(10);
        controlPanel.setPadding(new Insets(10));

        Button fixDistancesBtn = new Button("Fijar Distancias");
        fixDistancesBtn.setOnAction(event -> fixDistances());

        GenerarHashBtn = new Button("Generar Hash");
        GenerarHashBtn.setOnAction(event -> generateHash());

        RegenerarEscenaBtn = new Button("Regenerar Escena");
        RegenerarEscenaBtn.setOnAction(event -> regenerateScene());

        hashArea = new TextArea();
  

        Label titleLabel = new Label("Seleccionar objeto:");
        ComboBox<String> objectSelector = new ComboBox<>();
        objectSelector.getItems().addAll("Esfera", "Cilindro", "Cubo", "Poliedro", "Tetraedro", "Piramide");
        objectSelector.setOnAction(e -> addObject(objectSelector.getValue()));

        controlPanel.getChildren().addAll(titleLabel, objectSelector, fixDistancesBtn, GenerarHashBtn, RegenerarEscenaBtn, hashArea);
        return controlPanel;
    }

    private void addObject(String objectType) {
        Shape3D newObject = null;
        switch (objectType) {
            case "Cubo":
                newObject = new Box(600, 600, 600);
                break;
            case "Esfera":
                newObject = new Esfera3D(600, Color.BLUE).getEsfera();
                break;
            case "Cilindro":
                newObject = new Cilindro3D(300, 600, Color.RED).getCilindro();
                break;
            case "Poliedro":
                newObject = new PoliedroPersonalizado();
                break;
            case "Tetraedro":
                newObject = new Tetraedro();
                break;
            case "Piramide":
                newObject = new Piramide();
                break;
        }

        if (newObject != null) {
            newObject.setTranslateX(0);
            newObject.setTranslateY(-500);
            newObject.setTranslateZ(0);
            newObject.setOnMousePressed(this::handleObjectPressed);
            newObject.setOnMouseDragged(this::handleObjectDragged);
            newObject.setOnMouseReleased(event -> selectedObject = null);
            newObject.setOnMouseClicked(this::handleObjectClicked);

            setupContextMenu(newObject);
            root3D.getChildren().add(newObject);
            shapes.add(newObject);
        }
    }

    private void setupContextMenu(Shape3D object) {
        ContextMenu contextMenu = new ContextMenu();
        MenuItem removeItem = new MenuItem("Eliminar");
        removeItem.setOnAction(e -> {
            root3D.getChildren().remove(object);
            shapes.remove(object);
        });
        contextMenu.getItems().add(removeItem);

        object.setOnContextMenuRequested(e -> contextMenu.show(object, e.getScreenX(), e.getScreenY()));
    }

    private void handleObjectPressed(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            selectedObject = (Shape3D) event.getSource();
            System.out.println("Se presiono una figura");
            objectMouseOffsetX = selectedObject.getTranslateX() - event.getSceneX();
            objectMouseOffsetY = selectedObject.getTranslateY() - event.getSceneY();
        }
        event.consume();
    }

    private void handleObjectDragged(MouseEvent event) {
        if (selectedObject != null) {
            selectedObject.setTranslateX(event.getSceneX() + objectMouseOffsetX);
            selectedObject.setTranslateY(event.getSceneY() + objectMouseOffsetY);

            if (distancesFixed && selectedObject != unanchoredShape) {
                adjustPositions(selectedObject);
            }
        }
        event.consume();
    }

    private void handleObjectClicked(MouseEvent event) {
        Shape3D clickedShape = (Shape3D) event.getSource();

        if (distancesFixed) {
            unanchoredShape = clickedShape;
        } else {
            unanchoredShape = null;
        }

        selectedShape = clickedShape;
    }

    private void fixDistances() {
        distancesFixed = true;
        distances.clear();

        for (int i = 0; i < shapes.size(); i++) {
            for (int j = i + 1; j < shapes.size(); j++) {
                Shape3D shapeA = shapes.get(i);
                Shape3D shapeB = shapes.get(j);

                double distanceX = shapeB.getTranslateX() - shapeA.getTranslateX();
                double distanceY = shapeB.getTranslateY() - shapeA.getTranslateY();
                double distanceZ = shapeB.getTranslateZ() - shapeA.getTranslateZ();

                distances.add(new double[]{i, j, distanceX, distanceY, distanceZ});
            }
        }
    }

    private void adjustPositions(Shape3D movedShape) {
        int movedIndex = shapes.indexOf(movedShape);

        for (double[] distance : distances) {
            int indexA = (int) distance[0];
            int indexB = (int) distance[1];
            double distanceX = distance[2];
            double distanceY = distance[3];
            double distanceZ = distance[4];

            if (indexA == movedIndex || indexB == movedIndex) {
                Shape3D shapeA = shapes.get(indexA);
                Shape3D shapeB = shapes.get(indexB);

                if (indexA == movedIndex) {
                    updateShapePosition(shapeB, shapeA, distanceX, distanceY, distanceZ);
                } else {
                    updateShapePosition(shapeA, shapeB, -distanceX, -distanceY, -distanceZ);
                }
            }
        }
    }

    private void updateShapePosition(Shape3D shapeToMove, Shape3D referenceShape, double distanceX, double distanceY, double distanceZ) {
        shapeToMove.setTranslateX(referenceShape.getTranslateX() + distanceX);
        shapeToMove.setTranslateY(referenceShape.getTranslateY() + distanceY);
        shapeToMove.setTranslateZ(referenceShape.getTranslateZ() + distanceZ);
    }

    private void handleMousePressed(MouseEvent event) {
        mouseX = event.getSceneX();
        mouseY = event.getSceneY();
    }

    private void handleMouseDragged(MouseEvent event) {
        rotateX += (event.getSceneY() - mouseY) * rotateSpeed;
        rotateY += (event.getSceneX() - mouseX) * rotateSpeed;

        camera.setRotationAxis(new Point3D(1, 0, 0));
        camera.setRotate(rotateX);

        camera.setRotationAxis(new Point3D(0, 1, 0));
        camera.setRotate(rotateY);

        mouseX = event.getSceneX();
        mouseY = event.getSceneY();
    }

    private void handleScroll(ScrollEvent event) {
        double zoomFactor = (event.getDeltaY() > 0) ? zoomSpeed : 1 / zoomSpeed;
        camera.setTranslateZ(camera.getTranslateZ() * zoomFactor);
    }

private void generateHash() {
    Map<String, double[]> sceneData = new HashMap<>();
    for (Shape3D shape : shapes) {
        sceneData.put(shape.getClass().getSimpleName() + shapes.indexOf(shape),
                new double[]{shape.getTranslateX(), shape.getTranslateY(), shape.getTranslateZ()});
    }

    try {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(sceneData);

        // Generar hash CRC32 del JSON
        CRC32 crc = new CRC32();
        crc.update(json.getBytes(StandardCharsets.UTF_8));
        long hashValue = crc.getValue();
        
        // Codificar el JSON completo en Base64
        String encodedJson = Base64.getEncoder().encodeToString(json.getBytes(StandardCharsets.UTF_8));
        hashArea.setText(encodedJson);
    } catch (JsonProcessingException e) {
        e.printStackTrace();
    }
}

private void regenerateScene() {
    String encodedJson = hashArea.getText().trim();
    if (encodedJson.isEmpty()) return;

    try {
        // Decodificar el JSON desde Base64
        byte[] decodedBytes = Base64.getDecoder().decode(encodedJson);
        String json = new String(decodedBytes, StandardCharsets.UTF_8);

        // Deserializar el JSON
        ObjectMapper mapper = new ObjectMapper();
        Map<String, double[]> sceneData = mapper.readValue(json, new TypeReference<Map<String, double[]>>() {});

        // Limpiar la escena
        root3D.getChildren().clear();
        shapes.clear();

        // Reconstruir la escena
            //Recontruir pieza
        root3D.getChildren().addAll(floor, wallBack, wallLeft);
        
        
        for (Map.Entry<String, double[]> entry : sceneData.entrySet()) {
            String key = entry.getKey();
            double[] position = entry.getValue();

            Shape3D shape = createShapeFromKey(key);
            shape.setTranslateX(position[0]);
            shape.setTranslateY(position[1]);
            shape.setTranslateZ(position[2]);
                        if (shape != null) {
            shape.setOnMousePressed(this::handleObjectPressed);
            shape.setOnMouseDragged(this::handleObjectDragged);
            shape.setOnMouseReleased(event -> selectedObject = null);
            shape.setOnMouseClicked(this::handleObjectClicked);

            setupContextMenu(shape);

            root3D.getChildren().add(shape);
            shapes.add(shape);
        }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}

private Shape3D createShapeFromKey(String key) {
    Shape3D newObjetc = null;
    if (key.contains("Box")) {
        return new Box(600, 600, 600);
    } else if (key.contains("Sphere")) {
        // Ajusta el color según sea necesario
        Shape3D newObject = new Esfera3D(600, Color.BLUE).getEsfera();
        return newObject;
    } else if (key.contains("Cylinder")) {
    Shape3D    newObject = new Cilindro3D(300, 600, Color.RED).getCilindro();
    return newObject;
    } else if (key.contains("Tetrahedron")) {
       Shape3D newObject = new Tetraedro();
        return newObject;
    } else if (key.contains("Pyramid")) {
       Shape3D newObject = new Piramide();
        return newObject;
    }
    return new Box(600, 600, 600); // Default shape
}

    private TriangleMesh createTetrahedronMesh() {
        TriangleMesh mesh = new TriangleMesh();
        mesh.getPoints().addAll(
            0, 0, 0, // Vertex 0
            0, 100, 100, // Vertex 1
            100, 100, 100, // Vertex 2
            50, 0, 50 // Vertex 3
        );
        mesh.getFaces().addAll(
            0, 0, 1, 0, 3, 0,
            0, 0, 2, 0, 1, 0,
            1, 0, 2, 0, 3, 0,
            2, 0, 0, 0, 3, 0
        );
        return mesh;
    }

    private TriangleMesh createPyramidMesh() {
        TriangleMesh mesh = new TriangleMesh();
        mesh.getPoints().addAll(
            0, 0, 0, // Base vertex 0
            0, 100, 0, // Base vertex 1
            100, 0, 0, // Base vertex 2
            100, 100, 0, // Base vertex 3
            50, 50, 100 // Apex vertex
        );
        mesh.getFaces().addAll(
            0, 0, 1, 0, 4, 0,
            1, 0, 2, 0, 4, 0,
            2, 0, 3, 0, 4, 0,
            3, 0, 0, 0, 4, 0
        );
        return mesh;
    }
    
        // Clase personalizada para la esfera
    class Esfera3D {
        private Sphere esfera;
        public Esfera3D(double radius, Color color) {
            esfera = new Sphere(radius);
            esfera.setMaterial(new PhongMaterial(color));
        }
        public Sphere getEsfera() {
            return esfera;
        }
    }

    // Clase personalizada para el cilindro
    class Cilindro3D {
        private Cylinder cilindro;
        public Cilindro3D(double radius, double height, Color color) {
            cilindro = new Cylinder(radius, height);
            cilindro.setMaterial(new PhongMaterial(color));
        }
        public Cylinder getCilindro() {
            return cilindro;
        }
    }

public class PoliedroPersonalizado extends MeshView {

    public PoliedroPersonalizado() {
        // Definir los puntos y las caras del poliedro personalizado
        float[] puntos = {
            0, 100, 0,    // A
            -100, 0, 100,   // B
            100, 0, 100,    // C
            100, 0, -100,   // D
            -100, 0, -100,  // E
            0, -100, 0    // F
        };
        int[] caras = {
            0, 0, 1, 0, 2, 0,  // ABC
            0, 0, 2, 0, 3, 0,  // ACD
            0, 0, 3, 0, 4, 0,  // ADE
            0, 0, 4, 0, 1, 0,  // AEB
            1, 0, 5, 0, 2, 0,  // BFC
            2, 0, 5, 0, 3, 0,  // CFD
            3, 0, 5, 0, 4, 0,  // DFE
            4, 0, 5, 0, 1, 0   // EFB
        };

        // Crear el Mesh y asignarle los puntos y caras
        TriangleMesh mesh = new TriangleMesh();
        mesh.getPoints().addAll(puntos);
        mesh.getFaces().addAll(caras);

        // Añadir coordenadas de textura (obligatorio, aunque no uses texturas)
        float[] texCoords = {
            0.5f, 0, // Coordenadas de textura de placeholder
            0, 1, 
            1, 1
        };
        mesh.getTexCoords().addAll(texCoords);

        // Asignar el mesh a la vista
        this.setMesh(mesh);

        // Configurar material con color
        PhongMaterial material = new PhongMaterial();
        material.setDiffuseColor(Color.BLUE);
        this.setMaterial(material);
    }
}


public class Tetraedro extends MeshView {

    public Tetraedro() {
        // Definir los puntos y las caras del tetraedro
        float[] puntos = {
            0, 100, 0,    // Vértice 0
            -50, -50, 50, // Vértice 1
            50, -50, 50,  // Vértice 2
            50, -50, -50  // Vértice 3
        };
        int[] caras = {
            0, 0, 1, 0, 2, 0,  // Cara 1
            0, 0, 2, 0, 3, 0,  // Cara 2
            0, 0, 3, 0, 1, 0,  // Cara 3
            1, 0, 2, 0, 3, 0   // Cara 4
        };

        // Crear el Mesh y asignarle los puntos y caras
        TriangleMesh mesh = new TriangleMesh();
        mesh.getPoints().addAll(puntos);
        mesh.getFaces().addAll(caras);

        // Añadir coordenadas de textura (obligatorio, aunque no uses texturas)
        float[] texCoords = {
            0.5f, 0, // Coordenadas de textura de placeholder
            0, 1, 
            1, 1
        };
        mesh.getTexCoords().addAll(texCoords);

        // Asignar el mesh a la vista
        this.setMesh(mesh);

        // Configurar material con color
        PhongMaterial material = new PhongMaterial();
        material.setDiffuseColor(Color.GREEN);
        this.setMaterial(material);
    }
}
public class Piramide extends MeshView {

    public Piramide() {
        // Definir los puntos y las caras de la pirámide
        float[] puntos = {
            0, 100, 0,    // Vértice superior
            -50, -50, 50, // Vértice base 1
            50, -50, 50,  // Vértice base 2
            50, -50, -50, // Vértice base 3
            -50, -50, -50 // Vértice base 4
        };
        int[] caras = {
            0, 0, 1, 0, 2, 0,  // Cara 1
            0, 0, 2, 0, 3, 0,  // Cara 2
            0, 0, 3, 0, 4, 0,  // Cara 3
            1, 0, 2, 0, 3, 0,  // Base 1
            1, 0, 3, 0, 4, 0   // Base 2
        };

        // Crear el Mesh y asignarle los puntos y caras
        TriangleMesh mesh = new TriangleMesh();
        mesh.getPoints().addAll(puntos);
        mesh.getFaces().addAll(caras);

        // Añadir coordenadas de textura (obligatorio, aunque no uses texturas)
        float[] texCoords = {
            0.5f, 0, // Coordenadas de textura de placeholder
            0, 1, 
            1, 1
        };
        mesh.getTexCoords().addAll(texCoords);

        // Asignar el mesh a la vista
        this.setMesh(mesh);

        // Configurar material con color
        PhongMaterial material = new PhongMaterial();
        material.setDiffuseColor(Color.YELLOW);
        this.setMaterial(material);
    }
}


public  String getSceneHash(Scene scene) {
        StringBuilder sb = new StringBuilder();

        // Iterar sobre los nodos en la escena
        for (Node node : scene.getRoot().getChildrenUnmodifiable()) {
            if (node instanceof Shape3D) {
                Shape3D shape = (Shape3D) node;
                
                // Obtener tamaño, color y posición
                String type = shape.getClass().getSimpleName();
                Transform transform = shape.getLocalToSceneTransform();
                Color color = (shape.getMaterial() instanceof PhongMaterial) ?
                        ((PhongMaterial) shape.getMaterial()).getDiffuseColor() :
                        Color.TRANSPARENT;
                
                sb.append(type).append("|")
                  .append(shape.getTranslateX()).append(",")
                  .append(shape.getTranslateY()).append(",")
                  .append(shape.getTranslateZ()).append("|")
                  .append(color.toString()).append("|");
            }
        }

        return sb.toString();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
