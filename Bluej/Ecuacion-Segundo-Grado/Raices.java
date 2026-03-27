
/**
 * Write a description of class Raices here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Raices
{
    // instance variables - replace the example below with your own
    private 
    double a;
    double b;
    double c;

    /**
     * Constructor for objects of class Raices
     */
    public Raices(double a, double b, double c)
    {
        // initialise instance variables
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public 
    void obtenerRaices()
    {
        // put your code here
        Valores valores = new Valores(0, 0);
        Calcular(
        
    }
    
    void obtenerRaiz(){
        double r1 = 0;
        double r2 = 0;
        Calcular(r1, r2);
    }
    
    private double getDiscriminante(){
        return (Math.pow(b, 2) - (4*a*c));
    }
    
    private boolean tieneRaices(){
        if(getDiscriminante() > 0){
            return true;
        }else{
            return false;
        }
    }
    
    private boolean tieneRaiz(){
        if(getDiscriminante() == 0){
            return true;
        }else{
            return false;
        }
    }
    
    private void Calcular(Valores valores){
        if(tieneRaices()){
            r1 = ((-b + Math.sqrt((Math.pow(b, 2) - (4*a*c))))/(2*a));
            r2 = ((-b - Math.sqrt((Math.pow(b, 2) - (4*a*c))))/(2*a));
            Valores valores = new Valores(r1, r2);
        }else if(tieneRaiz()){
            r1 = ((-b + Math.sqrt((Math.pow(b, 2) - (4*a*c))))/(2*a));    
            Valores valores = new Valores(r1);
        }else if((!tieneRaices()) && (!tieneRaiz())){
            System.out.println("La ecuacion no tiene soluciones");
        return false;
        }
        return true;
    }
}