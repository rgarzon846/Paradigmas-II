
/**
 * Almacena los datos de la partida jugada.
 * Asigna puntaje y numero de partidas jugadas a los jugadores
 * 
 * @author Rocio 
 * @version 1.0
 */
import java.util.Random;
public class Partida
{
    private 
    Jugador ganador;
    String nombre_juego;
    Jugador jugador1;
    Jugador jugador2;
    /**
     * Constructor para objetos de la clase Partida
     * @param jugador1 almacena los datos de un competidor
     * @param jugador2 almacena los datos de otro competidor
     */
    public Partida(Jugador jugador1, Jugador jugador2, String nombre_juego)
    {
        ganador = new Jugador();
        nombre_juego = nombre_juego;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }
    
    public 
    /**
     * Determina el puntaje de cada ganador
     */
    void asignarPuntajes(){
        Random num = new Random();
        int jugador = num.nextInt(3);
        if(jugador == 1){
            ganador = jugador1;
            jugador1.modificarPuntaje(1);
            jugador2.setEliminado(true);
        }else if(jugador == 2){
            ganador = jugador2;
            jugador2.modificarPuntaje(1);
            jugador1.setEliminado(true);
        }else{
            System.out.println("Ha resultado en empate! Vuelvan a enfrentarse...");
            casoEmpate();
        }
        jugador1.modificarCant_partidas(1);
        jugador2.modificarCant_partidas(1);
    }
    /**
     * Determina el ganador en caso de que haya habido un empate
     */
    private void casoEmpate(){
        Random num = new Random();
        int jugador = num.nextInt(2);
        if(jugador == 1){
            ganador = jugador1;
            jugador1.modificarPuntaje(1);
            jugador2.setEliminado(true);
        }else{
            ganador = jugador2;
            jugador2.modificarPuntaje(1);
            jugador1.setEliminado(true);
        }
    }
    
    Jugador getGanador(){
        return ganador;
    }
    
}