
/**
 * Write a description of class Usuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Usuario
{
    // instance variables - replace the example below with your own
    private String texto;

    /**
     * Constructor for objects of class Usuario
     */
    public Usuario()
    {
        // initialise instance variables
        texto = "";
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public 
    void setTexto(String texto)
    {
        // put your code here
        this.texto = texto;
    }
    String getTexto(){
        return texto;
    }
}