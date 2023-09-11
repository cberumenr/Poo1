//Imprimir los números pares de forma descendente, su suma y el promedio, desde 100 hasta donde el usuario elija (n)
//Cristian Berumen Ramírez
//10-09-2023 - Versión 1.0

import java.util.Scanner;

public class _p49_ParesDescendentes {
    public static void main(String[] args) {
        int cont, n, suma;
        float prom;
        char resp;
        Scanner obj = new Scanner(System.in);

        do{
            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.println("Imprimir los numeros pares de forma descendente, su suma y el promedio, desde 100 hasta donde el usuario elija (n) ");
            System.out.println("Hasta donde ? "); n = obj.nextInt();
            
            suma = 0;
            cont = 100;
            prom = 0;
            
            System.out.printf("\nNumeros pares entre 100 y %d: ", n);
            while (cont >= n) {
                System.out.printf("%d ", cont);
                suma += cont;
                cont -= 2;
                prom ++;
            }
            prom = suma /prom;
            System.out.printf("\nLa suma es %d ", suma);
            System.out.printf("\nEl promedio es %.2f ", prom);
            System.out.println("\nDesea continuar (S/N) ? ");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nProceso terminado...");
    }
}
