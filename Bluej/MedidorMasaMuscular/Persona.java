
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
    Persona(String nombre, int edad, String sexo){
        this.nombre = nombre;
        dni = generarDni();
        this.edad = edad;
        this.sexo = sexo;
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
    public 
    int calcularIMC()
    {
        // put your code here
        double imc = (peso/(Math.pow(altura, 2)));
        if(imc < 20){
            return -1;
        }else if(imc >= 20 && imc <= 25){
            return 0;
        }else if(imc > 25){
            return 1;
        }
    }
    boolean esMayorDeEdad(){
        if(edad >= 18){
            return true;
        }else{
            return false;
        }
        
    
    }
}