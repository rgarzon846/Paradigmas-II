
/**
 * Write a description of class Jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
     * Constructor for objects of class Jugador
     */
    public Jugador()
    {
        // initialise instance variables
        nombre = "";
        dni = 0;
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