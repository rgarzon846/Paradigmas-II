
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
        if(Calcular(valores)){
            System.out.println("Las raices son: " + valores.getR1() + " y " + valores.getR2());
        }
    }
    
    void obtenerRaiz(){
        Valores valores = new Valores(0);
        if(Calcular(valores)){
            System.out.println("La unica solucion posible es: " + valores.getR1());
        }
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
    
    private boolean Calcular(Valores valores){
        if(tieneRaices()){
            double r1 = ((-b + Math.sqrt((Math.pow(b, 2) - (4*a*c))))/(2*a));
            double r2 = ((-b - Math.sqrt((Math.pow(b, 2) - (4*a*c))))/(2*a));
            valores.setR1(r1);
            valores.setR2(r2);
        }else if(tieneRaiz()){
            double r1 = ((-b + Math.sqrt((Math.pow(b, 2) - (4*a*c))))/(2*a));    
            valores.setR1(r1);
        }else if((!tieneRaices()) && (!tieneRaiz())){
            System.out.println("La ecuacion no tiene soluciones");
        return false;
        }
        return true;
    }
}