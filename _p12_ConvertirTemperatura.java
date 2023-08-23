//Convertir una temperatura de Farenheit a Celsius
//Cristian Berumen Ramírez
//23-08-2023 - Versión 1.0

import java.util.Scanner;

public class _p12_ConvertirTemperatura {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        
        double temperaturaF, temperaturaC;
        Scanner obj = new Scanner(System.in);

        System.out.print("Introduce la temperatura en Farenheit\n"); temperaturaF = obj.nextFloat();

        temperaturaC = (temperaturaF - 32)*5/9;

        System.out.printf("La temperatura en grados Celcius es: %.2f\n", temperaturaC);
    }
}
