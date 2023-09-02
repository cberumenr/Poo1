//Aceptar un estudiante en base a su edad, sexo y promedio
//Cristian Berumen Ranírez
//01-09-2023 - Versión 1.0

import java.util.Scanner;

public class _p38_AceptarEstudianteV2 {
    public static void main(String[] args) {
        String name;
        char sex;
        int age;
        float cal1, cal2, cal3, promedio;
        Scanner obj = new Scanner(System.in);
        
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("Acepta un estudiante en base a su edad, sexo y promedio\n");
        System.out.print("Dame tu nombre ?\n");

        name = obj.nextLine();

        System.out.print("Cual es tu sexo ? (Elige una opcion):\n[M] asculino\n[F] emenino\n");

        sex = Character.toUpperCase(obj.next().charAt(0));

        System.out.print("Dame tu edad ?\n");

        age = obj.nextInt();

        if (sex == 'F' && age >= 21) {
            System.out.print("Excelente, eres mujer y mayor 21 años, continuemos\n");
            System.out.print("Dame tus 3 calificaciones separadas por Enter\n");
            
            cal1 = obj.nextFloat();
            cal2 = obj.nextFloat();
            cal3 = obj.nextFloat();

            promedio = (cal1 + cal2 + cal3) / 3;

            if (promedio >= 8 && promedio <= 9.5) System.out.print("Felicidades, y bienvenida a la Universidad Kitty Kat SA");
            else System.out.print("Lo siento, en la Univesidad Kity Kat SA, solo aceptamos promedios entre 8 y 9.5");
        }
        else System.out.print("Lo sentimos, pero la Universidad Kitty Kat SA solo se admiten mujeres mayores a 21");
    }

}

