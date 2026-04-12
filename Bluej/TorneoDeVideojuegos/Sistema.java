
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
    ArrayList<Competencia> historial_de_competencias;
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
        historial_de_competencias = new ArrayList<>();
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
    int getRondas(){
        return cant_rondas;
    }

    void ingresarJugadores()
    {
        System.out.println("Ingrese la cantidad de rondas que tendra cada competencia por favor: ");
        cant_rondas = terminal.nextInt();
        terminal.nextLine();
        cant_jugadores = (int) Math.pow(2, cant_rondas);

        for(int i = 0; i < cant_jugadores; i++){
            jugadores.add(cargarJugador(i));
        }
        System.out.println("Se completo el cupo de inscripciones del torneo!");

    }

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

    private boolean comprobarRepetidos(int dni){
        for(Jugador j : jugadores){
            if(j.getDni() == dni){
                System.out.println("Se ingreso un DNI repetido, vuelva a ingresar");
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
        terminal.nextLine();
        nombre_juego = terminal.nextLine();
        Competencia competencia = new Competencia(nombre_juego, jugadores);
        competencia.realizarPartidas();
        historial_de_competencias.add(competencia);
    }

    void imprimirGanadoresDeCadaJuego(){
        int i = 1;
        System.out.println("Los juegos que se han jugado son: ");
        for(Competencia c : historial_de_competencias){
            System.out.println(i + ") " + c.getNombre_juego());
            i++;
        }
        System.out.println("Los ganadores de cada juego son: ");
        i = 1;
        for(Competencia c : historial_de_competencias){
            System.out.println(i + ") " + c.getGanadorCompetencia().getNombre());
            i++;
        }
    }

    void mostrarHistorialDePartidas(){
        System.out.println("El historial de partidas es: ");
        for(Competencia c : historial_de_competencias){
            System.out.println(i + ") " + c.getNombre_juego());
            i++;
        }
        System.out.println("Los ganadores de cada juego son: ");
        i = 1;
        for(Competencia c : historial_de_competencias){
            System.out.println(i + ") " + c.getGanadorCompetencia().getNombre());
            i++;
        }
    }

    public void buscarJugador(){
        Jugador jugador_encontrado = null;
        System.out.println("Nombre del jugador que desea buscar: ");
        terminal.nextLine();
        String buscar = terminal.nextLine();
        buscar = buscar.toLowerCase().trim();
        for(Jugador j : jugadores){
            if(j.getNombre().equals(buscar)){
                jugador_encontrado = j;
                break;
            }
        }
        if(jugador_encontrado == null) System.out.println("No se encontro el jugador");
        else System.out.println(jugador_encontrado.getNombre() + "DNI: " + 
                jugador_encontrado.getDni() + "Puntaje: " + 
                jugador_encontrado.getPuntaje() + "Partidas: " + 
                jugador_encontrado.getCant_partidas());
    }

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
            System.out.println("Nombre" + j.getNombre() + "DNI: " + j.getDni() + "Puntaje: " + j.getPuntaje() + "Partidas: " + j.getCant_partidas());
        }
    }
}