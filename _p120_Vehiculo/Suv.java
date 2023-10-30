package _p120_Vehiculo;

public class Suv extends Maquina implements TodoTerreno {
    public Suv(String nombre, String propietario, int Pasajeros) {
        super(nombre, propietario, Pasajeros);
    }

    @Override
    public void sistemaElectrico() {
        System.out.println("Es un automovil con sistema electrico, es una Suv");
    }

    @Override
    public void combustionInterna() {
        System.out.println("Es un automovil de combustion Interna, es una Suv");
    }

    @Override
    public void traccion4x4() {
        System.out.println("Es un automovil con traccion 4 x 4, es una Suv");
    }

    @Override
    public void chasisIndependiente() {
        System.out.println("Es un automovil con chasis independiente, es una Suv");
    }

}
