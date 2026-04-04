
/**
 * Write a description of class Marcador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.time.Duration;

public class Marcador
{
    // instance variables - replace the example below with your own
    private 
    int visita;
    int local;
    Duration minutos;

    /**
     * Constructor for objects of class Marcador
     */
    public Marcador()
    {
        // initialise instance variables
        visita = 0;
        local = 0;
        minutos = Duration.ofMinutes(90);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public 
    void setVisita(int visita)
    {
        // put your code here
        this.visita = visita;
    }
    void setLocal(int local){
        this.local = local;
    }
    int getVisita(){
        return visita;
    }
    int getLocal(){
        return local;
    }
    long getMinutos(){
        
    }
}