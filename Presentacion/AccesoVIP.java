/*Reto: Crear un sistema de acceso a un evento VIP.
● Reglas:
1. Si es mayor de 18 años y tiene invitación, accede.
2. Si es mayor de 65 años, accede aunque no tenga invitación (Socio Honorario).
3. Si es menor de 18, solo accede si viene con un tutor y el tutor tiene invitación.
● Foco en Java: Estructura if - else if - else y prioridad de operadores lógicos.*/

import java.util.Scanner;

public class AccesoVIP {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        int edad;
        boolean tutor = false;
        boolean invitacion;

        System.out.println("Edad de la persona: ");
        edad = terminal.nextInt();
        if (edad < 18) {
            System.out.println("Tiene tutor? (true, false): ");
            tutor = terminal.nextBoolean();
        } else if (edad > 65) {
            System.out.println("Socio honorario, ingreso validado");
        }
        if (edad < 65) {
            System.out.println("Posee invitacion? (true, false): ");
            invitacion = terminal.nextBoolean();

            if ((edad < 18 && tutor == true && invitacion == true) || (edad > 18 && invitacion == true)) {
                System.out.println("Ingreso validado, bienvenido/a!");
            } else {
                System.out.println("Ingreso denegado");
            }
        }
    }
}
