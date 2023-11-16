//Leyendo Archivos
//Cristian Berumen Ramírez
//07-11-2023 - Versión 1.0

import java.io.*;

public class _p134_Archivo3 {
    public static void main(String[] args) {
        File arch = new File("nombres.txt");
        if (arch.exists()) {
            try {
                BufferedReader fnombres = new BufferedReader(new FileReader(arch));
                String linea;
                while ((linea = fnombres.readLine()) !=null)
                    System.out.println(linea);
                fnombres.close();
            } catch (Exception e) {
                System.out.println("Problemas al procesar el archivo...");
                System.out.println(e);
            }
        } else {
            System.out.println("El archivo no existe!!");
        }
        System.out.println("Longitud final del archivo escrito " + arch.length());
    }
}
