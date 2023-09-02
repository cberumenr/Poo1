//Dados tres números enteros, verificar cuál es el mayor
//Cristian Berumen Ramírez
//01-09-2023 - Versión 1.0

import java.util.Scanner;

public class _p34_NumeroMayor {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        float n1, n2, n3;
        Scanner obj = new Scanner(System.in);

        System.out.print("Ingrese 3 numeros separados por Enter\n");
        n1 = obj.nextFloat();
        n2 = obj.nextFloat();
        n3 = obj.nextFloat();

        if (n1 > n2){
            if (n1 > n3) System.out.printf("El numero mayor es %.2f", n1);
            else System.out.printf("El numero mayor es %.2f", n3);

        }
        if (n1 < n2){
            if (n2 > n3) System.out.printf("El numero mayor es %.2f", n2);
        else
            System.out.printf("El numero mayor es %.2f", n3);
        }
    }
}
