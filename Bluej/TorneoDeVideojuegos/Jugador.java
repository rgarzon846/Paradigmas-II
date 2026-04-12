
/**
 * Representa un jugador dentro del torneo.
 * Permite almacenar su nombre, puntaje y partidas jugadas.
 * @author Farid 
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
    /**
     * Constructor para el objeto de la clase Jugador
     * @param nombre nickname del jugador
     * @param dni del jugador
     */
    Jugador(String nombre, int dni)
    {
        this.nombre = nombre;
        this.dni = dni;
        puntaje = 0;
        cant_partidas = 0;
        emparejado = false;
        eliminado = false;
    }

    public 
    /**
     * Retorna el nombre del jugador
     * @return nombre
    */
    String getNombre(){
        return nombre;
    }
    /**
     * Retorna el DNI del jugador
     * @return dni
     */
    int getDni(){
        return dni;
    }
    /**
     * Retorna el puntaje del jugador
     * @return puntaje
     */
    int getPuntaje(){
        return puntaje;
    }
    /**
     * 
     */
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