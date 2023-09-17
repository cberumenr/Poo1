//Imprimir la secuencia de n términos y su suma según el usuario decida
//Cristian Berumen Ramírez
//19-09-2023 - Versión 1.0

import java.util.Scanner;

public class _p64_SumaTerminos2 {
    public static void main(String[] args) {
        int i, j, n, x, sx, suma;
        char resp;
        Scanner in = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.print("Cuantos terminos ? ");
            n = in.nextInt();
            x = 1; sx = 1; suma = 0;
            
            for (i = 1; i <= n; i++) {
                for (j = 1; j <=i; j++) {
                    System.out.print(x);
                }
                System.out.print("+");
                suma += sx;
                sx = 1 + (sx * 10);
            }
            System.out.printf("\nLa suma es: %d", suma);
            System.out.print("\nDesea continuar (S/N) ? ");
            resp = Character.toUpperCase(in.next().charAt(0));
        } while (resp != 'N');
        System.out.println("Proceso terminado...");
    }
}
