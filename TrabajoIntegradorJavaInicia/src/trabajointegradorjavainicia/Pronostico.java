/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajointegradorjavainicia;

/**
 *
 * @author aleai
 */
public class Pronostico {
    private Partido partido;
    private ResultadoEnum resultado;
    
    public Pronostico(Partido partido, ResultadoEnum resultado){
        this.partido=partido;
        this.resultado=resultado;
    }

    /**
     * @return the partido
     */
    public Partido getPartido() {
        return partido;
    }

    /**
     * @return the resultado
     */
    public ResultadoEnum getResultado() {
        return resultado;
    }
}
