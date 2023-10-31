//Aprendiendo excepciones
//Cristian Berumen Ramírez
//31-10-2023 - Versión 1.0

import java.util.Scanner;
public class _p122_Excepcion2 {
    public static void main(String[] args) {
        try {
            System.out.println("Dame un numero: ");
            int num = new Scanner(System.in).nextInt();
            num = num + 5;
            System.out.println("El nueo valor es " + num);
        } catch(Exception e) {
            System.out.println("Debes introducir un valor numerico");
        }
    }
}
