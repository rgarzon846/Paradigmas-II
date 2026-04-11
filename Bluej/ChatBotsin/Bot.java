
/**
 * Write a description of class Bot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class Bot
{
    // instance variables - replace the example below with your own
    private 
    HashMap<String, String> rtas_automaticas;
    ArrayList<String> rtas_defecto;

    /**
     * Constructor for objects of class Bot
     */
    public Bot()
    {
        // initialise instance variables
        rtas_automaticas = new HashMap<>();
        rtas_defecto = new ArrayList<>();  
        agregarRtasDefecto();
        agregarRtasAutomaticas();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public 
    void verificarPalabra(HashSet<String> palabras)
    {
        if(rtas_automaticas.containsKey(palabras)){
            System.out.println(rtas_automaticas.get(palabras));
        }else{
            seleccionarRtaDefecto();
        }
    }
    private void seleccionarRtaDefecto(){
        Random indice;
        indice = new Random();
        int nro_indice = indice.nextInt(2);
        for(String rta_defecto : rtas_defecto){
            System.out.println(rtas_defecto.get(nro_indice));
        }
    }
    private void agregarRtasAutomaticas(){
        rtas_automaticas.put("error", "Deberias leer el codigo");
        rtas_automaticas.put("compila", "Si compila no preguntes");
        rtas_automaticas.put("pantalla", "Mucho mejor oled que leds normales");
    }
    private void agregarRtasDefecto(){
        rtas_defecto.add("No tengo idea de lo que me estas hablando");
        rtas_defecto.add("Pregunta al bot de marketing");
        rtas_defecto.add("Mejor compra otro equipo");
    }
    
}