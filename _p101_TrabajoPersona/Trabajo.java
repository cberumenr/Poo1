package _p101_TrabajoPersona;

public class Trabajo {
    private int in;
    private String rol;
    private double salario;

    public Trabajo() {
    }

    public Trabajo(int in, String rol, double salario) {
        this.in = in;
        this.rol = rol;
        this.salario = salario;
    }

    public int getIn() {
        return in;
    }

    public void setIn(int in) {
        this.in = in;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Trabajo [in=" + in + ", rol=" + rol + ", salario=" + salario + "]";
    }

    
}

