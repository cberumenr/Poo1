//Imprimir los impares de forma descendente, hasta donde el usuario elija
//Cristian Berumen Ramírez
//07-09-2023 - Versión 1.0

import java.util.Scanner;

public class _p45_ImparesDescendente {
    public static void main(String[] args) {
        int c, n, s;
        char resp;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.println("Imprime los impares de forma descendente, hasta donde el usuario elija");
            System.out.println("Desde donde ?"); n = obj.nextInt();
            s = 0;
            c = n % 2 == 0 ? --n : n;
            while (c >= 1) {
                System.out.printf("%d ", c);
                s += c;
                c -= 2;
            }
            System.out.printf("La suma es %d", s);
            System.out.print("\nDeseas continuar (S/N) ?"); resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nProceso terminado");
    }
}
