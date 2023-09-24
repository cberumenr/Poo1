//Ingresando 4 números enteros devuelve el menor de ellos
//Cristian Berumen Ramírez
//21-09-2023 - Versión 1.0

import java.util.Scanner;

public class _p75_NumeroMenor {
    public static float Menor(float n1, float n2, float n3, float n4) {
        float men = 0;
        if (n1 < n2 && n1 < n3 && n1 > n4) men = n1;
        else if (n2 < n1 && n2 < n3 && n2 < n4) men = n2;
        else if (n3 < n1 && n3 < n2 && n3 < n4) men = n3;
        else if (n4 < n1 && n4 < n2 && n4 < n3) men = n4;
        else men = n1; //Por si los 4 numeros ingresados son iguales
        return men;
    }
    public static void main(String[] args) {
        float n1, n2, n3, n4;
        Scanner in = new Scanner(System.in);
        
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.print("Dame 4 nueros separados por enter ? \n");
        n1 = in.nextInt(); n2 = in.nextInt(); n3 = in.nextInt(); n4 = in.nextInt();

        System.out.printf("\nEl mayor de los cuatro numeros es: %.2f ", Menor(n1, n2, n3, n4));

    }
}