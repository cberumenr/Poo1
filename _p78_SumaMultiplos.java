//Imprime la suma de los múltiplos de una constante entre un rango dado por el usuario
//Cristian Berumen Ramírez
//24-09-2023 - Versión 1.0

import java.util.Scanner;

public class _p78_SumaMultiplos {
    public static int Suma(int ini, int fin, int c) {
        int suma = 0;
        switch (c) {
            case 3:
                for (int i = ini; i <= fin; i++) {
                    if (i % c == 0) {
                        suma += i;
                    }
                }
                break;
            case 4:
                for (int i = ini; i <= fin; i++) {
                    if (i % c == 0) {
                        suma += i;
                    }
                }
                break;
            default:
                System.out.println("Constante invalida...");
        }
        return suma;
    }
    public static void main(String[] args) {
        int ini, fin, c;
        Scanner in = new Scanner(System.in);
        
        System.out.print("\033[H\033[2J"); System.out.flush();
        
        do {
            System.out.println("Ingrese el valor inicial del rango ? ");
            ini = in.nextInt();
    
            System.out.println("ingrese el valor final del rango ? ");
            fin = in.nextInt();
        } while (fin < ini);
        
        System.out.println("Elija una opcion de constante: [3] [4]) ? ");
        c = in.nextInt();

        System.out.printf("La suma de los multiplos de la constante %d en el rango entre %d y %d, es: %d ", c, ini, fin, Suma(ini, fin, c));
    }
}
