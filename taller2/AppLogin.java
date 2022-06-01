package taller2;

import javax.swing.*;

public class AppLogin extends JFrame{//Heredamos Applogin de JFrame -> Applogin es una ventana
    private JTextField textFieldUsuario;
    private JPasswordField passwordFieldContraseña;
    private JButton ingresarButton;
    private JPanel panel1;

    public AppLogin(){
        super();//El constructor de la superclase (super --> JFrame)
        //this -> AppLogin
        this.add(panel1);
    }

    public static void main(String[] args) {
        AppLogin app = new AppLogin();//Al instanciar llamamos al constructor -> public Appplogin
        app.setTitle("App login");
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(300,300);
        app.setVisible(true);
    }
}
