//Calcular la temperatura en F de un rango de valores en C
//Cristian Berumen Ramírez
//10-09-2023 - Versión 1.0

import java.util.Scanner;

public class _p50_ConversionTemperaturas {
    public static void main(String[] args) {
        float ti, tf, f;
        char resp;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.println("Calcular la temperatura en F de un rango de valores en C ");
            do{
                System.out.println("Ingrese la temperatura inicial ? (Valor menor)"); ti = obj.nextFloat();
                System.out.println("Ingrese la temperatura final ? (Valor mayor)"); tf = obj.nextFloat();
            } while (tf < ti);
            System.out.println("Centigrados\tFarenheit");
            while (ti <= tf) {
                f = (ti * 9 / 5) + 32;
                System.out.printf("%.2f\t\t%.2f\n", ti, f);
                ti++;
            }
            System.out.println("Desea continuar (S/N) ? ");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nProceso terminado...");
    }
}
