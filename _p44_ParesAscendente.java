//Imprimir los números pares de forma ascendente, de 2 hasta n.
//Cristian Beruumen Ramírez
//07-09-2023 - Versión 1.0

import java.util.Scanner;

public class _p44_ParesAscendente {
    public static void main(String[] args) {
        int c, n, s;
        char resp;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.println("Imprime los numeros pares de forma ascendente hasta donde el usuario elija");
            System.out.println("Hasta donde ?"); n = obj.nextInt();
            s = 0; c = 2;
            while(c <= n) {
                System.out.printf("%d ", c);
                s+=c;
                c+=2;
            }
            System.out.printf("\nLa suma es %d ", s);
            System.out.print("\nDeseas continuar (S/N) ?"); resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nGracias por utilizar este programa");
    }    
}