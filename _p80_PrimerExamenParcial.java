//Resolver el problema planteado en clase
//Cristian Berumen Ramírez
//25-09-2023 - Versión 1.0

import java.util.Scanner;

public class _p80_PrimerExamenParcial {
    public static void main(String[] args) {
        int tage = 0, f = 0, m = 0, a = 0, d = 0, t = 0, n, i = 0, age, costo, tdinero;
        float prompar;
        char sex, type, resp;
        String name;
        Scanner in = new Scanner(System.in);
        
        System.out.print("\033[H\033[2J"); System.out.flush();
        
        System.out.println("Cuantas inscripciones vas a hacer ?");
        n = in.nextInt();

        do {
            System.out.println("Ingresa tu nombre");
            name = in.next();
            do {
                System.out.println("Ingresa tu edad"); 
                age = in.nextInt();
            } while (age < 18);
            tage += age;
            do {
                System.out.println("Cual es tu sexo?\nElige una opcion:\n[F] Femenino\n[M] Masculino");
                sex = Character.toUpperCase(in.next().charAt(0));
                switch (sex) {
                    case ('F'):
                        f += 1;
                        break;
                    case ('M'):
                        m += 1;
                        break;
                    default:
                        System.out.print("Opcion invalida...");
                }
            } while (sex != 'F' && sex != 'M');
            do {
                System.out.println("Tipo de inscripcion?\n[A] Alumno\n[D] Docente\n[T]Trabajador");
                type = Character.toUpperCase(in.next().charAt(0));
                switch (type) {
                    case ('A'):
                        a += 1;
                        break;
                    case ('D'):
                        d += 1;
                        break;
                    case ('T'):
                        t += 1;
                        break;
                    default:
                        System.out.print("Opcion invalida...");
                }
            } while (type != 'A' && type != 'D' && type != 'T');
            i++;
        } while (i < n);

        System.out.printf("Total de alumnos: %d", a);
        System.out.printf("\nTotal de docentes: %d", d);
        System.out.printf("\nTotal de trabajadores: %d", t);
        System.out.printf("\nTotal de hombres: %d", m);
        System.out.printf("\nTotal de mujeres: %d", f);
        System.out.printf("\nTotal de participantes: %d", n);
        prompar = (tage / n);
        System.out.printf("\nPromedio de la edad de todos los participantes: %.2f", prompar);

        a = a * 50; d = d * 80; t = t * 60;
        tdinero = a + d + t;
        System.out.printf("\nTotal del dinero recaudado de Alumnos %d", a);
        System.out.printf("\nTotal del dinero recaudado de Docentes %d", d);
        System.out.printf("\nTotal del dinero recaudado de Trabajadores %d", t);
        System.out.printf("\nTotal del dinero en general %d", tdinero);

        if (tdinero < 100) System.out.print("\nEl evento concluye con ganancias bajas");
        else if (tdinero > 100 && tdinero < 200) System.out.print("\nEl evento concluye con ganancias moderadas");
        else if (tdinero > 200) System.out.print("\nEl evento concluye con buenas ganancias");
    }
}
