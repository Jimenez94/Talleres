package taller2b;

import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton();
        JButton button2 = new JButton();
        //-----------------------------------
        button.setText("Pulsame");
        button2.setText("Pulsame soy el boton 2");
        panel.add(button);
        panel.add(button2);

        frame.add(panel);
        //-----------------------------------
       /*button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Apretaste el boton");
            }
        });
       */
        //-----------------------------------
        //button.addActionListener(ControladorBoton);

        button.addActionListener(new ActionListener() {
            int contador = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Contador: " + contador++);
            }
        });

        //-----------------------------------
        frame.setTitle("Test Swing");
        frame.setSize(500, 500);
        frame.setLocation(710, 290);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

   /* class ControladorBoton implements ActionListener{
        private int contador =0;
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.printf("Contador: %d\n", contador++);
        }
    }
    */
}
