//Leer un arreglo de n nombres y n edades, calcula el promedio de edades
//Cristian Berumen Ramírez
//26-09-2023 - Versión 1.0

import java.util.Scanner;

public class _p85_NombresEdades {
    public static void main(String[] args) {
        int n =0, s = 0, p = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("\033[H\033[2J");System.out.flush();

        System.out.print("\nCuantas personas deseas procesar ? "); n = in.nextInt();
        String[] nombres = new String[n];
        int[] edades = new int[n];

        System.out.printf("\nIntroduce los nombres y edades de las %d personas que dijiste \n", n);
        for (int i = 0; i < n; i++) {
            in.nextLine();
            System.out.printf("Dame el nombre %d ? ", i + 1); nombres[i] = in.nextLine();
            System.out.printf("Dame la edad ? "); edades[i] = in.nextInt();        
        }

        System.out.println("\nLos nombres y las edades de las personas capturadas son:");
        System.out.printf("Nombre\tEdad\n");
        for(int i = 0; i < n; i++) {
            System.out.printf("%s\t%d ", nombres[i], edades[i]);
            s = s + edades[i];
        }
        p = s / n;
        System.out.printf("\nEl promedio de edades es " + p);
    }    
}
