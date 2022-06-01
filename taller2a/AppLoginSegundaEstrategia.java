package taller2a;

import javax.swing.*;

public class AppLoginSegundaEstrategia extends JFrame{//Heredamos Applogin de JFrame -> Applogin es una ventana
    private JTextField textFieldUsuario;
    private JPasswordField passwordFieldContraseña;
    private JButton ingresarButton;
    private JPanel panel1;

    public AppLoginSegundaEstrategia(){
        super();//El constructor de la superclase (super --> JFrame)
        //this -> AppLogin
        this.add(panel1);
    }

    public static void main(String[] args) {
        AppLoginSegundaEstrategia app = new AppLoginSegundaEstrategia();//Al instanciar llamamos al constructor -> public Appplogin
        app.setTitle("App login");
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(300,300);
        app.setVisible(true);
    }
}
