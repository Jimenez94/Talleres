package taller2;

import javax.swing.*;

public class T205_TestAppEjemploIsael {
    private JTextArea textAreaRespuesta;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton buttonSuma;
    private JButton buttonResta;
    private JButton buttonMultiplicacion;
    private JButton a0Button;
    private JButton button1;
    private JPanel panel1;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        T205_TestAppEjemploIsael app = new T205_TestAppEjemploIsael();

        frame.add(app.panel1);

        frame.setSize(300,300);
        frame.setLocation(710,290);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
