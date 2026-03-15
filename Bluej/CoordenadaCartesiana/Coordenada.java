
/**
 * Write a description of class Coordenada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coordenada
{
    // instance variables - replace the example below with your own
    private 
    float x;
    float y;

    /**
     * Constructor for objects of class Coordenada
     */
    public Coordenada()
    {
        // initialise instance variables
        x = 0;
        y = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public 
    
    void setX(float x)
    {
        // put your code here
        this.x = x;
    }
    void setY(float y){
        this.y = y;
    }
    
    void Cuadrante(){
        if(x > 0 && y >0){
            System.out.println("El punto se encuantra en el primer cuadrante");
        }else if(x < 0 && y >0){
            System.out.println("El punto se encuentra en el segundo cuadrante");
        }else if(x < 0 && y < 0){
            System.out.println("El punto se encuentra en el tercer cuadrante");
        }else if(x > 0 && y < 0){
            System.out.println("El punto se encuentra en el cuarto cuadrante");
        }
    }
}