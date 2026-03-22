
/**
 * Write a description of class Prestamo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Prestamo
{
    // instance variables - replace the example below with your own
    private 
    Usuario usuario;
    Libro libro;
    boolean prestamo;
    boolean devolver;

    /**
     * Constructor for objects of class Prestamo
     */
    public 
    Prestamo()
    {
        // initialise instance variables
        libro = new Libro("Caperucita", "Charles", "Disponible");
        usuario = new Usuario("Juan");
        prestamo = false;
        devolver = false;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
     private void actualizarEstado(){
        if(libro.getEstado().equals("Disponible")){
            libro.setEstado("Prestado");
        }else{
            libro.setEstado("Disponible");
        }
    }
    
    public 
    
    void solicitarPrestamo()
    {
        // put your code here
        devolver = false;
        verificarEstado();
        if(verificarEstado()){
            actualizarEstado(); 
            
        }else{
            prestamo = false;
        }
        resultadoOperacionPrestamo();        
    }
    
    boolean verificarEstado()
    {
        if(libro.getEstado().equals("Disponible")){
            return true;
        }else{
            return false;
        }
    }
    
    private void resultadoOperacionPrestamo(){
        if(verificarEstado() == false){
            System.out.println("El prestamo se ha realizado con exito! id: " + usuario.getId());
        }else{
            System.out.println("No se ha solicitado un prestamo");
        }
        
    }
    
    private void resultadoOperacionDevolver(){
        if(devolver){
            System.out.println("La devolucion se ha realizado con exito! id: " + usuario.getId());
        }else{
            System.out.println("El libro no fue prestado");
        }
        devolver = false;
    }
    
    public void devolverLibro(){
        //prestamo = false;
        prestamo = false;
        actualizarEstado();
        devolver = true;
        resultadoOperacionDevolver();
    }
    
}