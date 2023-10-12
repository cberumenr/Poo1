package _p98_Circulo;

public class Circulo {
    private double radio;
    private double area;
    private double circunferencia;

    
    public Circulo() {
    }

    public Circulo(double radio, double area, double circunferencia) {
        this.radio = radio;
        this.area = area;
        this.circunferencia = circunferencia;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia(double circunferencia) {
        this.circunferencia = circunferencia;
    }

    @Override
    public String toString() {
        return "Circulo [radio=" + radio + ", area=" + area + ", circunferencia=" + circunferencia + "]";
    }

}
