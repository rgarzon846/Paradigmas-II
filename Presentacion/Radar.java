/*Reto: Crear una matriz de 3x3 que represente las temperaturas de 3 ciudades durante 3 días.
● Operación:
1. Llenar la matriz con datos ingresados por el usuario.
2. Calcular el promedio de temperatura por cada ciudad (promedio de cada fila).
3. Encontrar la temperatura más alta de toda la matriz e indicar en qué posición (fila/columna) se
encuentra.*/

import java.util.Scanner;

public class Radar{
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        float[][] temperaturas = new float[3][3];
        float[] promedio = new float[3];
        float mayor = 0;
        float menor = 0;

        System.out.println("Ingrese los datos de las temperaturas: ");

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                temperaturas[i][j] = terminal.nextFloat();
            }
        }
        
        System.out.println("Ciudad 1    | Ciudad 2  | Ciudad 3");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.printf("%.2f         ", temperaturas[i][j]);
            }
            System.out.println();
        }
        float[] suma = new float[3];

        for(int i = 0; i < 3; i++){
            suma[0] += temperaturas[0][i];
            suma[1] += temperaturas[1][i];
            suma[2] += temperaturas[2][i];
        }
        for(int i = 0; i < 3; i++){
            promedio[i] = suma[i]/3;
        }

        System.out.println("El promedio de temperatura en las ciudades es: ");
        System.out.println("Ciudad 1    | Ciudad 2  | Ciudad 3");

        for(int i = 0; i < 3; i++){
            System.out.printf("%.2f     ", promedio[i]);
        }
        System.out.println();

        int filamenor = 0;
        int columnamenor = 0;
        int filamayor = 0;
        int columnamayor = 0;

        menor = temperaturas[0][0];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(mayor < temperaturas[i][j]){
                    mayor = temperaturas[i][j];
                    filamayor = i;
                    columnamayor = j;
                }if(menor > temperaturas[i][j]){
                    menor = temperaturas[i][j];
                    filamenor = i;
                    columnamenor = j;
                }
            }
        }

        System.out.println("La mayor temperatura registrada es: " + mayor + " en la fila " + filamayor + " y la columna " + columnamayor);
        System.out.println("La menor temperatura registrada es: " + menor + " en la fila " + filamenor + " y la columna " + columnamenor);
    }
}