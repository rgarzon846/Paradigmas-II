
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

    /**
     * Constructor para el objeto de la clase Jugador
     */
    public Jugador(String nombre, int dni)
    {
        this.nombre = nombre;
        this.dni = dni;
        puntaje = 0;
        cant_partidas = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public 
    void setNombre(String nombre)
    {
        // put your code here
        this.nombre = nombre;
    }
    void setDni(int dni){
        this.dni = dni;
    }
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
}