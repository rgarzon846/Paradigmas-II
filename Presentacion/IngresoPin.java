/*● Reto: Simular el ingreso de un PIN de 4 dígitos.
● Reglas: Usar un do-while para pedir el PIN al menos una vez.
○ El usuario tiene máximo 3 intentos.
○ Si falla los 3, mostrar "Cuenta bloqueada". Si acierta, mostrar "Bienvenido".*/

import java.util.Scanner;

public class IngresoPin {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        int pin = 5632;
        int intento;
        int contador = 0;

        do {
            contador++;
            if(contador > 1){ System.out.println("INCORRECTO!");}
            System.out.println("Intento numero: " + contador);
            System.out.println("Ingrese el pin: ");
            intento = terminal.nextInt();
        } while (contador < 3 && intento != pin);

        if (intento == pin) {
            System.out.println("Bienvenido!");
        } else {
            System.out.println("Cuenta bloqueada");
        }
    }
}
