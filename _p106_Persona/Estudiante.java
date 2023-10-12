package _p106_Persona;

public class Estudiante extends Persona {
    private String Carrera;
    private int Year;
    private double Colegiatura;
    
    public Estudiante() {
    }
    
    public Estudiante(String nombre, String direccion, String carrera, int year, double colegiatura) {
        super(nombre, direccion);
        Carrera = carrera;
        Year = year;
        Colegiatura = colegiatura;
    }

    public Estudiante(Persona persona, String carrera, int year, double colegiatura) {
        super(persona.Nombre, persona.Direccion);
        Carrera = carrera;
        Year = year;
        Colegiatura = colegiatura;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String carrera) {
        Carrera = carrera;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public double getColegiatura() {
        return Colegiatura;
    }

    public void setColegiatura(double colegiatura) {
        Colegiatura = colegiatura;
    }

    @Override
    public String toString() {
        return "Estudiante [Carrera=" + Carrera + ", Year=" + Year + ", Colegiatura=" + Colegiatura + "]";
    }
    
}
