
/**
 * Write a description of class ProcesoProductivo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class ProcesoProductivo
{
    // instance variables - replace the example below with your own
    private
    
    String material;
    float cantidadActual;
    float cantidadMinima;
    float cantidadMaxima;
    
    /**
     * Constructor for objects of class ProcesoProductivo
     */
    public 
    
    ProcesoProductivo(String material, float cantidadActual, float cantidadMinima, float cantidadMaxima)
    {
        // initialise instance variables
        do{
            if(cantidadActual > cantidadMaxima || cantidadActual < cantidadMinima){
                System.out.println("Los valores ingresados estan fuera de los permitidos");
            }
        this.material = material;
        this.cantidadActual = cantidadActual;
        this.cantidadMinima = cantidadMinima;
        this.cantidadMaxima = cantidadMaxima;
    }while(cantidadActual > cantidadMaxima || cantidadActual < cantidadMinima);
    }
    
    

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public 
    
    void ingresarMaterial(float cantidad)
    {
        // put your code here
        do{
        this.cantidadActual = this.cantidadActual + cantidad;
        if(this.cantidadActual > cantidadMaxima){
            System.out.println("No puede agregar la cantidad de material ingresada");
        }
    }while(this.cantidadActual > cantidadMaxima);
    }
    float getcantidadActual()
    {
        // put your code here
        return cantidadActual;
    }
    
}