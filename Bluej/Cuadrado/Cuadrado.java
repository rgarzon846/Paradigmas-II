
/**
 * Write a description of class Cuadrado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cuadrado
{
    // instance variables - replace the example below with your own
    private 
    int lado;

    /**
     * Constructor for objects of class Cuadrado
     */
    public Cuadrado()
    {
        // initialise instance variables
        lado = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public 
    
    void setL1(int lado)
    {
        // put your code here
        this.lado = lado;
    }
    
    void Perimetro(){
        int perimetro = lado*4;
        System.out.println("El perimetro del cuadrado es: " + perimetro);
    }
    void Area(){
        int area = lado*lado;
        System.out.println("El area del cuadrado es: " + area);
    }
}