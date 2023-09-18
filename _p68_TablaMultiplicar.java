//Imprime la tabla que el usuario pide, hasta dónde lo pida, usando funciones
//Cristian Berumen Ramírez
//18-09-2023 - Versión 1.0

import java.util.Scanner;

public class _p68_TablaMultiplicar {

    public static void TablaMultiplicar(int t, int n) {
        System.out.printf("Tabla del %d\n", t);
        for (int i = 1; i <= n; i++)
            System.out.printf("%d x %d = %d\n", t, i, t*i);
    }
    public static void main(String[] args) {
        int t, n;
        Scanner in = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.print("Que tabla quieres ? "); t = in.nextInt();
        System.out.print("Hasta donde ? "); n = in.nextInt();

        TablaMultiplicar(t, n);
    }
}
