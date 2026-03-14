import java.util.Scanner;

public class NombreEdadSueldo{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        double sueldo;
        double sueldoconbono;

        System.out.println("Ingrese su nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese su edada: ");
        edad = teclado.nextInt();
        System.out.println("Ingrese su sueldo deseado: ");
        sueldo = teclado.nextDouble();

        sueldoconbono = sueldo + (1500/sueldo);

        System.out.println("Hola " + nombre + ", con tu edad de " + edad + " años, tu sueldo anual con bono seria: " + sueldoconbono);

    }
}