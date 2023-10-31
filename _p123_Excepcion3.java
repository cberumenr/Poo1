//Aprendiendo excepciones
//Cristian Berumen Ramírez
//31-10-2023 - Versión 1.0

import java.util.InputMismatchException;
import java.util.Scanner;

public class _p123_Excepcion3 {
    public static void main(String[] args) {
        try {
            Scanner obj = new Scanner(System.in);
            System.out.println("Dame el numerador: "); int a = obj.nextInt();
            System.out.println("Dame el denominador: "); int b = obj.nextInt();
            int c = a / b;
            System.out.println("El resultado es: " + c);
        } catch (InputMismatchException e) {
            System.out.println("Ambos valores deben de ser numeericos");
        } catch (ArithmeticException e) {
            System.out.println("El denominador no puede ser cero");
        } finally {
            System.out.println("Si no la regaste felicidades, y si la regaste, ponte abusado");
        }
        
    }
}
