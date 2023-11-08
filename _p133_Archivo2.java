//Escritura de archivo
//Cristian Berumen Ramírez
//07-11-2023 - Version 1.0

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class _p133_Archivo2 {
    public static void main(String[] args) {
        String[] nombres = {"Juan", "Pedro", "Luis", "Jose", "Reynaldo", "Maria", "Teresa", "Rocio"};
        File arch = new File("nombres.txt");

        if (arch.exists()) {
            try {
                BufferedWriter fnombres = new BufferedWriter(new FileWriter(arch));
                for (String nombre : nombres)
                fnombres.write(nombre + "\n");
                fnombres.close();
            } catch (Exception e) {
                System.out.println("Problemas al procesar el archivo..");
                System.out.println(e);
            }
        } else {
            System.out.println("El archivo ya existe!!");
           
        }
        System.out.println("Longitud final del archivo escrito " + arch.length());
    }
}
