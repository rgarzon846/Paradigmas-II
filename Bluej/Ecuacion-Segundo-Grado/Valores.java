
/**
 * Write a description of class Valores here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Valores
{
    // instance variables - replace the example below with your own
    private 
    double r1;
    double r2;

    /**
     * Constructor for objects of class Valores
     */
    public 
    Valores(double r1, double r2)
    {
        // initialise instance variables
       this.r1 = r1;
       this.r2 = r2;
    }
    Valores(double r1){
        this.r1 = r1;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public 
    double getR1(){
        return r1;
    }
    double getR2(){
        return r2;
    }
}