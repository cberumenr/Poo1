//Inicializa de forma manual arreglo de números flotantes y lo imprime
//Cristian Berumen Ramírez
//26-09-2023 - Versión 1.0

public class _p81_InicializaArregloNumeros {
    public static void main(String[] args) {
        int MAX = 8;
        double[] nums = new double[7];

        nums[0] = 5.0;
        nums[1] = 10.0;
        nums[2] = 15.5;
        nums[3] = 20.0;
        nums[4] = 25.0;
        nums[5] = 100.22;
        nums[6] = 90.0;

        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.printf("Primer elemento del arreglo %.2f\n", nums[0]);
        System.out.printf("Ultimo elemento del arreglo %.2f\n", nums[6]);
        System.out.println("\nTodos los elementos del arreglo con ciclo for: ");
        for(int i = 0; i < nums.length; i++) {
            System.out.printf( "%.2f ", nums[i]);
        }
        System.out.println("\n\nTodos los elementos del arreglo con ciclo for - each:");
        for(double i : nums) {
            System.out.printf("%.2f ", i);
        }
        System.out.println("\nProceso terminado...");
    }
}
