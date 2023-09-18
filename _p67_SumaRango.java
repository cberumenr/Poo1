//Suma de un rango de úmeros, usando funciones
//Cristian Berumen Ramírez
//18-09-2023 - Versión 1.0

import java.util.Scanner;

public class _p67_SumaRango {

    public static int SumaRango(int ini, int fin) {
        int sum = 0;
        for (int i = ini; i <= fin; i++)
            sum += i;
        return sum;
    }
    public static void main(String[] args) {
        int ini, fin;
        Scanner in = new Scanner(System.in);
        
        System.out.print("\033[H\033[2J"); System.out.flush();

        do {
            System.out.print("Dame el inicio ? "); ini = in.nextInt();
            System.out.print("Dame el final ? "); fin = in.nextInt();
        } while (ini > fin);

        System.out.printf("La suma de %d a %d es: %d ", ini, fin, SumaRango(ini, fin));
    }
}
