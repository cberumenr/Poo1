//Capture n números en un arreglo  y mostrarlos
//Cristian Berumen Ramírez
//02-10-2023 - Versión 1.0

import java.util.Scanner;

public class _p92_MayorMenor {
    public static void mostrar(int[] a) {
        for(int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
    public static int mayor(int[] a) {
        int m = a[0];
        for(int i = 0; i < a.length; i++)
            if(a[i] > m) m = a[i];
        return m;
    }
    public static int menor(int[] a) {
        int m = a[0];
        for(int i = 0; i < a.length; i++)
            if(a[i] < m) m = a[i];
        return m;
    }
    public static void main(String[] args) {
        int n = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("\033[H\033[2J");System.out.flush();

        System.out.print("Cuantos numeros desea capturar ? "); n = in.nextInt();
        int[] nums = new int[n];

        System.out.printf("\nIntroduce los %d numeros que dijiste \n", n);
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        System.out.print("Elementos del arreglo: "); mostrar(nums);
        System.out.printf("\nNumero mayor del arreglo: %d ", mayor(nums));
        System.out.printf("\nNumero menor del arreglo: %d ", menor(nums));

    }    
}
