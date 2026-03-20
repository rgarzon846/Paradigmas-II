import java.util.Random;

public class Usuario extends Prestamo
{
    // instance variables - replace the example below with your own
    private
    int id;
    String nombre;
    Random rand = new Random();

    /**
     * Constructor for objects of class Usuario
     */
    public Usuario()
    {
        // initialise instance variables
        id = 0;
        nombre = "";
    }
    public Usuario(String nombre)
    {
        // initialise instance variables
        this.nombre = nombre;
        this.id = rand.nextInt(9000) + 1000;
    }
    
    public int getId(){
        return id;
    }
}