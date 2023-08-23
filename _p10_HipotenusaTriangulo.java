//Calcular la hipotenusa de un triángulo rectángulo
//Cristian Berumen Ramírez
//23-08-2023 - Versión 1.0

import java.util.Scanner;

public class _p10_HipotenusaTriangulo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        
        double longitudLado1, longitudLado2, hipotenusa;
        Scanner obj=new Scanner(System.in);
        
        System.out.print("Vamos a calcular la hipotenusa de un triangulo rectangulo conociendo la logitud de dos sus lados\n");
        System.out.print("Longitud del lado 1 ?\n"); longitudLado1=obj.nextFloat();
        System.out.print("Longitud del lado 2 ?\n"); longitudLado2=obj.nextFloat();

        hipotenusa = Math.sqrt((longitudLado1*longitudLado2)+(longitudLado2*longitudLado1));

        System.out.printf("Con las medidas indicadas, la longitud de la hipotenusa es: %.2f", hipotenusa);
        
    }
}