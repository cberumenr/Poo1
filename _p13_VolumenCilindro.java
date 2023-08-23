//Calular el volumen de un cilindro dado su radio y altura
//Cristian Berumen Ramírez
//23-08-2023 - Versión 1.0

import java.util.Scanner;

public class _p13_VolumenCilindro {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        double radio, altura, volumen;
        Scanner obj = new Scanner(System.in);

        System.out.print("Ingrese el radio del cilindro\n"); radio = obj.nextFloat();
        System.out.print("Ingrese la altura del cilindro\n"); altura = obj.nextFloat();

        volumen = Math.PI*(radio*radio)*altura;

        System.out.printf("El volumen del cilindro es: %.2f", volumen);
    }
}