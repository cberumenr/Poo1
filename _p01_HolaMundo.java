//Manda un saludo a la pantalla
//Cristian Berumen Ramírez
//17-08-2023 Versión 1.0

public class _p01_HolaMundo {
    public static void main(String[] args) {
        String amigo = "Sayra";
        String hermano = "Salvador";
        String mensaje = String.format("Tanto %s como %s desean aprender Java",amigo,hermano);
        
        System.out.println("Hola Mundo desde el Lenguaje Java");
        System.out.println("\nHola Amigo " + amigo + " bienvenido a Java");
        System.out.println("\nMi amigo es " + amigo + " mi hermano es " + hermano);
        System.out.println(mensaje);


    }
}