//Dados 3 números enteros, verificar si son consecutivos
//Cristian Berumen Ramírez
//01-09-2023 - Versión 1.0

import java.util.Scanner;

public class _p33_NumerosConsecutivos {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        int num1, num2, num3;
        Scanner obj = new Scanner(System.in);

        System.out.println("Ingrese 3 numeros enteros separados por Enter ?:\n");
        num1 = obj.nextInt();
        num2 = obj.nextInt();
        num3 = obj.nextInt();

        if(num2 == num1 + 1) {
            if(num3 == num2 + 1) System.out.printf("Los numeros %d, %d, y %d, si son consecutivos.", num1, num2, num3);

            else System.out.printf("Los numeros %d, %d y %d no son consecutivos", num1, num2, num3);
        }
        else System.out.printf("Los numeros %d, %d y %d no son consecutivos", num1, num2, num3);
    }    
}
