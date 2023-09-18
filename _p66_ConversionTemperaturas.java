//Convertir grados C a F y viceversa, usando una función
//Cristian Berumen Ramírez
//18-19-2023 - Versión 1.0

import java.util.Scanner;

public class _p66_ConversionTemperaturas {
    //Funciones
    public static float Farenheit(float t) {
        float r;
        r = (t * 9 / 5) + 32;
        return r;
    }

    public static float Celsius(float t) {
        float r;
        r = (t - 32) * 5 / 9;
        return r;
    }
    //Sistema principal
    public static void main(String[] args) {
        int op;
        float temp = 0, res = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("[1] Farenheit\n[2] Cenigrados\nElige ? "); op = in.nextInt();

        switch (op) {
            case 1:
                System.out.print("CONVERTIR A FARENHEIT\nDame la temperatura ? "); temp = in.nextFloat();
                res = Farenheit(temp);
                System.out.printf("La temperatura equivale a: %.2f F", res);
                break;

            case 2:
                System.out.print("CONVERTIR A CENTIGRADOS\nDame la temperatura ? "); temp = in.nextFloat();
                res = Celsius(temp);
                System.out.printf("La temperatura equivale a: %.2f C", res);
                break;
            
            default: System.out.println("Opcion invalida...");
        }

    }
}
