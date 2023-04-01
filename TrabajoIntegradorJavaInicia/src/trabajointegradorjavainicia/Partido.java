/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajointegradorjavainicia;

/**
 *
 * @author aleai
 */
public class Partido {
    private Equipo numeroUno;
    private Equipo NumeroDos;
    private int golesEquipoUno;
    private int golesEquipoDos;
    
    public Partido(Equipo equipoUno, Equipo equipoDos){
        this.numeroUno=equipoUno;
        this.NumeroDos=equipoDos;
        this.golesEquipoUno=0;
        this.golesEquipoDos=0;
    }

    
    public ResultadoEnum decirResulado(){
        
        if(golesEquipoUno>golesEquipoDos){
            return ResultadoEnum.GANA_EQUIPO_1;
        }
        else if(golesEquipoDos>golesEquipoUno){
            return ResultadoEnum.GANA_EQUIPO_2;
        }
        else{
            return ResultadoEnum.EMPATE;
        }        
    }
    /**
     * @return the numeroUno
     */
    public Equipo getNumeroUno() {
        return numeroUno;
    }

    /**
     * @return the NumeroDos
     */
    public Equipo getNumeroDos() {
        return NumeroDos;
    }

    /**
     * @return the golesEquipoUno
     */
    public int getGolesEquipoUno() {
        return golesEquipoUno;
    }

    /**
     * @param golesEquipoUno the golesEquipoUno to set
     */
    public void setGolesEquipoUno(int golesEquipoUno) {
        this.golesEquipoUno = golesEquipoUno;
    }

    /**
     * @return the golesEquipoDos
     */
    public int getGolesEquipoDos() {
        return golesEquipoDos;
    }

    /**
     * @param golesEquipoDos the golesEquipoDos to set
     */
    public void setGolesEquipoDos(int golesEquipoDos) {
        this.golesEquipoDos = golesEquipoDos;
    }
    
    
}
