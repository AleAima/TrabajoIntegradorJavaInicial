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
    private Equipo equipoUno;
    private Equipo equipoDos;
    private int golesEquipoUno;
    private int golesEquipoDos;
    
    public Partido(Equipo equipoUno, int golesEquipoUno, int golesEquipoDos, Equipo equipoDos){
        this.equipoUno=equipoUno;
        this.equipoDos=equipoDos;
        this.golesEquipoUno=golesEquipoUno;
        this.golesEquipoDos=golesEquipoDos;
    }
    
        public Partido(Equipo equipoUno, Equipo equipoDos){
        this.equipoUno=equipoUno;
        this.equipoDos=equipoDos;
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
    public Equipo getEquipoUno() {
        return equipoUno;
    }
    

    /**
     * @return the NumeroDos
     */
    public Equipo getEquipoDos() {
        return equipoDos;
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
    
    public String [] formatoDeCSV(){
        String []datos={equipoUno.getNombre(),String.valueOf(golesEquipoUno),
                        String.valueOf(golesEquipoDos),equipoDos.getNombre()};
                        
        return datos;
    }
    
    
}
