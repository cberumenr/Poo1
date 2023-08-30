//Muestra la estación del año que corresponde al número introducido
//Cristian Berumen Ramírez
//29-08-2023 - Versión 1.0

import java.util.Scanner;

public class _p25_EstacionesAno {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Muestra la estacion del año en base al numero\n");
        System.out.print("Dame un numero (1..4) ? ");
        int n = new Scanner(System.in).nextInt();

        if(n==1) System.out.println("Primavera");
        if(n==2) System.out.println("Verano");
        if(n==3) System.out.println("Otoño");
        if(n==4) System.out.println("Invierno");
        System.out.println("\nProceso terminado. . .");
         
    }
}