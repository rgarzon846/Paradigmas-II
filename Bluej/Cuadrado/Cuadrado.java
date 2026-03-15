
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
    int l1;
    int l2;
    int l3;
    int l4;

    /**
     * Constructor for objects of class Cuadrado
     */
    public Cuadrado()
    {
        // initialise instance variables
        l1 = 0;
        l2 = 0;
        l3 = 0;
        l4 = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public 
    
    void setL1(int l1)
    {
        // put your code here
        this.l1 = l1;
    }
    void setL2(int l2){
        this.l2 = l2;
    }
    void setL3(int l3){
        this.l3 = l3;
    }
    void setL4(int l4){
        this.l4 = l4;
    }
    
    void Perimetro(){
        
        System.out.println("El perimetro del cuadrado es: ");
    }
}