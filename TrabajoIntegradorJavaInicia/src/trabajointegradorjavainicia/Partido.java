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
    

    // retona el resultado del partido
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
    
    public Equipo getEquipoUno() {
        return equipoUno;
    }
    
     public void setEquipoUno(Equipo equipo) {
        this.equipoUno=equipo;
    }
    public Equipo getEquipoDos() {
        return equipoDos;
    }
    
    public void setEquipoDos(Equipo equipo) {
        equipoDos=equipo;
    }

    public int getGolesEquipoUno() {
        return golesEquipoUno;
    }

    public void setGolesEquipoUno(int golesEquipoUno) {
        this.golesEquipoUno = golesEquipoUno;
    }

    public int getGolesEquipoDos() {
        return golesEquipoDos;
    }

    public void setGolesEquipoDos(int golesEquipoDos) {
        this.golesEquipoDos = golesEquipoDos;
    }
    
    //Metodo Para que me devuta el array de string que necesito para 
    //guardar en el formato CSV
    public String [] formatoDeCSV(){
        String []datos={equipoUno.getNombre(),String.valueOf(golesEquipoUno),
                        String.valueOf(golesEquipoDos),equipoDos.getNombre()};
                        
        return datos;
    }
}
