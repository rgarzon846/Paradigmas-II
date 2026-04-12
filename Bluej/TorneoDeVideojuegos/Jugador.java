
/**
 * Representa un jugador dentro del torneo.
 * Permite almacenar su nombre, puntaje y partidas jugadas.
 * @author Rocio 
 * @version 1.0
 */
public class Jugador
{
    // instance variables - replace the example below with your own
    private 
    String nombre;
    int dni;
    int puntaje;
    int cant_partidas;
    boolean emparejado;
    boolean eliminado;
    /**
     * Constructor para el objeto de la clase Jugador
     */
    public 
    Jugador(){
        nombre = "";
        dni = 0;
        puntaje = 0;
        cant_partidas = 0;
        emparejado = false;
        eliminado = false;
    }
    
    Jugador(String nombre, int dni)
    {
        this.nombre = nombre;
        this.dni = dni;
        puntaje = 0;
        cant_partidas = 0;
        emparejado = false;
        eliminado = false;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public 
    
    String getNombre(){
        return nombre;
    }
    int getDni(){
        return dni;
    }
    int getPuntaje(){
        return puntaje;
    }
    int getCant_partidas(){
        return cant_partidas;
    }
    void modificarPuntaje(int puntaje){
        this.puntaje += puntaje;
    }
    void modificarCant_partidas(int cant_partidas){
        this.cant_partidas += cant_partidas;
    }
    void setEmparejado(boolean emparejado){
        this.emparejado = emparejado;
    }
    void setEliminado(boolean eliminado){
        this.eliminado = eliminado;
    }
    boolean getEmparejado(){
        return emparejado;
    }
    boolean getEliminado(){
        return eliminado;
    }
}