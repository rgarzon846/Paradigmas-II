
/**
 * Write a description of class Chat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Chat
{
    // instance variables - replace the example below with your own
    private 
    Bot bot;
    Usuario usuario;
    Scanner sc;

    /**
     * Constructor for objects of class Chat
     */
    public Chat()
    {
        // initialise instance variables
        bot = new Bot();
        usuario = new Usuario();
        sc = new Scanner(System.in);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public 
    void iniciarChat()
    {
        Normalizacion();
        while(!Normalizacion().equals("fin")){
            System.out.println("Ingrese su consulta: ");
            usuario.setTexto(sc.nextLine());
            bot.verificarPalabra(Normalizacion());
        }
    }
    
    private HashSet<String> Normalizacion(){
                String linea = usuario.getTexto().trim().toLowerCase();
                String[] arregloDePalabras = linea.split(" ");
                
                HashSet<String> palabras = new HashSet<String>();
                for(String palabra : arregloDePalabras){
                    palabras.add(palabra);
                }
                return palabras;
    }
}