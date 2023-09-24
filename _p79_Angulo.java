//Imprima el tipo del ángulo que corresponde al ingresado por el usuario
//Cristian Berumen Ramírez
//24-09-2023 - Versión 1.0

import java.util.Scanner;

public class _p79_Angulo {
    public static float Angulo(float angle) {
        if (angle >= 0 && angle < 90) System.out.print("El angulo es agudo");
        else if (angle == 90) System.out.print("El angulo es recto");
        else if (angle > 90 && angle < 180) System.out.print("El angulo es obtuso");
        else if (angle == 180) System.out.print("El angulo es llano");
        else if (angle > 180 && angle < 360) System.out.print("El angulo es concavo");
        return angle;
    }
    public static void main(String[] args) {
        float angle;
        Scanner in = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        do {
            System.out.print("Ingrese un angulo ? " );
            angle = in.nextFloat();
        } while (angle > 360);
        Angulo(angle);
    }    
}
