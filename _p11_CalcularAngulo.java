//Calcular el 3er ángulo de un triángulo dados los dos primeros
//Cristian Berumen Ramírez
//23-08-2023 - Versión 1.0

import java.util.Scanner;

public class _p11_CalcularAngulo {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        double angulo1, angulo2, angulo3;
        Scanner obj = new Scanner(System.in);

        System.out.print("Vamos a calcular el tercer angulo de un triangulo, conociendo los primeros dos\n");
        System.out.print("Medida del angulo 1 ?\n"); angulo1 = obj.nextFloat();
        System.out.print("Medida del angulo 2 ?\n"); angulo2 = obj.nextFloat();

        angulo3 = 180-(angulo1+angulo2);

        System.out.printf("La medida del tercer angulo en base a los 2 primeros es: %.2f", angulo3);
    }
}
