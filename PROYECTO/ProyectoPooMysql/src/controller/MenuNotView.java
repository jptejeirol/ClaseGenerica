package controller;

import controller.implement.Room;
import controller.implement.Item;
import java.io.FileNotFoundException;
import java.util.Scanner;
import controller.services.ServicesItem;
import controller.services.ServicesRoom;
import controller.services.ServicesUsuario;
import viewLogearseRegistrarse.Login;
//import model.*;
/**
 *
 * @author Juan José Hernandez, Sergio Nicolas Vanegas, Juan Pablo Tejeiro, Santiago Villareal;
 */
public class MenuNotView {
    public static void main(String[] args) throws FileNotFoundException {
                ServicesUsuario servUsuario = new ServicesUsuario();
                ServicesRoom servRoom = new ServicesRoom();
                ServicesItem servItem = new ServicesItem();
        Login Logeo = new Login();
        Logeo.setVisible(true);
        Logeo.setLocationRelativeTo(null);
        // Crear una sola instancia de FirebasePushObject
        /*FirebasePushObject firebasePushObject = new FirebasePushObject();
        firebasePushObject.initFirebase();*/
        
        Scanner lector = new Scanner(System.in);
        
        // Menú principal
        
        boolean continuar = true;
        while (continuar) {
            System.out.println("Bienvenido a Roomade\n1. Sign in     2. Sign up     3. Cerrar Programa");            
            int opcion = lector.nextInt();
            lector.nextLine();
            while (opcion != 1 && opcion != 2 && opcion !=3) {
                System.out.println("Opcion invalida\n1. Sign in     2. Sign up     3. Cerrar Programa");
                opcion = lector.nextInt();
                lector.nextLine();
            }

            // Iniciar sesión
            if (opcion == 1) {

                
                int x = 0;
                System.out.println("Ingresa tu usuario: ");
                String username = lector.nextLine();
                System.out.println("Ingresa tu contraseña: ");
                String password = lector.nextLine();
                if(servUsuario.Info_UsuarioLogin(username, password)){
                    System.out.println("\nBIENVENIDO A ROOMADE ^^!\n");
                }
                else{
                    while (x==0){
                        System.out.println("El usuario y/o la contraseña no coinciden, tal vez no estes registrado... ");
                        System.out.println("Ingresa tu usuario");
                        username = lector.nextLine();
                        System.out.println("Ingresa tu contraseña");
                        password = lector.nextLine();

                        if (servUsuario.Info_UsuarioLogin(username, password)){
                            System.out.println("BIENVENIDO A ROOMADE ^^!");
                            x++;
                        }
                    }
                }
                int w=1;
                /*Si existe, da la bienvenida al usuario*/
                while(w==1){
                    System.out.print("| ------------------------- Hola de nuevo "+ username +" ----------------------- ");
                    System.out.println("""
                                       |                                                                   |
                                       |      - A que secci\u00f3n desea dirigirse:                             |
                                       |           1. Mis diseños.              2. Nuevo diseño.           |
                                       |           3. Nuevo Objeto.              4. Configuración.         |
                                       |           5. Comentarios.               6. Ayuda.                  |
                                       |           7. Cerrar.                                               |
                                       | ------------------------------------------------------------------ |\n""");
                    int opcionseccion = lector.nextInt();
                    lector.nextLine();

                    /*Solo creamos la seccion de configuracion para actualizar los
                    datos (Historia 5)*/
                    while(opcionseccion<0 || opcionseccion>7){
                        System.out.println("""
                                           | ----------------------- Sección inexistente. -------------------- |
                                           | Explorar otras secciones:                                          |
                                           |                                                                    |
                                           |      - A que sección desea dirigirse:                              |
                                           |           1. Mis diseños.              2. Nuevo diseño.           |
                                           |           3. Nuevo Objeto.             4. Configuración.           |
                                           |           5. Comentarios               6. Ayuda.                   |
                                           |           7. Cerrar.                                               |
                                           | ------------------------------------------------------------------ |\n""");
                        opcionseccion = lector.nextInt();
                        lector.nextLine();
                    }
                    
                    switch(opcionseccion){
                        /*Codigo dirigido para almacenar los diseños guardados
                        (historias posteriores)*/
                        case 1: System.out.println("Aquí encontraras tus diseños guardados");
                            break;
                        case 2: System.out.println("Digite la base de su cuarto en metros: ");
                            double base = lector.nextDouble();
                            lector.nextLine();
                            System.out.println("Digite la altura de su cuarto en metros: ");
                            double altura = lector.nextDouble();
                            lector.nextLine();
                            System.out.println("Digite la profundidad de su cuarto en metros: ");
                            double profundidad= lector.nextDouble();
                            Room diseño = new Room("Nombre del objeto", base, altura, profundidad);
                            servRoom.guardar_diseño(username, diseño);
                            
                            break;
                        case 3: System.out.println("Digite la base de su objeto en metros: ");
                            double baseItem = lector.nextDouble();
                            lector.nextLine();
                            System.out.println("Digite la altura de su cuarto en metros: ");
                            double alturaItem = lector.nextDouble();
                            lector.nextLine();
                            System.out.println("Digite la profundidad de su cuarto en metros: ");
                            double profundidadItem= lector.nextDouble();
                            Item item = new Item("Nombre del objeto", baseItem, alturaItem, profundidadItem);
                            servItem.guardar_item(username, item);
                            break;
                        case 4: System.out.println("Configuración\n ");
                            //El usuario debe confirmar la contraseña para cambiar datos
                            System.out.println("Confirme contraseña:");
                            String passwordconfirme = lector.nextLine();
                                if(passwordconfirme.equals(password)){

                                    //Falta la parte de cambiar datos en la BBDD
                                    System.out.println("""
                                                       | ¿Que desea actualizar?       |  
                                                       | 1.Username     2.Contraseña  |
                                                       | 3.Email        4.Nombres     |""");
                                    int datoactualizar=lector.nextInt();
                                    lector.nextLine();
                                    do{
                                        switch (datoactualizar) {
                                            case 1:
                                                System.out.println("Ingrese el nuevo username");
                                                String newusername = lector.nextLine();
                                                servUsuario.actualizar_usuario(newusername, username);
                                                System.out.println("Actualización exitosa");
                                                datoactualizar= 70;
                                                break;
                                            case 2:
                                                System.out.println("Ingrese la nueva contraseña");
                                                String newcontraseña = lector.nextLine();
                                                servUsuario.actualizar_password(newcontraseña, password);
                                                System.out.println("Actualización exitosa");
                                                datoactualizar= 70;
                                                break;
                                            case 3:
                                                System.out.println("Ingrese el nuevo email");
                                                String newemail = lector.nextLine();
                                                servUsuario.actualizar_email(newemail, servUsuario.getEmail(username));
                                                System.out.println("Actualización exitosa");
                                                datoactualizar= 70;
                                                break;
                                            case 4:
                                                System.out.println("Ingrese sus nuevos nombres");
                                                String newnombres = lector.nextLine();
                                                servUsuario.actualizar_nombres(newnombres, servUsuario.getNombres(username));
                                                System.out.println("Actualización exitosa");
                                                datoactualizar= 70;
                                                break;
                                            case 5:
                                                System.out.println("Saliendo...");
                                                datoactualizar= 70;
                                                break;
                                            default:
                                                System.out.println("El valor digitado no corresponde a las opciones consideradas... ");
                                                break;
                                        }
                                    }while(datoactualizar>0 && datoactualizar<5);
                                break;
                                }
                        case 5: System.out.println("\nSeccion en construccion, disculpe las molestsias\n");
                            break;
                        case 6: System.out.println("\nSeccion en construccion, disculpe las molestias.\n ");
                            break;
                        case 7: System.out.println("Saliendo...");
                                w=0;
                                break;
                        default: System.out.println("No deberías estar viendo esto u:");
                            break;
                    }
                }
            }else if (opcion == 2) {
                
                System.out.println("Ingresa el username con el que vas a acceder a tu cuenta");            
                String username = lector.nextLine();

                int x = 0;
                String password = null;            
                // Ciclo que se repite hasta que la contraseña sea confirmada correctamente
                while (x == 0) {
                    System.out.println("Ingresa tu contraseña");
                    String contraseña = lector.nextLine();

                    System.out.println("Confirma tu contraseña");
                    String contraseñaConfirm = lector.nextLine();

                    if (contraseña.equals(contraseñaConfirm)) {
                        password = contraseñaConfirm;
                        x++;
                        System.out.println("Confirmada correctamente");
                    } else {
                        System.out.println("No coinciden las contraseñas");
                    }
                }

                System.out.println("Ingresa tu correo para recuperar tu cuenta en caso de que olvides tu usuario y/o contraseña");
                String email = lector.nextLine();

                System.out.println("Por último, ingresa tus nombres completos");
                String name = lector.nextLine();
                
                // Creamos una instancia de la clase Uusario para el nuevo usuario
                Usuario newuser = new Usuario(username, password, email, name);
                servUsuario.guardar_usuario(newuser);

                System.out.println("Todo listo, ingresaste los siguientes datos:\n" + newuser + "\nYa puedes ingresar a tu cuenta.");

                // Guardar el nuevo usuario en Firebase
                
            }
            else if (opcion==3){
                System.out.println("\nGracias por utilizar Roomade :)\n");
                continuar = false;
            }
            else{//En caso de que el usuario no se encuentre en la BBDD
                    System.out.println("El usuario que ingresaste no está"
                            + " registrado, dirígete a la opcion Sing up");
            } 
        }    
    }

}
