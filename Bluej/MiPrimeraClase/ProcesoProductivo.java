
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
    float getMaximo(){
        return cantidadMaxima;
    }
    float getMinimo(){
        return cantidadMinima;
    }
    
    
    void ingresarMaterial(float cantidad)
    {
        // put your code here
        if(cantidad > cantidadMaxima || cantidad < cantidadMinima){
            System.out.println("No se puede ingresar esta cantidad de material");
        }else{
            cantidadActual = cantidadActual + cantidad;
        }
    }
      void extraerMaterial(float cantidad)
    {
        // put your code here
         if((cantidadActual - cantidad) < cantidadMinima){
            System.out.println("No se puede extraer esta cantidad de material");
        }else{
            cantidadActual = cantidadActual - cantidad;
        }
    }
    void Alarma(){
        if(cantidadActual < cantidadMinima || cantidadActual>cantidadMaxima){
            System.out.println("Alarma Activada");
        }else{
            System.out.println("Alarma desactivada");
        }
    }
  
    
}