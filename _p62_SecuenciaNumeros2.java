//Imprimir la secuencia de números mostrados el número de renglones que el usuario desee
//Cristian Berumen Ramírez
//18-09-2023 - Versión 1.0

import java.util.Scanner;

public class _p62_SecuenciaNumeros2 {
    public static void main(String[] args) {
        int i, j, n;
        char resp;
        Scanner in = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.print("Cuantos renglones ? ");
            n = in.nextInt();

            for (i = 1; i <= n; i++) {
                for (j = 1; j <= i; j++) {
                    System.out.printf("%d ", j);
                }
                System.out.println();
            }
            System.out.print("\nDesea continuasr (S/N) ? ");
            resp = Character.toUpperCase(in.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nProceso terminado...");
    }
}
