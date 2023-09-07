//Imprime una tabla de conversión de peso a dólar en un rango de valores
//Cristian Berumen Ramírez
//07-09-2023 - Versión 1.0

import java.util.Scanner;

public class _p46_TablaConversion {
    public static void main(String[] args) {
        float c, ini, fin, tc = 17.53f, tcl = 21.86f;
        char resp;
        Scanner obj = new Scanner(System.in);

        do {
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Imprime una tabla de conversión de peso a dolar en un rango de valores");
        do {
        System.out.println("Inicio: "); ini = obj.nextFloat();
        System.out.println("Fin: "); fin = obj.nextFloat();
        } while (fin < ini);
        c = ini;
        System.out.println("Peso\tDolar\tLibra");
        while (c <= fin) {
            System.out.printf("%.2f\t%.2f\t%.2f\n", c, c / tc, c / tcl);
            c++;
        }
        System.out.print("\nDeseas continuar (S/N) ?"); resp = Character.toUpperCase(obj.next().charAt(0));
        } while ( resp != 'N');
        System.out.println("\nGracias por ustilizar este programa");
    }
}
