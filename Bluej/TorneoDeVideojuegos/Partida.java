
/**
 * Write a description of class Partida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;
public class Partida
{
    // instance variables - replace the example below with your own
    private 
    Jugador ganador;
    String nombre_juego;
    Jugador jugador1;
    Jugador jugador2;
    /**
     * Constructor for objects of class Partida
     */
    public Partida(Jugador jugador1, Jugador jugador2, String nombre_juego)
    {
        // initialise instance variables
        
        ganador = new Jugador();
        nombre_juego = nombre_juego;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public 
   
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
            
        }else{
            casoEmpate();
        }
        jugador1.modificarCant_partidas(1);
        jugador2.modificarCant_partidas(1);
    }
    void casoEmpate(){
        Random num = new Random();
        int jugador = num.nextInt(2);
        if(jugador == 1){
            ganador = jugador1;
        }else{
            ganador = jugador2;
        }
    }
    
    Jugador getGanador(){
        return ganador;
    }
    
}