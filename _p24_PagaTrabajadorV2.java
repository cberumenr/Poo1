//Calcula la paga de un trabajador, las horas extra se pagan al doble
//Cristian Berumen Ramírez
//28-08-2023 - Versión 1.0

import java.util.Scanner;

public class _p24_PagaTrabajadorV2 {
    public static void main(String[] args) {
        int horas, extra = 0;
        float paga, total;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Calcula la paga de un trabajador, las hotas extra se pagan al doble\n");
        System.out.println("Horas trabajadas ? "); horas = obj.nextInt();
        System.out.print("Paga por hora ? "); paga = obj.nextFloat();

        if (horas > 40) {
            extra = horas - 40;
            total = 40 * paga + (2 * paga * extra);
        }
        else total = horas * paga;

        System.out.printf("\nHoras extra: %d", extra);
        System.out.printf("\nEl pago total es de: %f", total);
    }
}
