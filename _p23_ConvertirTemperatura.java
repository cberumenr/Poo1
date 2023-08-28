//Convertir de centígrados a farenheit y viceversa
//Cristian Berumen Ramírez
//28-08-2023 - Versión 1.0

import java.util.Scanner;

public class _p23_ConvertirTemperatura {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        char op;
        float temp, res;
        Scanner obj = new Scanner(System.in);

        System.out.println("Convierte de cenigrados a farenheit y viceversa");
        System.out.println("[F] arenheit a Centigrados");
        System.out.println("[C] entigrados a Farenheit");
        System.out.println("Elije una opcion ?");
        op = Character.toUpperCase( obj.next().charAt(0));
        
        if (op == 'F') {
            System.out.println("Dame la temperatura en Farenheit ?");
            temp = obj.nextFloat();
            res = (temp - 32) * 5 / 9;
            System.out.printf("\nLa temperatura en grados %.2f farenheit equivale a %.2f grados centigrados", temp, res);
        }
        else if ( op == 'C') {
            System.out.println("Dame la temperatura en Centigrados ? ");
            temp = obj.nextFloat();
            res = (temp * 9 / 5) + 32;
            System.out.printf("\n%.2f grados centigrados equivale a %.2f grados farenheit", temp, res);
        }
        else
            System.out.println("Opcion invalida");

    }
}
