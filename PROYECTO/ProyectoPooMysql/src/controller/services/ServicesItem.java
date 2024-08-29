package controller.services;

import static com.mysql.cj.conf.PropertyKey.USER;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import controller.implement.Item;
import controller.implement.Molde;
import java.util.ArrayList;
import java.util.List;
import model.Mysql_BD;
import java.sql.ResultSet;


public class ServicesItem extends Services {
    private final String tabla_Item = "item";
    private static List<Item> items = new ArrayList<>();
    private static List<Item> itemsRoom = new ArrayList<>();
    
    
    //Instanciamos Los conectores de la base de datos.
    
    Mysql_BD bd = new Mysql_BD();
    Connection con = bd.conectar();
    
    public static List<Item> getItems() {
        return items;
    }

    public static void setItems(Item item) {
        items.add(item);
    }

    public static List<Item> getItemsRoom() {
        return itemsRoom;
    }
    
     public List<Item> getItemsByUsuario(String usuario) {
        List<Item> itemsDb = new ArrayList<>();
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

                Item itemsito = new Item(nombre, base, altura, profundidad);
                itemsDb.add(itemsito);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return itemsDb;
    }
    
    
    
    public void guardar_item(String Username, Item item ){
        try{
            PreparedStatement consulta;
            double Base = item.getBase(), Altura = item.getAltura(), Profundidad = item.getProfundidad();
            String nombreObjeto= item.getNombreObjeto();
            
            consulta = con.prepareStatement("INSERT INTO " + this.tabla_Item + "(usuario, nombre, base, altura, profundidad) VALUES(?, ?, ?, ?, ?)");
            consulta.setString(1, Username);
            consulta.setString(2, nombreObjeto);
            consulta.setDouble(3, Base);
            consulta.setDouble(4, Altura);
            consulta.setDouble(5, Profundidad);
            
            consulta.executeUpdate();
            
            System.out.println("Se guardaron los datos correctamente. ");
        } 
        catch (SQLException ex){
            System.out.println("Hubo un error al momento de guardar los datos. " + ex.getMessage());
        }
    }
    
    @Override
    public void ActualizarDatos(String Usuario, Molde objeto) {
        try{
            PreparedStatement consulta;
            
            double Base = objeto.getBase(), Altura =  objeto.getAltura(), Profundidad = objeto.getProfundidad();
            String nombreObjeto= objeto.getNombreObjeto();
            
            consulta = con.prepareStatement("UPDATE " + this.tabla_Item + " SET base = ? WHERE usuario = ?");
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
    
}