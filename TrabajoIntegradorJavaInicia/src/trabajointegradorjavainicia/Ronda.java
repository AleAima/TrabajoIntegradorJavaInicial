/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajointegradorjavainicia;


/**
 *
 * @author aleai
 */
public class Ronda {
    private String ronda;
    private Partido [] partidos;
    
    public Ronda(String ronda){
        this.ronda=ronda;
        this.partidos=new Partido[2];
    }
    
    public void AgregarRonda(Partido[]partidos){
        this.partidos=partidos;
    }
    
    public String getRonda() {
        return ronda;
    }
    
       public void setRonda(String ronda) {
        this.ronda=ronda;
    }

    public Partido [] getPartidos() {
        return partidos;
    }
    
    
}
