//Convertir de pulg a cm y de ft a m con funciones
//Cristian Berumen Ramírez
//21-09-2023 - Versión 1.0

import java.util.Scanner;

public class _p77_MedidasLongitud {
    public static float Inches(float inch, float cm) {
        cm = inch * 2.54f;
        return cm;
    }
    public static float Feet(float ft, float m) {
        ft = m * 3.281f;
        return ft;
    }
    public static void main(String[] args) {
        float inch = 0, m = 0, cm = 0, ft = 0;
        char op;
        Scanner in = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("Elige la opcion que vas a utilizar:\n[P] ulgadas - Centimetros\n[M] etros - pies");
        op = Character.toUpperCase(in.next().charAt(0));

        switch (op) {
            case 'P':
                System.out.println("Ingresa la cantidad de pulgadas a convertir ");
                inch = in.nextFloat();
    
                System.out.printf("%.2f pulgadas es igual a %.2f centimetros", inch, Inches(inch, cm));
                break;
            case 'M':
                System.out.println("Ingresa la cantidad de metros a convertir ");
                m = in.nextFloat();

                System.out.printf("%.2f metros, es igual a %.2f pies", m, Feet(ft, m));
                break;
            default:
                System.out.println("Opcion invalida... ");
        }
    }
}