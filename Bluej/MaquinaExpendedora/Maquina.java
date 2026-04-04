
/**
 * Write a description of class Maquina here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Maquina
{
    // instance variables - replace the example below with your own
    private 
    int dinero_ingresado;
    Destino destino;
    Scanner sc;
    /**
     * Constructor for objects of class Maquina
     */
    public Maquina()
    {
        // initialise instance variables
        dinero_ingresado = 0;
        destino = new Destino();
        sc = new Scanner(System.in);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public 
    void pagarViaje()
    {
        // put your code here
        System.out.println("De que monto es el billete con el que desea pagar?:");
        System.out.println("50\n100\n500\n1000");
        dinero_ingresado = sc.nextInt();
        System.out.println("Hasta el momento se han ingresado: " + llevarCuenta(dinero_ingresado));
        if(habilitacion(llevarCuenta(dinero_ingresado))){
            System.out.println("Ya puede emitir su ticket!");
        }else{
            System.out.println("Faltan ingresar: " + (destino.getValor() - llevarCuenta(dinero_ingresado)));
        }
    }
    private
    int llevarCuenta(int dinero_ingresado){
        int suma = 0;
        suma += dinero_ingresado;
        return suma;
    }
    private
    boolean habilitacion(int suma){
        if(suma > destino.getValor()){
            return true;
        }else{
            return false;
        }
    }
    public
    void emitirTicket(){
        if(habilitacion(llevarCuenta(dinero_ingresado))){
            System.out.println("###############");
            System.out.println("Trencitos Argentinos");
            System.out.println("Ticket precio: " + destino.getValor());
            System.out.println("Destino: " + destino.getLugar());
            System.out.println("###############");
        }else{
            System.out.println("Complete el pago para obtener su ticket!");
        }
    }
}