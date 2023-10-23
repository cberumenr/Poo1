package _p113_SegundoExamenParcial;

import java.util.ArrayList;

public class Equipo {
    private String Nombre;
    private String Liga;
    private ArrayList<Jugador> Jugadores;
    
    public Equipo() {
        Jugadores = new ArrayList<>();
    }

    public Equipo(String nombre, String liga){
        this();
        Nombre = nombre;
        Liga = liga;
    }

    public ArrayList<Jugador> getJugadores() {
        return Jugadores;
    }

    public void agregarJugador(Jugador jugador) {
        Jugadores.add(jugador);
    }

    public double getTotalBono() {
        double totalBono = 0;
        for (Jugador jugador : Jugadores) {
            totalBono += jugador.getBono();
        }
        return totalBono;
    }

    public double getTotal() {
        double total = 0;
        for (Jugador jugador : Jugadores) {
            total += jugador.getTotal();
        }
        return total;
    }

    public int getTotalH() {
        int totalH = 0;
        for (Jugador jugador : Jugadores) {
            if(jugador.Sexo == 'H') totalH += 1;
        }
        return totalH;
    }

    public int getTotalM() {
        int totalF = 0;
        for (Jugador jugador : Jugadores) {
            if(jugador.Sexo == 'F') totalF += 1;
        }
        return totalF;
    }
    
    public void reporte() {
        System.out.println(">> " + this.toString());
        System.out.println();
        for (Jugador jugador : Jugadores) {
            System.out.println(">> " + jugador);

        }
    }


    @Override
    public String toString() {
        return "Equipo [Nombre=" + Nombre + ", Liga=" + Liga + ", Total= " + getTotal() + ", Bono= " + getTotalBono() + ", Hombres= " + getTotalH() + ", Mujeres= " + getTotalM() + "]";
    }

    

    
}
