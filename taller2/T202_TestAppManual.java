package taller2;

import javax.swing.*;
import java.awt.*;

public class T202_TestAppManual {

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JPanel panelIzquierda = new JPanel();
        JPanel panelCentro = new JPanel();
        JPanel panelDerecho = new JPanel();

        panelIzquierda.setLayout(new BorderLayout());

        JLabel labelTituloIzq = new JLabel("Menu");
        JLabel labelFooterIzquierda = new JLabel("Selecciona una opcion");

        JButton button1Izquierda = new JButton("1. Opcoin A");
        JButton button2Izquierda = new JButton("2. Opcoin B");
        JButton button3Izquierda = new JButton("3. Opcoin C");
        JButton button4Izquierda = new JButton("4. Opcoin D");

        JPanel panelOpcionesIzquierda = new JPanel();

        panelOpcionesIzquierda.setLayout(new BoxLayout(panelOpcionesIzquierda,BoxLayout.Y_AXIS));

        panelOpcionesIzquierda.add(button1Izquierda);
        panelOpcionesIzquierda.add(button2Izquierda);
        panelOpcionesIzquierda.add(button3Izquierda);
        panelOpcionesIzquierda.add(button4Izquierda);

        panelIzquierda.add(labelTituloIzq, BorderLayout.NORTH);
        panelIzquierda.add(panelOpcionesIzquierda, BorderLayout.CENTER);
        panelIzquierda.add(labelFooterIzquierda, BorderLayout.SOUTH);


        frame.add(panelIzquierda, BorderLayout.WEST);

        //Panel del centro
        panelCentro.setLayout(new BoxLayout(panelCentro,BoxLayout.Y_AXIS));

        JLabel labelTituloCentro = new JLabel("Iniciar sesion");
        JTextField textFieldUsuarioCentro = new JTextField();
        JTextField textFieldContraseñaCentro = new JTextField();
        JButton buttonAceptarCentro = new JButton("Aceptar");

        panelCentro.add(labelTituloCentro);
        panelCentro.add(textFieldUsuarioCentro);
        panelCentro.add(textFieldContraseñaCentro);
        panelCentro.add(buttonAceptarCentro);

        frame.add(panelCentro, BorderLayout.CENTER);

        //Configuracion del JFrame se deja al final

        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }



}
