
/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculadora
{
    // instance variables - replace the example below with your own
    private 
    int valor1;
    int valor2;

    /**
     * Constructor for objects of class Calculadora
     */
    public Calculadora(int valor1, int valor2)
    {
        // initialise instance variables
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public 
    void Suma()
    {
        // put your code here
        int suma = valor1 + valor2;
        System.out.println("El valor de la suma es de: " + suma);
    }
    void Resta(){
        int resta = valor1 - valor2;
        System.out.println("El valor de su resta es de: " + resta);
    }
    void Multiplicacion(){
        int multi = valor1 * valor2;
        System.out.println("El valor de su multiplicacion es de: " + multi);
    }
    void Division(){
        float division = valor1/valor2;
        System.out.println("El valor de su division es de: " + division);
    }
}