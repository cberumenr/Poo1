//Iniciliza al declarar dos arreglos, uno de nombres y otro de edades
//Cristian Berumen Ramírez
//26-09-2023 - Versión 1.0

public class _p83_InicializaNombresEdades {
    public static void main(String[] args) {
        String[] nombres = {"Juan", "Pedro", "Cristian", "Luis", "Sayra", "Victoria"};
        int[] edades = {22, 25, 20, 24, 20, 18};

        System.out.println("\nLos nombres son:");
        for(String nombre : nombres)
            System.out.println(nombre);
        
        System.out.println("\nLas edades son");
        for(int edad : edades)
            System.out.println(edad);
        
        System.out.println("\nCada nombre con su respectiva edad");
        for(int i = 0; i < nombres.length; i++) {
            System.out.printf("Nombre: %s, Edad: %d, Nombre: %s\n", nombres[i], edades[i], nombres[i].toUpperCase());
        }

    }
}
