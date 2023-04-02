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
        
        
        String nombreArchivo="Ronda.csv"; //Nombre del Archivo a crear
        
        //Lista de partidos para crear una ronda
        List<Partido> partidos=new ArrayList<>();
        
        
        Equipo equipoUno= new Equipo("Argentina"); //Nombre del primer equipo para el partido 1
        Equipo equipoDos= new Equipo("Arabia Saudita"); // Nombre del segundo equipo para el partido 1
     
        //Creo el primer partido
        Partido partidoUno= new Partido (equipoUno, 3, 2, equipoDos);
        
        //Agrego A la Lista el primer Partido
        partidos.add(partidoUno);
        
        //Armo el otro Partido y lo guardo en la pocicion 1
        Equipo equipoTres= new Equipo("Polonia");
        Equipo equipoCuatro= new Equipo("Mexico");
        Partido partidoDos= new Partido (equipoTres, 1, 1, equipoCuatro);
        
       partidos.add(partidoDos);
        
        //LLamo al metodo que crea el archivo CSV 
        ArchivoCSV.CrearPartidosCSV(nombreArchivo,partidos);
        
        //----------------------------Creo un archivo CSV Pronostico-----------------------------//
        
        String nombreArchivoPronostico="Pronostico_Persona.csv";//Nombre de como se va a llamar el archivo CSV
        
        //Creo un array de pronosticos
        List<Pronostico> persona = new ArrayList<>();
        
        //Creo los Pronosticos y los guardo en el array
        Pronostico pronosticoPartidoUno= new Pronostico(partidoUno,ResultadoEnum.GANA_EQUIPO_1);
        Pronostico pronosticoPartidoDos= new Pronostico(partidoDos,ResultadoEnum.EMPATE);
        
        persona.add(pronosticoPartidoUno);
        persona.add(pronosticoPartidoDos);
        
        
        //llamo Al metodo que crea El Archivo CSV con pronostico
        ArchivoCSV.CrearPronosticosCSV(nombreArchivoPronostico, persona);
        
        
        //---------------------------------Leer El Archivo CSV---------------------------------------------//
        
        //Aguardo en una Lista Los Pronosticos del Archivo Leido y los de los resultados de los partidos
        List<Pronostico> pronosticos=ArchivoCSV.ImportarPronosticoCSV(nombreArchivoPronostico);
        List<Partido> resultados=ArchivoCSV.ImportarResultadosCSV(nombreArchivo);
        
        //Recorro los Pronosticos y los partidos para ver los Resultados y los muestro por pantalla 
        int acerto=0;
        for(int indice=0; indice<pronosticos.size();indice++){
            if (pronosticos.get(indice).getResultado().equals(resultados.get(indice).decirResulado())){
                acerto++;
            }
        }
        System.out.println("Cantidad de Aciertos= " + acerto);
    }
    
}
