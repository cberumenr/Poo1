//Mundo GUI
//Cristian Berumen Ramírez
//08-11-2023 - Versión 1.0

import java.awt.*;
import javax.swing.*;

public class _p139_HolaMundoGUI extends JFrame {
    private JLabel lblSaludo;

    public _p139_HolaMundoGUI() {
        setLayout(null);
        lblSaludo = new JLabel("Hola Mundo GUI, Bienvenido");
        lblSaludo.setFont(new Font("Times New Roman", Font.BOLD, 40));
        
    }
}
