//Capturar n numeros en un arreglo, calcular su promedio y mostrarlo
//Cristian Berumen Ramírez
//02-10-2023 - Versión 1.0

import java.util.Scanner;

public class _p91_MayoresPromedio {
    public static void mostrar(float[] a) {
        for(int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
    public static float suma(float[] a) {
        float suma = 0f;
        for(int i = 0; i < a.length; i++)
            suma = suma + a[i];
        return suma;
    }
    public static float promedio(float[] a) {
        float prom = 0f, suma = 0f;
        int x = 0;
        for(int i = 0; i < a.length; i++) {
            suma += a[i];
            x++;
        }
        prom = suma / x;
        return prom;
    }
    public static void mayoresprom(float[] a) {
        float prom = 0f, suma = 0f;
        int x = 0;
        for(int i = 0; i < a.length; i++) {
            suma += a[i];
            x++;
        }
        prom = suma / x;
        for(int i = 0; i < a.length; i++)
            if(a[i] > prom) {
                System.out.print(a[i] + " ");
            }
    }
    public static void main(String[] args) {
        int n = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("\033[H\033[2J");System.out.flush();

        System.out.print("Cuantas calificaciones va a capturar ? "); n = in.nextInt();
        float[] calificaciones = new float[n];

        System.out.printf("\nIngrese las %d calificaciones que dijo \n", n);
        for(int i = 0; i < n; i++) {
            calificaciones[i] = in.nextFloat();
        }
        System.out.print("\nCalificaciones almacenadas: "); mostrar(calificaciones);
        System.out.printf("\nSuma de las calificaciones: %.2f ", suma(calificaciones));
        System.out.printf("\nPromedio de las calificaciones: %.2f ", promedio(calificaciones)); 
        System.out.printf("\nCalificaciones mayores al promedio: ");  mayoresprom(calificaciones);
    }
}
