package taller2;

import javax.swing.*;

public class T203_TestAppLogin {
    private JTextField textFieldUsuario;
    private JTextField textFieldContraseña;
    private JButton buttonAceptar;
    private JPanel panelPrincipal;
    private JPanel panel1;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        T203_TestAppLogin app = new T203_TestAppLogin();
        frame.add(app.panel1);

        frame.setSize(200,200);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}
