//Calcular la paga de un empelado
//Cristian Berumen Ramirez
//17-18-2023 Version 1.0

import java.util.Scanner;

public class _p04_PagaTrabajador {
    public static void main(String[] args) {
        String nombre;
        int horas;
        double paga, tasa, impuesto, pagabruta, paganeta;
        Scanner obj = new Scanner(System.in);
        
        //Entrada
        System.out.print("Nombre del trabajador\n"); nombre = obj.nextLine();
        System.out.print("Horas trabajadas\n"); horas = obj.nextInt();
        System.out.print("Paga por hora\n"); paga = obj.nextFloat();
        tasa = 0.03;
        
        //Calcula
        pagabruta = horas * paga;
        impuesto = pagabruta * tasa;
        paganeta = pagabruta - impuesto;
        
        //Salida
        System.out.println("Resumen de pagos\n");        
        System.out.println(String.format("El trabjador %s, trabajo %d horas, con un pago de %.2f pesos la hora, se asume una tasa de impuesto de %.2f",nombre,horas,paga,tasa));
        System.out.println(String.format("Paga bruta: %.2f",pagabruta));
        System.out.println(String.format("Impuesto: %.2f",impuesto));
        System.out.println(String.format("Paga neta: %.2f",paganeta));
    }
}
