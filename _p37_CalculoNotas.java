//Calcular el promedio de 5 calificaciones e imprimir mensaje personalizado
//Cristian Berumen Ramírez
//01-09-2023 - Versión 1.0

import java.util.Scanner;

public class _p37_CalculoNotas {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        Scanner obj = new Scanner(System.in);

        float cal1, cal2, cal3, cal4, cal5, promedio;

        System.out.println("Ingresa tus calificaciones separadas por Enter (Deben de ser 5) ?");
        cal1 = obj.nextFloat();
        cal2 = obj.nextFloat();
        cal3 = obj.nextFloat();
        cal4 = obj.nextFloat();
        cal5 = obj.nextFloat();

        promedio = (cal1 + cal2 + cal3 + cal4 + cal5) / 5;

        if (promedio <= 6) System.out.printf("Tu promedio es: %.2f. Quedas reprobado", promedio);
        if (promedio > 6 && promedio <= 7) System.out.printf("Tu promedio es: %.2f. Pasas de panzazo", promedio);
        if (promedio > 7 && promedio <= 8) System.out.printf("Tu promedio es: %.2f. Muy bien, puedes mejorar", promedio);
        if (promedio > 8 && promedio <= 9) System.out.printf("Tu promedio es: %.2f. Excelente, sigue asi", promedio);
        if (promedio > 9 && promedio <= 7) System.out.printf("Tu promedio es: %.2f. Perfecto, tu esfuerzo se ve reflejado", promedio);
    }
}
