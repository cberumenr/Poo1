//Verificar si un número es positivo, negativo o cero
//Cristian Berumen Ramírez
//28-08-2023 - Versión 1.0

import java.util.Scanner;

public class _p21_VerificarNumero {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("Determina si un numero es positivo, negativo o cero\n");

        System.out.println("Dame un numero entero ?\n");
        int num = new Scanner(System.in).nextInt();

        if (num > 0)
            System.out.println("Es positivo");
        if (num < 0)
            System.out.println("Es negativo");
        if (num == 0)
            System.out.println("Es cero");

        System.out.println("\nGracias por usar este sistema todopoderoso");
        
    }
}