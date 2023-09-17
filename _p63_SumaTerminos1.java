//Imprimir la secuencia de números armónicos el número de términos que el usuario desee
//Cristian Berumen Ramírez
//19-09-2023 - Versión 1.0

import java.util.Scanner;

public class _p63_SumaTerminos1 {
    public static void main(String[] args) {
        int i, n;
        float suma = 0;
        char resp;
        Scanner in = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.print("Cuantos terminos ? "); n = in.nextInt();

            for (i =1; i <= n; i++) {
                System.out.printf("1/%d + ", i);
                suma += 1.00 / i;
            }
            System.out.printf("\nLa suma es: %.2f", suma);
            System.out.print("\nDesea continuar (S/N) ? ");
            resp = Character.toUpperCase(in.next().charAt(0));
        } while (resp != 'N');
        System.out.println("Proceso terminado...");
    }
}
