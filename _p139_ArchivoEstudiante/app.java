package _p139_ArchivoEstudiante;

import java.io.*;
import java.util.ArrayList;


public class app {
    public static void serializarDatos(String archivo, ArrayList<Estudiante> datos) throws IOException {
        FileOutputStream arch = new FileOutputStream(archivo);
        ObjectOutputStream festudiantes = new ObjectOutputStream(arch);
        festudiantes.writeObject(datos);
        festudiantes.close();
    }    

    public static ArrayList<Estudiante> desSerializarDatos(String archivo) throws IOException, ClassNotFoundException {
        ArrayList<Estudiante> datos;
        FileInputStream arch = new FileInputStream(archivo);
        ObjectInputStream festudiantes = new ObjectInputStream(arch);
        datos = (ArrayList<Estudiante>) festudiantes.readObject();
        festudiantes.close();
        return datos;
    }
    
    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Josue", 20, 7.8, 'M'));
        estudiantes.add(new Estudiante("Maria", 22, 9.2, 'F'));
        estudiantes.add(new Estudiante("Esteban", 19, 9.8, 'M'));

        try {
            serializarDatos("datos.dat", estudiantes);
        } catch (Exception e) {
            System.out.println("Problemas al procesar el archivo: " + e);
        }

        try {
            ArrayList<Estudiante> losestudiantes = desSerializarDatos("datos.dat");
            System.out.println("Los datos leidos del archivo son:");
            losestudiantes.forEach(p->System.out.println(p));
            System.out.println(losestudiantes.size());
        } catch (Exception e) {
            System.out.println("Problemas al procesar el archivo");
        }
    }
}
