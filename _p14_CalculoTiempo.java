//Dada una cantidad en horas, calcular su equivalente en dias, minutos y segundos
//Cristian Berumen Ramírez
//23-08-2023 - Versión 1.0

import java.util.Scanner;

public class _p14_CalculoTiempo {
    public static void main(String[] args) {
         System.out.print("\033[H\033[2J"); System.out.flush();

        float horas, dias, minutos, segundos;
        Scanner obj = new Scanner(System.in);

        System.out.print("Dame una cantidad para las horas\n"); horas = obj.nextFloat();

        dias = horas/24;
        minutos = horas*60;
        segundos = horas*60*60;

        System.out.printf("En %.2f horas, hay:\n %.2f Dias\n %.2f Minutos\n %.2f Segundos", horas, dias, minutos, segundos);
    }
       
}