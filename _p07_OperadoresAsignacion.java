//Efectúa operaciones sobre un número entero, usando los operadores de asignación
//Cristian Berumen Ramírez
//22-08-2023 - Versión 1.0

import java.util.Scanner;

public class _p07_OperadoresAsignacion {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush(); //Limpia la pantalla de la consola

        System.out.print("Dame un numero ?");
        float num=new Scanner(System.in).nextInt();

        System.out.printf("\nEl numero es: %.2f",num);
        System.out.printf("\nIncremetar: %.2f", ++num);
        System.out.printf("\nSumar 80: %.2f", num+=80);
        System.out.printf("\nRestar 35: %.2f", num-=35);
        System.out.printf("\nMultiplicar x15: %.2f", num*=15);
        System.out.printf("\nDividir /4: %.2f", num/=4);
        System.out.printf("\nDecrementar: %.2f", --num);
        

    }
}