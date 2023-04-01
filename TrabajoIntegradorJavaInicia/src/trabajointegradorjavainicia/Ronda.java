/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajointegradorjavainicia;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aleai
 */
public class Ronda {
    private String ronda;
    private List<Partido> partidos;
    
    public Ronda(String Ronda){
        this.ronda=ronda;
        this.partidos=new ArrayList<Partido>();
    }
    
    public void AgregarPartido(Equipo equipoUno, Equipo equipoDos){
        Partido partido= new Partido(equipoUno,equipoDos);
        partidos.add(partido);
    }

    /**
     * @return the ronda
     */
    public String getRonda() {
        return ronda;
    }

    /**
     * @return the Partidos
     */
    public List<Partido> getPartidos() {
        return partidos;
    }
    
    
}
