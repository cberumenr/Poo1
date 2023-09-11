//Imprimir los impares de forma ascendente, hasta donde el usuario elija
//Cristian Berumen Ramírez
//10-09-2023 - Versión 1.0

import java.util.Scanner;

public class _p48_ImparesAscendente {
    public static void main(String[] args) {
        int p, c, n, s;
        float prom;
        char resp;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.println("Imprimir los impares de forma ascendente, su suma y el promedio hasta n ");
            System.out.println("Hasta donde ? "); n = obj.nextInt();
            s = 0;
            c = 1; 
            p = 0;

            while (c <= n) {
                System.out.printf("%d ", c);
                s += c;
                c += 2;
                p++;
            }
            prom = s / p;
            System.out.printf("\nLa suma es %d ", s);
            System.out.printf("\nEl promedio es %.2f", prom);
            System.out.print("\nDeseas continuar (S/N) ? ");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nProceso terminado...");
    }
}
