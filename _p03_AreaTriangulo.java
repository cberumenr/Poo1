//Calcula el área de un Triángulo
//Cristian Berumen Ramírez
//17-08-2023 Versión 1.0

import java.util.Scanner;

public class _p03_AreaTriangulo {
    public static void main(String[] args) {
        int base, altura;
        double area;
        Scanner obj = new Scanner(System.in);

        System.out.print("Dame la base\n");
        base = obj.nextInt();
        System.out.print("Dame la altura\n");
        altura = obj.nextInt();

        area = base * altura / 2;

        System.out.println(String.format("El triangulo de base %d y altura %d tiene un area de %f", base, altura, area));

    }
    
}
