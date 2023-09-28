//Genera arreglos aleatorios y los sumas
//Cristian Berumen Ramírez
//27-09-2023 - Versión 1.0

import java.util.Random;

public class _p89_ArregloAleatorios {
    public static void Mostrar(float[] a) {
        for(int i = 0; i < a.length; i ++)
            System.out.printf("%.3f ", a[i] + " ");
        System.out.println();
    }

    public static void GenerarAleatorios(float[] a) {
        float min = 10.5f, max = 41.5f;
        Random rnd = new Random();
        for(int i = 0; i < a.length; i++)
            a[i] = Math.abs(rnd.nextFloat(max - min)) + min;
    }

    public static void SumarArreglos(float[] a, float [] b, float[] c) {
        for(int i = 0; i < a.length; i++)
            c[i] = a[i] + b[i];
    }
    public static void main(String[] args) {
        int MAX = 15;
        float[] nums1 = new float[MAX];
        float[] nums2 = new float[MAX];
        float[] nums3 = new float[MAX];

        System.out.print("\033[H\033[2J");System.out.flush();

        System.out.println("\nPrimer arreglo de numeros aleatorios ");
        GenerarAleatorios(nums1); Mostrar(nums1);
        System.out.println("\nSegundo arreglo de numeros aleatorios ");
        GenerarAleatorios(nums2); Mostrar(nums2);
        System.out.println("\nSuma de los 2 arreglos");
        SumarArreglos(nums1, nums2, nums3); Mostrar(nums3);
        
    }    
}
