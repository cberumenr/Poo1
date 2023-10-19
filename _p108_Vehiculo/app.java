package _p108_Vehiculo;

import java.util.ArrayList;

public class app {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("CP987546", "Nissan", 2022, 1356000);
        Vehiculo v2 = new Vehiculo("CP918167", "Nissan", 2003, 175000);
        Vehiculo v3 = new Vehiculo("CP19174D", "Ford", 2000, 85000);
        Vehiculo v4 = new Vehiculo("CP189ER6", "Chevrolet", 2020, 570000);
        
        Compacto c1 = new Compacto(v1, 2, 2);
        Compacto c2 = new Compacto(v2, 0, 0);
        Camioneta t1 = new Camioneta(v3, 2500, 2);
        Camioneta t2 = new Camioneta(v4, 2000, 4);

        System.out.println("Datos de los ");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(t2);
        System.out.println(t2);

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(v1);
        vehiculos.add(v2);
        vehiculos.add(v3);
        vehiculos.add(v4);

        double total = 0;
        System.out.println("\nCalculando el total de precio de todos los vehiculos");
        for(Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.getPrecio());
            total += vehiculo.getPrecio();
        }
        System.out.println("La suma de los precios es: " + total);

    }
}
