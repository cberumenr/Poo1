//Mostrar el continente respecto al numero ingresado
//Cristian Berumen Ramírez
//01-09-2023 - Versión 1.0

import java.util.Scanner;

public class _p35_ContinentesMundo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.print("Clasificaremos los continentes con numeros del 1 al 6, imprime el continente del numero dado\n");
        System.out.print("Dame el numero del continente ?\n");
        
        int cont = new Scanner(System.in).nextInt();

        switch (cont) {
            case 1:
                System.out.println("Asia");
                break;
            case 2:
                System.out.println("Africa");
                break;
            case 3:
                System.out.println("America del Norte");
                break;
            case 4:
                System.out.println("America del Sur");
                break;
            case 5:
                System.out.println("Antartida");
                break;
            case 6:
                System.out.println("Europa");
                break;
            default:
                System.out.println("Nmero invalido, por favor ingresa un numero entre 1 y 6");
                break;
        
        }


    }
}
