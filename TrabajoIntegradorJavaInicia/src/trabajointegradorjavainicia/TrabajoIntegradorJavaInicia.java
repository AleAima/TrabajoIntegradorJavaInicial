/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajointegradorjavainicia;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aleai
 */
public class TrabajoIntegradorJavaInicia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombreArchivo="Ronda.csv";
        Partido [] partidos=new Partido [2];
        
        
        Equipo equipoUno= new Equipo("Argentina");
        Equipo equipoDos= new Equipo("Arabia Saudita");
        Partido partidoUno= new Partido (equipoUno, 3, 2, equipoDos);
        
        partidos[0]=partidoUno;
        
        Equipo equipoTres= new Equipo("Polonia");
        Equipo equipoCuatro= new Equipo("Mexico");
        Partido partidoDos= new Partido (equipoTres, 1, 1, equipoCuatro);
        
        partidos[1]=partidoDos;
        
        ArchivoCSV.CrearPartidosCSV(nombreArchivo,partidos);
        
        String nombreArchivoPronostico="Pronostico_Persona.csv";
        Pronostico [] persona= new Pronostico[2];
        
        
        Pronostico pronosticoPartidoUno= new Pronostico(partidoUno,ResultadoEnum.GANA_EQUIPO_1);
        Pronostico pronosticoPartidoDos= new Pronostico(partidoDos,ResultadoEnum.EMPATE);
        
        persona[0]=pronosticoPartidoUno;
        persona[1]=pronosticoPartidoDos;
        
        ArchivoCSV.CrearPronosticosCSV(nombreArchivoPronostico, persona);
        
        List<Pronostico> pronosticos=ArchivoCSV.ImportarPronosticoCSV(nombreArchivoPronostico);
        List<Partido> resultados=ArchivoCSV.ImportarResultadosCSV(nombreArchivo);
        int acerto=0;
        for(int indice=0; indice<pronosticos.size();indice++){
            if (pronosticos.get(indice).getResultado().equals(resultados.get(indice).decirResulado())){
                acerto++;
            }
        }
        System.out.println("Cantidad de Aciertos= " + acerto);
    }
    
}
