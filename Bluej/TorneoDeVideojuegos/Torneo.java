
/**
 * Torneo de administracion de torneo de videojuegos.
 * Permite ingresar jugadores, buscar jugadores, ver estadisticas de jugadores y listar jugadores.
 * @author Juan, Rocio 
 * @version 1.0
 */
import java.util.*;
import java.io.*;

public class Torneo
{
    private 
    ArrayList<Jugador> jugadores;
    ArrayList<VideoJuego> historial_de_VideoJuegos;
    int cant_jugadores;
    int cant_rondas;
    Scanner terminal;
    /**
     * Constructor clase Torneo
    */
    public Torneo()
    {
        
        jugadores = new ArrayList<>();
        historial_de_VideoJuegos = new ArrayList<>();
        cant_jugadores = 0;
        cant_rondas = 0;
        terminal = new Scanner(System.in);
    }

    /**
     * Muestra la cantidad de rondas elegidas para la VideoJuego
     */
    public 
    int getRondas(){
        return cant_rondas;
    }
    /**
     * Permite ingresar una lista de jugadores, determina el cupo de inscripciones
     */
    void ingresarJugadores()
    {
        try{
        System.out.println("Ingrese la cantidad de rondas que tendra cada VideoJuego por favor: ");
        cant_rondas = terminal.nextInt();
        terminal.nextLine();
        cant_jugadores = (int) Math.pow(2, cant_rondas);

        for(int i = 0; i < cant_jugadores; i++){
            jugadores.add(cargarJugador(i));
        }
        System.out.println("Se completo el cupo de inscripciones del torneo!");
    }catch(IOException e){
        System
    }

    }
    /**
     * Añade el jugador con sus atributos a la lista.
     * @param i indice de jugador en la lista
     * @return jugador objeto de tipo Jugador con sus atributos cargados
     */
    private Jugador cargarJugador(int i){
        String nombre = "";
        int dni = 0;
        System.out.println("Ingrese el nombre del jugador" + i + ": ");
        nombre = terminal.nextLine();
        nombre = nombre.toLowerCase().trim();
        do{
            System.out.println("Ingrese el dni del jugador" + i + ": ");
            dni = terminal.nextInt();
        }while(comprobarRepetidos(dni));
        terminal.nextLine();
        Jugador jugador = new Jugador(nombre, dni);
        return jugador;
    }
    /**
     * Verifica que no se este ingresando un jugador repetido
     * @param dni atributo del jugador irrepetible
     * @return {code: true} si el dni ya fue ingresado antes
     * @return {code: false} si el dni no fue ingresado antes
     */
    private boolean comprobarRepetidos(int dni){
        for(Jugador j : jugadores){
            if(j.getDni() == dni){
                System.out.println("Se ingreso un DNI repetido, vuelva a ingresar");
                return true;
            }
        }
        return false;
    }
    /**
     * Imprime los jugadores inscriptos en formato lista
     */
    void listarJugadores(){
        System.out.println("La lista de jugadores inscriptos es: ");
        for(Jugador j : jugadores){
            System.out.println(j.getNombre() + "        DNI: " + 
                j.getDni() + "      Puntaje: " + 
                j.getPuntaje() + "      Partidas: " + 
                j.getCant_partidas());        
            }
    }
    /**
     * Permite crear la VideoJuego del juego que se desee
     */
    void iniciarVideoJuego(){
        String nombre_juego = " ";
        System.out.println("Ingrese el nombre del juego a jugarse: ");
        nombre_juego = terminal.nextLine();
        VideoJuego video_juego = new VideoJuego(nombre_juego, jugadores, cant_rondas);
        video_juego.realizarPartidas();
        historial_de_VideoJuegos.add(video_juego);
    }
    /**
     * Imprime el ganador de cada VideoJuego en formato lista
     */
    void imprimirGanadoresDeCadaJuego(){
        for(VideoJuego c : historial_de_VideoJuegos){
            System.out.println("Juego jugado: " + c.getNombre_juego() + "       ganador: " + c.getGanadorVideoJuego().getNombre() + " dni: " + c.getGanadorVideoJuego().getDni());
        }
    }
    /**
     * Imprime cada partida de la VideoJuego y su ganador en formato lista
     */
    void mostrarHistorialDePartidas(){
        int i = 1;
        for(VideoJuego c : historial_de_VideoJuegos){
            System.out.println("Partidas de la VideoJuego: " + c.getNombre_juego());
            for(Partida p : c.getPartidas()){
            System.out.println("Nro de partida: " + i + ", ganador de la partida: " + p.getGanador().getNombre() + " DNI: " + p.getGanador().getDni());
            i++;
        }
        i = 1;
    }
    }
    /**
     * Permite buscar un jugador por su nombre
     * Imprime el jugador encontrado
     */
    public void buscarJugador(){
        Jugador jugador_encontrado = null;
        System.out.println("Nombre del jugador que desea buscar: ");
        String buscar = terminal.nextLine();
        buscar = buscar.toLowerCase().trim();
        for(Jugador j : jugadores){
            if(j.getNombre().equals(buscar)){
                jugador_encontrado = j;
                break;
            }
        }
        if(jugador_encontrado == null) System.out.println("No se encontro el jugador");
        else System.out.println(jugador_encontrado.getNombre() + "      DNI: " + 
                jugador_encontrado.getDni() + "     Puntaje: " + 
                jugador_encontrado.getPuntaje() + "     Partidas: " + 
                jugador_encontrado.getCant_partidas());
    }
    /**
     * Imprime la lista de jugadores segun sus puntos, de mayor a menor, en formato lista
     */
    public void mostrarRanking(){
        for (int i = 0; i < jugadores.size() - 1; i++) {
            for (int j = 0; j < jugadores.size() - i - 1; j++){
                if (jugadores.get(j).getPuntaje() < jugadores.get(j + 1).getPuntaje()) {
                    Jugador temp = jugadores.get(j);
                    jugadores.set(j, jugadores.get(j + 1));
                    jugadores.set(j + 1, temp);
                }
            }
        }
        for(Jugador j : jugadores){
            System.out.println("Nombre:     " + j.getNombre() + "     DNI: " + j.getDni() + "     Puntaje: " + j.getPuntaje() + "     Partidas: " + j.getCant_partidas());
        }
    }
}