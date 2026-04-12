
/**
 * Write a description of class Partida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
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
    void setNombre_juego(String nombre_juego)
    {
        // put your code here
        this.nombre_juego = nombre_juego;
    }
    void asignarPuntajes(){
        Random num = new Random();
        int jugador = num.nextInt(3);
        if(jugador == 1){
            ganador = jugador1;
            jugador1.modificarPuntaje(1);
        }else if(jugador == 2){
            ganador = jugador2;
            jugador2.modificarPuntaje(1);
        }else{
            
        }
    }
    
}