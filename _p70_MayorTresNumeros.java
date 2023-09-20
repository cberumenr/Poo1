//Calcule e imprima el mayor de tres numeros
//Cristian Berumen Ramírez
//20-09-2023 - Versión 1.0

import java.util.Scanner;

public class _p70_MayorTresNumeros {
    public static float Mayor (float n1, float n2, float n3) {
        float may = 0;
        if (n1 > n2 && n1 > n3) may = n1;
        else if (n2 > n1 && n2 > n3) may = n2;
        else if (n3 > n1 && n3 > n2) may = n3;
        return may;
    }
    public static void main(String[] args) {
        float n1, n2, n3;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.print("Dame 3 numeros separados por espacio ? "); 
        n1 = obj.nextInt(); n2 = obj.nextInt(); n3 = obj.nextInt();

        System.out.printf("\nEl mayor de los tres numeros es: %.2f ", Mayor (n1, n2, n3));
    }
}