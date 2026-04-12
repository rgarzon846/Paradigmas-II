
/**
 * Write a description of class Sistema here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class Sistema
{
    // instance variables - replace the example below with your own
    private 
    ArrayList<Jugador> jugadores;
    HashMap<String, Jugador> competencias;
    int cant_jugadores;
    int cant_rondas;
    Scanner terminal;
    /**
     * Constructor for objects of class Sistema
     */
    public Sistema()
    {
        // initialise instance variables
        jugadores = new ArrayList<>();
        competencias = new HashMap<>();
        cant_jugadores = 0;
        cant_rondas = 0;
        terminal = new Scanner(System.in);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public 
    void ingresarJugadores()
    {
        System.out.println("Ingrese la cantidad de rondas que tendra cada competencia por favor: ");
        cant_rondas = terminal.nextInt();
        cant_jugadores = (int) Math.pow(2, cant_rondas);
        
        for(int i = 0; i < cant_jugadores - 1; i++){
            jugadores.add(cargarJugador());
        }
        
        
    }
    Jugador cargarJugador(){
        String nombre = "";
        int dni = 0;
        System.out.println("Ingrese el nombre del jugador: ");
        nombre = terminal.nextLine();
        do{
        System.out.println("Ingrese el dni del jugador");
        dni = terminal.nextInt();
        }while(comprobarRepetidos(dni));
        Jugador jugador = new Jugador(nombre, dni);
        return jugador;
    }
    boolean comprobarRepetidos(int dni){
        for(Jugador j : jugadores){
            if(j.getDni() == dni){
                return true;
            }
        }
        return false;
    }
    void listarJugadores(){
        System.out.println("La lista de jugadores inscriptos es: ");
        System.out.println("Nombre      DNI     Puntaje     Partidas");
        for(Jugador j : jugadores){
            System.out.println(j);
        }
    }
    
    void iniciarCompetencia(){
        String nombre_juego = " ";
        System.out.println("Ingrese el nombre del juego a jugarse: ");
        nombre_juego = terminal.nextLine();
        Competencia competencia = new Competencia(nombre_juego, jugadores);
        cargarGanador(nombre_juego, competencia.getGanadorCompetencia());
    }
    void cargarGanador(String nombre_juego, Jugador ganador){
        competencias.put(nombre_juego, ganador);
    }
    void imprimirGanadoresDeCadaJuego(){
        int i = 0;
        for(String juego : competencias.keySet()){
            i++;
            System.out.println(i + ") " + juego);
        }
        i = 0;
        for(Jugador ganador: competencias.values()){
            i++;
            System.out.println(i + ") " + ganador.getNombre());
        }
    }
    void mostrarHistorialDePartidas(){
        
    }
}