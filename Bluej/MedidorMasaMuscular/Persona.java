
/**
 * Write a description of class Peersona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;

public class Persona
{
    // instance variables - replace the example below with your own
    private 
    String nombre;
    long dni;
    int edad;
    float peso;
    char sexo;
    float altura;

    /**
     * Constructor for objects of class Peersona
     */
    public 
    Persona()
    {
        // initialise instance variables
        nombre = "";
        dni = generarDni(dni);
        edad = 0;
        peso = 0;
        sexo = 'H';
        altura = 0;
    }
    Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        dni = generarDni(dni);
        this.edad = edad;
        this.sexo = sexo;
        comprobarSexo(sexo);
        peso = 0;
        altura = 0;
    }
    Persona(String nombre, long dni, int edad, float peso, char sexo, float altura){
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.peso = peso;
        this.sexo = sexo;
        comprobarSexo(sexo);
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
        return 2;
    }
    
    boolean esMayorDeEdad(){
        if(edad >= 18){
            return true;
        }else{
            return false;
        }
    }
    private 
    void comprobarSexo(char sexo){
        if(sexo != 'H' && sexo != 'h' && sexo != 'M' && sexo != 'm'){
            this.sexo = 'H';
        }
    }
    long generarDni(long dni){
        Random random = new Random();
        dni = 10000000 + (long)(random.nextDouble()*(99999999 - 10000000 + 1));
        return dni;
    }
    public
    void setNombre(String nombre){
        this.nombre = nombre;
    }
    void setEdad(int edad){
        this.edad = edad;
    }
    void setPeso(float peso){
        this.peso = peso;
    }
    void setSexo(char sexo){
        this.sexo = sexo;
    }
    void setAltura(float altura){
        this.altura = altura;
    }
    
}