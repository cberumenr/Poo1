//Imprimir la secuencia de numeros mostrados en el numero de renglones que el usuario desee
//Cristian Berumen Ramírez
//18-09-2023 - Versión 1.0

import java.util.Scanner;

public class _p61_SecuenciaNumeros1 {
    public static void main(String[] args) {
        int i, j, n;
        char resp;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.print("Cuantos renglones ? ");

            n = obj.nextInt();

            for (i = 1; i <= n; i++) {
                for (j = 1; j <= i; j++){
                    System.out.printf("%d ", i);
                }
                System.out.println();
            }
            System.out.print("\nDeseas cotinuar (S/N) ? ");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nProceso terminado...");
    }
}