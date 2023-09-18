//Regresa una letra de acuerdo al primedio
//Cristian Berumen Ramírez
//18-09-2023 - Versión 1.0

import java.util.Scanner;

public class _p69_CalificacionLetra {

    public static char CalifLetra(float cal) {
        char letra = ' ';
        if (cal >= 90 & cal <=100) letra = 'A';
        else if (cal >= 80 & cal < 90) letra = 'B';
        else if (cal >= 70 & cal < 80) letra = 'C';
        else if (cal >= 60 & cal < 70) letra = 'D';
        else letra = 'F';
        return letra;
    }
    public static void main(String[] args) {
        float prom;
        char letra;
        Scanner in = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        
        do {
        System.out.print("Dame tu promedio ? "); prom = in.nextFloat();
        } while (prom < 0 || prom >100);

        letra = CalifLetra(prom);

        System.out.printf("Tu promedio de %.2f equivale a %c", prom, letra);
    }   
}
