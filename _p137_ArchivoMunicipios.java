import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class _p137_ArchivoMunicipios {
    public static void main(String[] args) {
        String[] deportes    = {"Futbol", "Beisbol", "Ciclismo", "Atletismo", "Natacion", "Motociclismo"};
        File arch = new File("deportes.txt");

        if  (arch.exists()) {
            try {
                BufferedWriter fdeportes = new BufferedWriter(new FileWriter(arch));
                for (String deporte : deportes) {
                    fdeportes.write(deporte + "\n");
                    fdeportes.close();
                }
                System.out.println("Se han escrito los datos");
            } catch (Exception e) {
                System.out.println("Problemas al procesar el archivo...");
                System.out.println(e);
            }

        } else if (arch.exists()) {
            try {
                BufferedReader fdeportes = new BufferedReader(new FileReader(arch));
                String linea;
                while (linea = fdeportes.readLine()!= null)
                    System.out.println(linea);
                fdeportes.close();
            } catch (Exception e) {
                System.out.println("Problemas al procesar el archivo...");
                System.out.println(e);
            }
        }
        System.out.println("El archivo no existe!!");
        } else {
            System.out.println("El archivo no existe");
        }
    }
}
