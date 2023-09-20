//Suma los digitos de un numero entero
//Cristian Berumen Ramírez
//20-09-2023 - Versión 1.0

import java.util.Scanner;

public class _p71_SumaDigitos {
    public static int SumaDigitos(int n) {
        int suma = 0, digito;
        while(n != 0) {
            digito = n % 10;
            n = n / 10;
            suma += digito;
        }
        return suma;
    }
    public static void main(String[] args) {
        int numero;
        Scanner in = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.print("Dame un numero ? "); numero = in.nextInt();
        
        System.out.printf("La suma de los digitos es: %d ", SumaDigitos(numero));
    }   
}