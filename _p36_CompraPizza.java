//Solicitud de compra de pizza
//Cristian Berumen Ramírez
//01-09-2023 - Versión 1.0

import java.util.Scanner;

public class _p36_CompraPizza {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        Scanner obj = new Scanner(System.in);
        int precio = 0, total, totalcd;
        double descuento = 0;

        System.out.println("Bienvenido, tenemos 3 tipos de pizza disponibles:");
        System.out.println("[C] - Chica");
        System.out.println("[M] - Mediana");
        System.out.println("[G] - Grande");
        System.out.println("Por favor elija el tamaño");

        char size = Character.toUpperCase(obj.next().charAt(0));
        
        switch (size) {
            case 'C':
                precio = 5;
                break;
            case 'M':
                precio = 10;
                break;
            case 'G':
                precio = 20;
                break;
            default:
                System.out.println("Seleccion invalida !");
                break;
        }
        System.out.println("Cuantas pizzas desea comprar ?");
        int cantidad = new Scanner(System.in).nextInt();
        
        total = precio * cantidad;

        if (total > 2000){
            descuento = 0.15;
            totalcd = (int) (total - (total * descuento));
        }
        else
            totalcd = total;
        
            System.out.println("Este es el total de su compra:\n");
            System.out.printf("Tamaño: %s\n", size);
            System.out.printf("Cantidad: %d\n", cantidad);
            System.out.printf("Total de la compra: %d\n", total);
            System.out.printf("Descuento: %.2f\n", descuento);
            System.out.printf("Total con descuento: %d\n", totalcd);
    }
}
