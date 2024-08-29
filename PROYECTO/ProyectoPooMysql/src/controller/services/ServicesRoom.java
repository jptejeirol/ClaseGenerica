package controller.services;

import controller.implement.Item;
import controller.implement.Room;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Mysql_BD;

public class ServicesRoom{
    private final String tabla_Diseño = "room";
    Mysql_BD bd = new Mysql_BD();
    private static List<Room> rooms= new ArrayList<>();

    public static List<Room> getRooms() {
        return rooms;
    }
    
    public static void setRooms(Room room) {
        rooms.add(room);
    }
    
    
    
    Connection con = bd.conectar();
    
    public void guardar_diseño(String username, Room room){
        try{
            PreparedStatement consulta;
            double Base = room.getBase(), Altura = room.getAltura(), Profundidad = room.getProfundidad();
            String nombreObjeto= room.getNombreObjeto();
            
            consulta = con.prepareStatement("INSERT INTO " + this.tabla_Diseño + "(usuario, nombre, base, altura, profundidad) VALUES(?, ?, ?, ?, ?)");
            consulta.setString(1, username);
            consulta.setString(2, nombreObjeto);
            consulta.setDouble(3, Base);
            consulta.setDouble(4, Altura);
            consulta.setDouble(5, Profundidad);
            consulta.executeUpdate();
            
            System.out.println("Se guardaron los datos correctamente. ");
        } 
        catch (SQLException ex){
            System.out.println("Hubo un error al momento de guardar los datos. "+ ex.getMessage());
        }
    }
    
    public List<Room> getRoomsByUsuario(String usuario) {
        List<Room> roomsDb = new ArrayList<>();
        String query = "SELECT * FROM item WHERE usuario = ?";

        try (Connection conn = con;
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, usuario);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                String nombre = rs.getString("nombre");
                float base = rs.getFloat("base");
                float altura = rs.getFloat("altura");
                float profundidad = rs.getFloat("profundidad");

                Room roomsito = new Room(nombre, base, altura, profundidad);
                roomsDb.add(roomsito);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return roomsDb;
    }
    
}