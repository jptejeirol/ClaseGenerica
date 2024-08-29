/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.implement;

/**
 *
 * @author juanp
 */
public class RoomJFX {
    
    private String nombre;
    private String hash;
    
    public RoomJFX(String nombre, String hash){
        this.nombre = nombre;
        this.hash = hash;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getHash(){
        return hash;
    }    
    
}
