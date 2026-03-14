
/**
 * Write a description of class Triangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triangulo
{
    // instance variables - replace the example below with your own
    private 
    int l1;
    int l2;
    int l3;

    /**
     * Constructor for objects of class Triangulo
     */
     public Triangulo()
    {
        // initialise instance variables
        l1 = 60;
        l2 = 30;
        l3 = 90;
    }
    public Triangulo(int l1, int l2, int l3)
    {
        // initialise instance variables
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }
   

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public 
    void ladoMayor()
    {
        // put your code here
        if(l1 > l2 && l1 > l3){
            System.out.println("El lado mayor es el lado 1: " + l3);
        }else if(l2 > l1 && l2 > l3){
            System.out.println("El lado mayor es el lado 2: " + l2);
        }else{
            System.out.println("El lado mayor es el lado 3: " + l3);
        }
    }
    void Equilatero(){
        if(l1 == l2 && l2 == l3){
            System.out.println("El triangulo es equilatero");
        }else{
            System.out.println("El triangulo no es equilatero");
        }
    }
}