/*● Reto: Pedir al usuario una frase y una letra al azar.
● Operación: 1. Contar cuántas veces aparece esa letra en la frase (sin importar
mayúsculas/minúsculas). 2. Invertir la frase completa. 3. Indicar si la frase empieza con la palabra
"Java".*/

import java.util.Scanner;

public class StringOperaciones {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        String texto;
        char caracter;
        int contador = 0;
        String textomayus;
        char carmayus;
        int largo;

        System.out.println("Ingrese una frase: ");
        texto = terminal.nextLine();
        textomayus = texto.toUpperCase();
        largo = texto.length();
        System.out.println("Ingrese un caracter: ");
        caracter = terminal.next().charAt(0);
        carmayus = Character.toUpperCase(caracter);

        for (int i = 0; i < largo; i++) {
            if (textomayus.charAt(i) == carmayus) {
                contador++;
            }
        }
        System.out.println("La letra \"" + caracter + "\" aparece " + contador + " veces");

        char[] invertido = new char[largo];

        for(int i = 0; i < largo; i++){
            invertido[i] = texto.charAt(largo - 1 - i);
        }
        
        System.out.println("La frase invertida es: ");
        System.out.println(invertido);

        boolean comienzo = texto.startsWith("java");
        if(comienzo){
            System.out.println("La frase comienza con la palabra \"java\"");
        }else{
            System.out.println("La frase no comienza con la palabra \"java\"");
        }
    }
}
