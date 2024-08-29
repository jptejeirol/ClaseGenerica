/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package view;
import java.util.HashMap;
import java.util.Map;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.CullFace;
import javafx.scene.shape.DrawMode;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.scene.PerspectiveCamera;
import javafx.scene.control.Alert;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;
import javafx.scene.input.ScrollEvent;
import javafx.scene.shape.Shape;
import javafx.scene.shape.Shape3D;
import javafx.scene.shape.Sphere;

public class clickyfigura extends Application {

    private PerspectiveCamera camera;
    private double mouseX, mouseY;
    private boolean isMousePressed = false;
    private Shape3D selectedObject;
    private double objectMouseOffsetX, objectMouseOffsetY, objectMouseOffsetZ;
    private double rotateX = 0, rotateY = 0;
    private double moveSpeed = 10;
    private double rotateSpeed = 0.5;
    private double zoomSpeed = 1.1;
    private Box visibleCube; // Variable de instancia
    private double ancho = 400;
    private double alto = 400;
    private double profundo = 400;
    private double minX = -0;
    private double maxX = 0;
    private double minY = -0;
    private double maxY = 0;
    private double minZ = -0;
    private double maxZ = 0;
    private static final double WINDOW_SIZE = 600;
    private static final double SPHERE_DIAMETER = WINDOW_SIZE / 5;
    private static final double CUBE_SIZE = 2000;
    private static final double WALL_THICKNESS = 10;
    private static final double WINDOW_WIDTH = 400;
    private static final double WINDOW_HEIGHT = 600;
    private static final double WINDOW_DEPTH = 5;
    private SubScene subScene;
    private Group root;
    private Map<Node, String> objectNames = new HashMap<>();
    @Override
    public void start(Stage primaryStage) {

        root = new Group();

        camera = new PerspectiveCamera(true);
        camera.setTranslateY(-1000);
        camera.setTranslateZ(-3000);
        camera.setNearClip(1);
        camera.setFarClip(5000);
        camera.setFieldOfView(60);

        subScene = new SubScene(root, 600, 400, true, javafx.scene.SceneAntialiasing.BALANCED);
        subScene.setCamera(camera);

        VBox controlPanel = createControlPanel();
        HBox mainLayout = new HBox(10);
        mainLayout.setPadding(new Insets(10));
        mainLayout.getChildren().addAll(subScene, controlPanel);

        Scene mainScene = new Scene(mainLayout, 800, 600);

        mainScene.setOnMousePressed(this::handleMousePressed);
        mainScene.setOnMouseDragged(this::handleMouseDragged);
        mainScene.setOnScroll(this::handleScroll);

        primaryStage.setTitle("RoomDesigner3D");
        primaryStage.setScene(mainScene);
        primaryStage.show();

        root.requestFocus();

        // Agrega el manejador de clics al visibleCube
        visibleCube = createVisibleCube(400, 400, 400);
        root.getChildren().add(visibleCube);
        //visibleCube.setOnMouseClicked(this::handleCubeClick);
    }

