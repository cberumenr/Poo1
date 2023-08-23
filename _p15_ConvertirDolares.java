//Cotizar en dolares una cantidad en pesos
//Cristian Berumen Ramírez
//23-08-2023 - Versión 1.0

import java.util.Scanner;

public class _p15_ConvertirDolares {
    public static void main(String[] args) {
         System.out.print("\033[H\033[2J"); System.out.flush();

         double precioDolar, cantidadPesos, cantidadDolar;
         Scanner obj = new Scanner(System.in);

         System.out.print("Cual es el precio del dolar en este momento ?\n"); precioDolar = obj.nextFloat();
         System.out.print("Que cantidad de dinero quiere convertir ?\n"); cantidadPesos = obj.nextFloat();
         
         cantidadDolar = cantidadPesos/precioDolar;

         System.out.printf("%.2f Pesos, son equivalentes a %.2f Dolares\n", cantidadPesos, cantidadDolar);
    }
}