//Leer un arreglos de n calificaciones flotantes, calcula la suma y el promedio
//Cristian Berumen Ramírez
//26-09-2023 - Versión 1.0

import java.util.Scanner;

public class _p84_PromedioArreglo {
    public static void main(String[] args) {
        int n = 0;
        float suma = 0, promedio = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("\033[H\033[2J");System.out.flush();

        System.out.print("\nCuantas calificaciones deseas procesar ? ");
        n = in.nextInt();

        float[] califs = new float[n];

        System.out.printf("Introduce las %d calificaciones \n", n);
        for(int i = 0; i < califs.length; i++) {
            System.out.printf("Calificacion %d ? ", i + 1);
            califs[i] = in.nextFloat();
        }

        System.out.println("\nLas calificaciones capturadas son:");
        for(float cal : califs) {
            System.out.printf("%.2f \n", cal);
            suma = suma + cal;
        }
        promedio = suma / califs.length;
        System.out.printf("\nLa suma es: %.2f", suma);
        System.out.printf("\nEl promedio es: %.2f", promedio);
    }    
}