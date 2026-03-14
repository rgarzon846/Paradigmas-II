
public class Persona{

private:
int dni;
String nombre; (aunque string sea una clase se puede usar sin importar nada ya que es                                                 de libre uso y con la palabra reservada)
int sueldo;     //private nos asegura que nadie puede modificar los datos si no es mediante los método de seteo. TIENEN QUE SER PRIVADOS SIEMPRE, LOS ATRIBUTOS NO SE COLOCAN COMO PUBLICO

//Constructores

//Pueden ser publicos los metodos que me permiten setear los atributos pero los atributos no.
Los métodos son mi interfaz de carga. La clase nos encapsula los atributos para que nadie acceda a ellos si no es por nuestros metodos.

public: 

//El constructor inicializado en 0 solo se hace cuando el problema lo solicita, si el problema nos indica que el objeto se inicializara con valores especificos entonces no debemos hacer un constructor inicializado en 0;
Persona(){
dni = 0;
nombre = " ";
sueldo = 0;
}

Persona(int dni, int sueldo, String nombre){
this.dni = dni;
this.nombre = nombre;      //con la palabra "this" se autoreferencia la variable del objeto, es
                        decir, al usar el mismo nombre de variable con la palabra this diferenciamos cual es la variable del objeto y cual es la variable del método
this.sueldo = sueldo;
}

//Métodos generales


//Métodos para setear atributos específicos
Pisan el dato anterior que poseía el atributo, su estructura no se modifica, es decir, no se le pueden agregar condiciones ni bucles ni sumas ni restas. Solo agarran el atributo y le dan un valor.
void setSueldo(int sueldo){
this.sueldo = sueldo;
}

//Metodos para retornar un valor específico
Retornan el valor que tiene el atributo, no se modifica su estructura, no se le puede agregar ni condiciones, ni bucles ni nada
int getSueldo(){
return sueldo;
}
 //Los nombres getNombreMetodo() y setNombreMetodo(), son palabras específicas, los metodos de setteo y getteo siempre se llaman asi.

boolean SueldoMayor(){
if(sueldo>1000){
return true;
else{
return false;
}
}
}
}

Ya terminamos la clase, ahora debemos hacer la instancia a la clase.

Con la clase definimos un nuevo tipo de dato, cada atributo dentro de una clase responde a tipos primitivos.
RECORDAR: por ahora, atributos privados.
Los niveles de acceso se aplican a nivel de definición, es decir no hay que definir DENTRO del método si el atributo es private o public.

[[Construcción del objeto (instancia de la clase)]]