        private void handleObjectPressed(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            selectedObject = (Shape3D) event.getSource();
            objectMouseOffsetX = selectedObject.getTranslateX() - event.getSceneX();
            objectMouseOffsetY = selectedObject.getTranslateY() - event.getSceneY();
            
            if (event.isShiftDown()) {
                objectMouseOffsetZ = selectedObject.getTranslateZ() - event.getSceneY();
            }            
        }
        event.consume();
    }
    private void handleObjectDragged(MouseEvent event) {
    if (selectedObject != null) {
        String objectName = objectNames.get(selectedObject);
        String caraventana = (String) selectedObject.getUserData(); // Obtén el valor de `caraventana` del objeto
        double minX, maxX, minY, maxY, minZ, maxZ;
        //para ventanas
        if(objectName=="window"){
            System.out.println("ventanamoviendoese");
        if (caraventana != "lateral"){
            minX=-ancho/2;
            maxX=ancho/2;
            minY=-alto;
            maxY= +100 - alto/2;
                    // Obtener la nueva posición del objeto
        Point3D newPosition = unproject(event.getSceneX(), event.getSceneY(), selectedObject.getTranslateZ());
        
        // Aplicar límites en el eje X
        double limitedX = Math.max(minX, Math.min(newPosition.getX(), maxX));

        // Aplicar límites en el eje Y
        double limitedY = Math.max(minY, Math.min(newPosition.getY(),maxY));
        // Establecer la nueva posición limitada en X y Y
        selectedObject.setTranslateX(limitedX);
        selectedObject.setTranslateY(limitedY);
        }
        else if(caraventana=="lateral"){
            minY=-alto;
            maxY= +100 - alto/2;
            minZ=-1000-profundo/2;
            maxZ=-profundo*2;
            
            
            //double newZ = selectedObject.getTranslateZ() + (event.getSceneY() - (selectedObject.getTranslateY() - objectMouseOffsetY));
        Point3D newPosition = unproject(event.getSceneX(), event.getSceneY(), selectedObject.getTranslateZ());

            // Aplicar límites en el eje Y
             double limitedY = Math.max(minY, Math.min(newPosition.getY(),maxY));  
                 // Invertir el movimiento en Z
              double adjustedZ = -newPosition.getZ();  // Invertir el eje Z
            // Aplicar límites en el eje Z
            double limitedZ = Math.max(minZ, Math.min(adjustedZ, maxZ));
            // Establecer la nueva posición limitada en Z y Y
            selectedObject.setTranslateY(limitedY);
            selectedObject.setTranslateZ(limitedZ);
        }
    }       //para puertas
        else if(objectName=="puerta"){
            
            if (caraventana != "lateral"){
            minX=-ancho/2;
            maxX=ancho/2;

                    // Obtener la nueva posición del objeto
        Point3D newPosition = unproject(event.getSceneX(), event.getSceneY(), selectedObject.getTranslateZ());
        
        // Aplicar límites en el eje X
        double limitedX = Math.max(minX, Math.min(newPosition.getX(), maxX));

        // Establecer la nueva posición limitada en X 
        selectedObject.setTranslateX(limitedX);

        }
        else if(caraventana=="lateral"){

            minZ=-1000-profundo/2;
            maxZ=-profundo*2;
            
            
            //double newZ = selectedObject.getTranslateZ() + (event.getSceneY() - (selectedObject.getTranslateY() - objectMouseOffsetY));
        Point3D newPosition = unproject(event.getSceneX(), event.getSceneY(), selectedObject.getTranslateZ());


                 // Invertir el movimiento en Z
              double adjustedZ = -newPosition.getZ();  // Invertir el eje Z
            // Aplicar límites en el eje Z
            double limitedZ = Math.max(minZ, Math.min(adjustedZ, maxZ));
            // Establecer la nueva posición limitada en Z 
            selectedObject.setTranslateZ(limitedZ);
        }
        }
    }
    event.consume();
}

    private Point3D unproject(double sceneX, double sceneY, double z) {
        double subSceneX = sceneX - subScene.getLayoutX();
        double subSceneY = sceneY - subScene.getLayoutY();

        double normalizedX = (subSceneX / subScene.getWidth()) * 2 - 1;
        double normalizedY = -((subSceneY / subScene.getHeight()) * 2 - 1);

        Point3D clipPoint = new Point3D(normalizedX, normalizedY, -1);

        Point3D viewPoint = camera.localToScene(clipPoint);
        viewPoint = camera.sceneToLocal(viewPoint);

        Point3D worldPoint = new Point3D(viewPoint.getX() * -camera.getTranslateZ(), 
                                         viewPoint.getY() * camera.getTranslateZ(), 
                                         z);

        Rotate rxInverse = new Rotate(-rotateY, Rotate.X_AXIS);
        Rotate ryInverse = new Rotate(-rotateX, Rotate.Y_AXIS);
        worldPoint = rxInverse.transform(worldPoint);
        worldPoint = ryInverse.transform(worldPoint);

        return worldPoint;
    }
    
    
    private void handleMousePressed(MouseEvent event) {
        mouseX = event.getSceneX();
        mouseY = event.getSceneY();
        isMousePressed = true;
    }

    private void handleMouseDragged(MouseEvent event) {
        if (isMousePressed) {
            double deltaX = event.getSceneX() - mouseX;
            double deltaY = event.getSceneY() - mouseY;

            if (event.isPrimaryButtonDown()) {
                camera.setTranslateX(camera.getTranslateX() - deltaX);
                camera.setTranslateY(camera.getTranslateY() + deltaY);
            } else if (event.isSecondaryButtonDown()) {
                rotateCamera(deltaX, deltaY);
            }

            mouseX = event.getSceneX();
            mouseY = event.getSceneY();
        }
    }
    
    private void handleCubeClick(Box cube,double width, double height, double depth) {
    cube.setOnMouseClicked(event -> {
        if (event.getButton() == MouseButton.SECONDARY) {
                double x = event.getX();
                double y = event.getY();
                double z = event.getZ();
                // Mostrar menú contextual al hacer clic derecho
  
                setupContextMenu(cube,x,y,z);

        }
        else if (event.getButton() == MouseButton.PRIMARY) {
        double x = event.getX();
        double y = event.getY();
        double z = event.getZ();
         // Crear la figura según la cara clickeada
            Sphere shapeToCreate = createShapeAtPosition(cube, x, y, z, width, height, depth);
            
            // Agregar la figura al grupo principal
            Group root = (Group) cube.getParent();
            if (root != null) {
                root.getChildren().add(shapeToCreate);
            }
        // Detectar qué cara fue clickeada
        String faceClicked;
        if (x <= cube.getWidth() / 2 && x >= -cube.getWidth() / 2) {
            if (y == -cube.getHeight() / 2) {
                faceClicked = "Cara Superior";
            } else if (y == cube.getHeight() / 2) {
                faceClicked = "Cara Inferior";
            } else if (z == -cube.getDepth() / 2) {
                faceClicked = "Cara Frontal";
            } else if (z == cube.getDepth() / 2) {
                faceClicked = "Cara Posterior";
            } else if (x == -cube.getWidth() / 2) {
                faceClicked = "Cara Izquierda";
            } else if (x == cube.getWidth() / 2) {
                faceClicked = "Cara Derecha";
            } else {
                faceClicked = "No se detectó una cara específica";
            }
        } else {
            faceClicked = "Clic fuera del cubo";
        }

        System.out.println("Clic en la posición: (" + x + ", " + y + ", " + z + ")");
        System.out.println("Cara del cubo clickeada: " + faceClicked);
        }
    });
    }

    private void handleScroll(ScrollEvent event) {
        if (event.getDeltaY() < 0) {
            camera.setTranslateZ(camera.getTranslateZ() * zoomSpeed);
        } else {
            camera.setTranslateZ(camera.getTranslateZ() / zoomSpeed);
        }
    }

    private void rotateCamera(double deltaX, double deltaY) {
        rotateX += deltaX * rotateSpeed;
        rotateY -= deltaY * rotateSpeed;

        rotateY = Math.max(-89, Math.min(89, rotateY));

        camera.getTransforms().clear();
        camera.getTransforms().add(new Rotate(rotateX, Rotate.Y_AXIS));
        camera.getTransforms().add(new Rotate(rotateY, Rotate.X_AXIS));
    }

    private Box createVisibleCube(double ancho, double alto, double profundo) {
        Box visibleCube = new Box(ancho, alto, profundo);
        PhongMaterial cubeMaterial = new PhongMaterial();
        cubeMaterial.setDiffuseColor(Color.color(0.5, 0.5, 0.5, 0.2)); // Color gris con 20% de opacidad
        visibleCube.setMaterial(cubeMaterial);
        visibleCube.setTranslateY(-50 - alto / 2);
        visibleCube.setTranslateZ(-1000);
            handleCubeClick(visibleCube,visibleCube.getWidth(), visibleCube.getHeight(), visibleCube.getDepth());

        return visibleCube;
    }
    
    private Box createWindow(double width, double height, Color color,double x, double y, double z) {
        Box window = new Box(width, height, WINDOW_DEPTH);
        
        //Nombre a la ventana
        objectNames.put(window, "window");
             
        //Point3D clickPosition = new Point3D(x - width / 2, y - height / 2, z - visibleCube.getDepth() / 2);
        PhongMaterial windowMaterial = new PhongMaterial(color);
        window.setMaterial(windowMaterial);      
        Point3D rotationAxis = new Point3D(0, 1, 0); // Eje de rotación X
        double rotationAngle = 0;
        String caraventana="Default";
        if (x <= ancho / 2 && x >= -ancho / 2) {

            if (x == -ancho / 2) {
               //cara izquierda
           caraventana = "lateral";
           rotationAngle = 90;
           } else if (x == ancho / 2) {
               //cara derecha
           rotationAngle = 90;
           caraventana = "lateral";

           } 
        }
        window.setRotationAxis(rotationAxis);
        window.setRotate(rotationAngle);
        window.setUserData(caraventana);

        window.setTranslateX( x);
        window.setTranslateY( y - alto / 2);
        window.setTranslateZ( z-1000);
       // window.setRotationAxis(new Point3D(0, 1, 0));
       
               if (window != null) {
            window.setOnMousePressed(this::handleObjectPressed);
            window.setOnMouseDragged(this::handleObjectDragged);
            window.setOnMouseReleased(event -> selectedObject = null);
               }

        visibleCube = createVisibleCube(ancho, alto, profundo);  
            root.getChildren().add(window);
            root.getChildren().add(visibleCube);

        return window;
    }
    
        private Box createPuerta(double width, double height, Color color,double x, double z) {
        Box puerta = new Box(width, height, WINDOW_DEPTH);
        
        //Nombre a la puerta

        objectNames.put(puerta, "puerta");
        //Point3D clickPosition = new Point3D(x - width / 2, y - height / 2, z - visibleCube.getDepth() / 2);
        PhongMaterial puertaMaterial = new PhongMaterial(color);
        puerta.setMaterial(puertaMaterial);      
        Point3D rotationAxis = new Point3D(0, 1, 0); // Eje de rotación X
        double rotationAngle = 0;
        String caraventana="Default";
        if (x <= ancho / 2 && x >= -ancho / 2) {

            if (x == -ancho / 2) {
               //cara izquierda
           caraventana = "lateral";
           rotationAngle = 90;
           } else if (x == ancho / 2) {
               //cara derecha
           rotationAngle = 90;
           caraventana = "lateral";

           } 
        }
        puerta.setRotationAxis(rotationAxis);
        puerta.setRotate(rotationAngle);
        puerta.setUserData(caraventana);

        puerta.setTranslateX( x);
        puerta.setTranslateY( -50  );
        puerta.setTranslateZ( z-1000);
       // window.setRotationAxis(new Point3D(0, 1, 0));
       
               if (puerta != null) {
            puerta.setOnMousePressed(this::handleObjectPressed);
            puerta.setOnMouseDragged(this::handleObjectDragged);
            puerta.setOnMouseReleased(event -> selectedObject = null);
               }

        visibleCube = createVisibleCube(ancho, alto, profundo);  
            root.getChildren().add(puerta);
            if (!root.getChildren().contains(visibleCube)) {
                root.getChildren().add(visibleCube);
            }
            
        return puerta;
    }
        
    private void setupContextMenu(Shape3D object, double x, double y, double z) {
        double xx = x;
        double yy = y;
        double zz = z;
        ContextMenu contextMenu = new ContextMenu();
        MenuItem crearventana = new MenuItem("Crear ventana");
        MenuItem crearpuerta = new MenuItem("Crear puerta");
        crearventana.setOnAction(e -> showDimensionDialog("ventana",xx,yy,zz));
        crearpuerta.setOnAction(e -> showDimensionDialog("puerta",xx,yy,zz));
        
        contextMenu.getItems().addAll(crearventana,crearpuerta);

        object.setOnContextMenuRequested(e -> contextMenu.show(object, e.getScreenX(), e.getScreenY()));
        
    }
        
        
    private void showDimensionDialog(String objectType,double x, double y, double z) {
        Stage dialog = new Stage();
        dialog.setTitle("Ingresar dimensiones para " + objectType);

        VBox dialogVBox = new VBox(10);
        dialogVBox.setPadding(new Insets(10));
        
        Label widthLabel = new Label("Ancho:");
        TextField widthField = new TextField();
        Label heightLabel = new Label("Altura:");
        TextField heightField = new TextField();
        /*
        Label depthLabel = new Label("Profundidad:");
        TextField depthField = new TextField();
        
        if (objectType.equals("Cilindro")) {
            depthLabel.setDisable(true);
            depthField.setDisable(true);
        } else if(objectType.equals("Esfera")) {
            depthLabel.setDisable(true);
            depthField.setDisable(true);
            heightLabel.setDisable(true);
            heightField.setDisable(true);
        }*/
        
        Button createButton = new Button("Crear");
        createButton.setOnAction(e -> {
            try {
                double xx = x;
                double yy = y;
                double zz = z;
                double width = Double.parseDouble(widthField.getText());
                double height = Double.parseDouble(heightField.getText());
               // double depth = objectType.equals("Esfera") || objectType.equals("Cilindro") ? height : Double.parseDouble(depthField.getText());
                //addObject(objectType, width, height, depth);
                if (visibleCube != null) {
                    // Elimina `visibleCube` del grupo `root`
                    root.getChildren().remove(visibleCube);
                }
                if(objectType=="ventana"){
                createWindow(width,height, Color.BLACK, xx,yy,zz);
                }
                else if(objectType=="puerta"){
                    createPuerta(width,height, Color.BROWN, xx,zz);
                }
                dialog.close();
            } catch (NumberFormatException ex) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("Dimensiones inválidas");
                alert.setContentText("Por favor ingrese dimensiones válidas.");
                alert.showAndWait();
            }
        });

        dialogVBox.getChildren().addAll(widthLabel, widthField, heightLabel, heightField, createButton);

        Scene dialogScene = new Scene(dialogVBox, 300, 250);
        dialog.setScene(dialogScene);
        dialog.show();
    }
        
        
        private Sphere createShapeAtPosition(Box cube, double x, double y, double z, double width, double height, double depth) {
        // Calcular la posición relativa del clic en el cubo
        Point3D clickPosition = new Point3D(x - width / 2, y - height / 2, z - depth / 2);
        
        // Crear una esfera en la posición del clic
        Sphere sphere = new Sphere(10); // Radio de 10
        sphere.setMaterial(new PhongMaterial(Color.RED)); // Color rojo
        sphere.setTranslateX(clickPosition.getX()+200);
        sphere.setTranslateY(clickPosition.getY()-50 - alto / 2);
        sphere.setTranslateZ(clickPosition.getZ()-1000+200);

        return sphere;
    }
