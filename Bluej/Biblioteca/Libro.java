
/**
 * Write a description of class Libro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Libro
{
    // instance variables - replace the example below with your own
    private 
    String titulo;
    String autor;
    String estado;

    /**
     * Constructor for objects of class Libro
     */
    public 
    Libro()
    {
        // initialise instance variables
        titulo = "";
        autor = "";
        estado = "";
    }
    Libro(String titulo, String autor, String estado)
    {
        // initialise instance variables
        this.titulo = titulo;
        this.autor = autor;
        this.estado = estado;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public 
    void setEstado(String estado)
    {
        // put your code here
        this.estado = estado;
    }
    String getEstado(){
        return estado;
    }
}