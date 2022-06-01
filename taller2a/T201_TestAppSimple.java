package taller2a;


import javax.swing.*;
import java.awt.*;

public class T201_TestAppSimple {
    public static void main(String[] args) {

        //1.- Instanciar los componentes que vamos a ocupar
        JFrame frame1 = new JFrame();
        JFrame frame2 = new JFrame();
        JFrame frame3 = new JFrame();


        //2.- Configurar -> Inicializar los valores y conexiones entre componentes
        frame1.setSize(500,500);
        frame2.setSize(800,400);
        frame3.setSize(200,200);

        frame1.setLocation(710,290);
        frame2.setLocationRelativeTo(frame1);
        frame3.setLocationRelativeTo(frame1);


        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//SE FINALIZA LA APLICACION
        frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//Libera memoria despues de cerrar
        frame3.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//Cerrar--> quita la visibilidad de la ventana

        frame1.setTitle("Ventana1");
        frame2.setTitle("Ventana2");
        frame3.setTitle("Ventana3 - Hola mundo");


        frame1.setVisible(true);
        frame2.setVisible(true);
        //frame3.setVisible(true);


        //3- Enlazar los componentes
        //1) Intanciar componente
        JPanel panel1 = new JPanel();
        JPanel panel2= new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        //2) Configurar el componente
        panel1.setBackground(new Color(162, 168, 50));
        panel2.setBackground(new Color(50, 168, 152));
        panel3.setBackground(new Color(50, 113, 168));
        panel4.setBackground(new Color(50, 78, 168));
        panel5.setBackground(new Color(168, 50, 158));

        /**
         *
         *
         * */



        //3) Enlazar/Combinar/componer componentes
        frame2.add(panel1,BorderLayout.NORTH);
        frame2.add(panel2,BorderLayout.SOUTH);
        frame2.add(panel3,BorderLayout.WEST);
        frame2.add(panel4,BorderLayout.EAST);
        frame2.add(panel5,BorderLayout.CENTER);


        //1- Intanciar un boton
        JButton botton1 = new JButton("Pulsame");
        JButton botton2 = new JButton("Pulsame soy el boton 2");
        //2- Configurar el componente boton
        //botton1.setText("Hola mundo");
        //3- Añadir el boton al panel 5
        panel5.setLayout(new BorderLayout());
        panel5.add(botton1,BorderLayout.WEST);
        panel1.add(botton2);
    }
}
