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

    public Partido getPartido() {
        return partido;
    }

    public ResultadoEnum getResultado() {
        return resultado;
    }
    
    public String [] formatoDeCSV(ResultadoEnum resultado){
        String []datos=new String[5];
  
        if(resultado.equals(ResultadoEnum.GANA_EQUIPO_1)){
            datos[0]=partido.getEquipoUno().getNombre();
            datos[1]="X";
            datos[2]=" ";
            datos[3]=" ";
            datos[4]=partido.getEquipoDos().getNombre();   
        }
        if(resultado.equals(ResultadoEnum.GANA_EQUIPO_2)){
            datos[0]=partido.getEquipoUno().getNombre();
            datos[1]=" ";
            datos[2]=" ";
            datos[3]="X";
            datos[4]=partido.getEquipoDos().getNombre();   
        }
         if(resultado.equals(ResultadoEnum.EMPATE)){
            datos[0]=partido.getEquipoUno().getNombre();
            datos[1]=" ";
            datos[2]="X";
            datos[3]=" ";
            datos[4]=partido.getEquipoDos().getNombre();   
        }
        
        
        return datos;
    }
                
    
        
}
