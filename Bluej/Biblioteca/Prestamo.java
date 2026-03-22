
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
            actualizarEstado(); 
            prestamo = true;
        }else{
            libro.setEstado("Disponible");
        }
    }
    
    public 
    
    boolean solicitarPrestamo()
    {
        // put your code here
        verificarEstado();
        if(verificarEstado()){
            return true;
        }else{
            return false;
        }
        
    }
    
    boolean verificarEstado()
    {
        if(libro.getEstado().equals("Disponible")){
            return true;
        }else{
            return false;
        }
    }
    
    void resultadoOperacion(){
        if(prestamo){
            System.out.println("El prestamo se ha realizado con exito! id: " + usuario.getId());
            prestamo = false;
        }else if(prestamo == false && devolver == false){
            System.out.println("El libro no se encuentra disponible");
        }
        if(devolver){
            System.out.println("La devolucion se ha realizado con exito! id: " + usuario.getId());
        }else if(prestamo == false && devolver == false){
            System.out.println("El libro no fue prestado");
        }
    }
    
    void devolverLibro(){
        actualizarEstado();
        System.out.println("El libro prestado al id: " + usuario.getId() + "se ha devuelto con exito");
        devolver = true;
    }
    
}