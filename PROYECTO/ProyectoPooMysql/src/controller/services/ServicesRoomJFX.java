package controller.services;

import controller.implement.RoomJFX;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Mysql_BD;

public class ServicesRoomJFX {
    private final String tabla_Diseño = "rooms";    
    Mysql_BD bd = new Mysql_BD();
    private static List<RoomJFX> roomsJFX = new ArrayList<>();

    public static List<RoomJFX> getRooms() {
        return roomsJFX;
    }

    public static void setRooms(RoomJFX room) {
        roomsJFX.add(room);
    }

    // Eliminar la conexión persistente
    // Connection con = bd.conectar();

    public void guardar_Room(String username, RoomJFX room) {
        try (Connection con = bd.conectar(); // Crear la conexión aquí
             PreparedStatement consulta = con.prepareStatement("INSERT INTO " + this.tabla_Diseño + "(usuario, nombre, hash) VALUES(?, ?, ?)")) {
             
            String nombreObjeto = room.getNombre();
            String hash = room.getHash();
            
            consulta.setString(1, username);
            consulta.setString(2, nombreObjeto);
            consulta.setString(3, hash);
            consulta.executeUpdate();
            
            System.out.println("Se guardaron los datos correctamente.");
        } catch (SQLException ex) {
            System.out.println("Hubo un error al momento de guardar los datos. " + ex.getMessage());
        }
    }

    public List<RoomJFX> getRoomsJFXByUsuario(String usuario) {
        List<RoomJFX> roomsDb = new ArrayList<>();
        String query = "SELECT nombre, hash FROM rooms WHERE usuario = ?";

        try (Connection conn = bd.conectar(); // Crear la conexión aquí
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, usuario);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String hash = rs.getString("hash");

                RoomJFX roomsito = new RoomJFX(nombre, hash);
                roomsDb.add(roomsito);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return roomsDb;
    }
}

