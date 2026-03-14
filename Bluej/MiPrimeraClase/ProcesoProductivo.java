
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
    
    ProcesoProductivo()
    {
        // initialise instance variables
      material = "Cemento";
      cantidadActual = 10;
      cantidadMaxima = 100;
      cantidadMinima = 10;
    }
    
    

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public 
    
    void setMaterial(String material){
        this.material = material;
    }
    void setCantidad(float cantidadActual){
        this.cantidadActual = cantidadActual;
    }
    void setMaximo(float cantidadMaxima){
        this.cantidadMaxima = cantidadMaxima;
    }
    void setMinimo(float cantidadMinima){
        this.cantidadMinima = cantidadMinima;
    }
    String getMaterial(){
        return material;
    }
    float getCantidad(){
        return cantidadActual;
    }
    
    
    void ingresarMaterial(float cantidad)
    {
        // put your code here
        do{
            System.out.println("Ingrese la cantidad de material deseada");
        this.cantidadActual = this.cantidadActual + cantidad;
        if(this.cantidadActual > cantidadMaxima){
            System.out.println("No puede agregar la cantidad de material ingresada");
        }
    }while(this.cantidadActual > cantidadMaxima);
    }
      void extraerMaterial(float cantidad)
    {
        // put your code here
        do{
            System.out.println("Ingrese la cantidad de material que desea extraer");
        this.cantidadActual = this.cantidadActual - cantidad;
        if(this.cantidadActual < cantidadMinima){
            System.out.println("No puede extraer la cantidad de material ingresada");
        }
    }while(this.cantidadActual > cantidadMaxima);
    }
    float getcantidadActual()
    {
        // put your code here
        return cantidadActual;
    }
    
}