//Aprendiendo excepciones
//Cristian Berumen Ramírez
//31-10-2023 - Versión 1.0

import java.util.Scanner;

public class _p125_Excepcion5 {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40};

        try {
            System.out.println("Que posicion quiere leer ? "); int pos = new Scanner(System.in).nextInt();
            System.out.println("La posicion " + pos + ", contiene el valor " + a[pos]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Esta accediendo una posicion fuera de los limites del arreglo, no jodas");
            System.out.println("Mensaje del sistema: " + e);
        } finally {
            System.out.println("Los elementos del arreglo son: ");
            for (int i : a) {
                System.out.print(i + " ");
            }
        }
    }
}
