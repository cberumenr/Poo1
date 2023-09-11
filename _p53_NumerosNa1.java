
// Numeros de n a 1 con paso de p
//Cristian Berumen Ramírez
//11-09-2023 - Versión 1.0

import java.util.Scanner;

public class _p53_NumerosNa1 {
    public static void main(String[] args) {
        int n, p;
        Scanner obj = new Scanner(System.in);
        
        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("Numeros de n a 1 con paso de p:");
        System.out.print("Desde donde ? ");
        
        n = obj.nextInt();
        
        System.out.print("Paso ? ");
        
        p = obj.nextInt();
        
        for (int i = n; i >= 1; i -= p) {

            System.out.printf("%d ", i);

        }
    }
}