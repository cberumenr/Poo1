//Pide un número entre 1 y 7 y devuelva el día de la semana con letra
//Cristian Berumen Ramírez
//21-09-2023 - Versión 1.0

import java.util.Scanner;

public class _p76_DiaSemana {
    public static int Dia(int num) {
        switch (num) {
            case 1:
                System.out.print("Lunes");
                break;
            case 2:
                System.out.print("Martes");
                break;
            case 3:
                System.out.print("Miercoles");
                break;
            case 4:
                System.out.print("Jueves");
                break;
            case 5:
                System.out.print("Viernes");
                break;
            case 6:
                System.out.print("Sabado");
                break;
            case 7:
                System.out.print("Domingo");
                break;
            default:
                System.out.println("Dia invalido");
        }
        return num;
            
    }
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.print("Ingrese un numero del 1 al 7 ? ");
        num = in.nextInt();

        System.out.printf(" es el dia de la semana equivalente al numero " + Dia(num));
    }
}