/*
    
    private void handleCubeClick(MouseEvent event) {
        // Calcula la posición del clic dentro del visibleCube
        double x = event.getX();
        double y = event.getY();
        double z = event.getZ();

        // Crea un cubo pequeño en la posición del clic
        Box smallCube = new Box(10, 10, 10);
        PhongMaterial material = new PhongMaterial(Color.RED);
        smallCube.setMaterial(material);
        smallCube.setTranslateX(x);
        smallCube.setTranslateY(y);
        smallCube.setTranslateZ(z);

        root.getChildren().add(smallCube);
    }
*/
    private VBox createControlPanel() {
        VBox controlPanel = new VBox(10);
        controlPanel.setPadding(new Insets(10));

        Label ancholabel = new Label("Ancho");
        TextArea textancho = new TextArea();
        textancho.setMaxSize(300, 10);
        Label altolabel = new Label("Alto");
        TextArea textalto = new TextArea();
        textalto.setMaxSize(300, 10);
        Label profundolabel = new Label("Profundo");
        TextArea textprofundo = new TextArea();
        textprofundo.setMaxSize(300, 10);

        Button btnGenerar = new Button("Generar");

        btnGenerar.setOnAction(event -> {
            double ancho = Double.parseDouble(textancho.getText().trim());
            double alto = Double.parseDouble(textalto.getText().trim());
            double profundo = Double.parseDouble(textprofundo.getText().trim());
            createRoom(ancho, alto, profundo);
        });

        controlPanel.getChildren().addAll(ancholabel, textancho, altolabel, textalto, profundolabel, textprofundo, btnGenerar);

        return controlPanel;
    }

    private void createRoom(double ancho, double alto, double profundo) {
        Box floor = new Box(ancho, 10, profundo);
        floor.setMaterial(new PhongMaterial(Color.BROWN));
        floor.setTranslateY(-50);
        floor.setTranslateZ(-1000);

        root.getChildren().add(floor);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
