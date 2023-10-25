package _p114_Animal;

public class Gato implements Animal {
    @Override
    public void dormir() {
        System.out.println("El gao duerme en la caja");
    }
    @Override
    public void sonido() {
        System.out.println("El gato hace miau");
    }
}
