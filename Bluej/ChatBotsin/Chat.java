
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

    /**
     * Constructor for objects of class Chat
     */
    public Chat()
    {
        // initialise instance variables
        bot = new Bot();
        usuario = new Usuario();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public 
    void Conversacion()
    {
        getEntrada();
        while(!usuario.getTexto().equals("fin")){
            bot.verificarPalabra(getTexto());
        }
    }
    
    HashSet<String> getEntrada(){
                String linea = lector.lineaSiguiente().trim().toLowerCase();
                String[] arregloDepalabras = linea.split();
                HashSet<String> palabras = new HashSet<String>();
                for(String palabra : arregloDePalabras){
                    palabras.add(palabra);
                }
                return palabras;
    }
}