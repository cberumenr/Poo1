//Genera números aleatorios
//Cristian Berumen Ramírez
//27-09-2023 - Versión 1.0

import java.util.Random;
public class _p88_Aleatorios {
    public static void main(String[] args) {
        Random rnd = new Random();

        int aleatorio1 = rnd.nextInt();
        int aleatorio2 = rnd.nextInt(30);
        int aleatorio3 = Math.abs(rnd.nextInt(100 - 50)) + 50;

        System.out.print("\033[H\033[2J");System.out.flush();


        System.out.println("Numero entero aleatorio             > " + Math.abs(aleatorio1));
        System.out.println("Numero entero aleatorio 0 - - 29    > " + Math.abs(aleatorio2));
        System.out.println("Numero entero aleatorio 50 - - 99   > " + aleatorio3);
    }
}
