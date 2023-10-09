package _p103_ClienteFactura;

public class Cliente {
    private String id;
    private String Nombre;
    private int Desuento;

    public Cliente() {
    }

    public Cliente(String id, String nombre, int desuento) {
        this.id = id;
        Nombre = nombre;
        Desuento = desuento;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getDesuento() {
        return Desuento;
    }

    public void setDesuento(int desuento) {
        Desuento = desuento;
    }

    @Override
    public String toString() {
        return "Cliente [id=" + id + ", Nombre=" + Nombre + ", Desuento=" + Desuento + "]";
    }

}
