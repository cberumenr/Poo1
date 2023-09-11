//Imprimir los primeros n números de la serie de Fibonacci, hasta que el usuario elija
//Cristian Berumen Ramírez
//10-09-2023 - Versión 1.0

import java.util.Scanner;

public class _p51_SerieFibonacci {
    public static void main(String[] args) {
        int n1, n2, n3, n ,fn;
        char resp;
        Scanner obj = new Scanner(System.in);

        do{
            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.println("Imprimir los primeros n numeros de la serie de Fibonacci, hasta que el usuario elija ");
            System.out.println("Ingrese el valor maximo ? "); n = obj.nextInt();
            System.out.println("La sucesion de fibonacci es: ");

            n1 = 0;
            n2 = 1;

            if (n >= 1) {
                System.out.printf("%d ", n1);
            }
            if (n >= 2) {
                System.out.printf("%d ", n2);
            }

            fn = 3;

            while (fn < n) {
                n3 = n1 + n2;
                System.out.print(n3 + " ");
                n1 = n2;
                n2 = n3;
                fn = n3;
            }

            System.out.println("\nDesea continuar (S/N) ? ");
            resp = Character.toUpperCase(obj.next().charAt(0));

        } while (resp != 'N');
        
        System.out.println("\nProceso terminado...");
    }
}
