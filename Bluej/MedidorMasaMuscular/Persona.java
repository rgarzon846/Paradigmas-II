
/**
 * Write a description of class Peersona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    // instance variables - replace the example below with your own
    private 
    String nombre;
    long dni;
    int edad;
    float peso;
    String sexo;
    float altura;

    /**
     * Constructor for objects of class Peersona
     */
    public 
    Persona()
    {
        // initialise instance variables
        nombre = "";
        dni = generarDni();
        edad = 0;
        peso = 0;
        sexo = "masculino";
        altura = 0;
    }
    Persona(){
        nombre = "Desire";
        dni = generarDni();
        edad = 90;
        sexo = "femenino";
        peso = 0;
        altura = 0;
    }
    Persona(String nombre, long dni, int edad, float peso, String sexo, float altura){
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.peso = peso;
        this.sexo = sexo;
        this.altura = altura;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}