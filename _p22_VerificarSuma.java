//Verifica si la suma de dos números es igual a un tercero
//Cristian Berumen Ramírez
//28-08-2023 - Versión 1.0

import java.util.Scanner;
public class _p22_VerificarSuma {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        int num1, num2, num3;
        Scanner obj = new Scanner(System.in);

        System.out.println("Verifica si la suma de dos numeros es igual a un tercer numero\n");
        System.out.println("Numero 1 ?"); num1 = obj.nextInt();
        System.out.println("Numero 2 ?"); num2 = obj.nextInt();
        System.out.println("Numero 3 ?"); num3 = obj.nextInt();

        if (num1 + num2 == num3)
            System.out.println("Son iguales");
        else
            System.out.println("Son diferentes");

        System.out.println("\nGracias por usar este programa");

    }
}
