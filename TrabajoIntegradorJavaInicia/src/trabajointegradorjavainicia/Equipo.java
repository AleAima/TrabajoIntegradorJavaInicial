/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajointegradorjavainicia;

/**
 *
 * @author aleai
 */
public class Equipo {
    private String nombre;
    private String descripcion;
    
    public Equipo(String nombre, String descripcion){
        this.nombre=nombre;
        this.descripcion=descripcion;
    }
    
    public Equipo(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
