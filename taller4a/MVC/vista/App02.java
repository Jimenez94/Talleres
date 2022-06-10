package taller4a.MVC.vista;

import taller4a.MVC.controler.LoginControler;
import taller4a.MVC.modelo.UsuariosDB;

import javax.swing.*;

public class App02 extends JFrame implements ILoginView{
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton aceptarButton;
    private JPanel panel1;


    public App02(){
        super();
        construirVentana(400,200);
    }

    public void construirVentana(int width, int height){
        super.add(panel1);
        super.setSize(width,height);
        //int x = (int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth()-width/2);
        //int y = (int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth()-height/2);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLocation(720,290);
        super.setVisible(true);
        super.setResizable(false);
        super.setTitle("Iniciar Secion");
    }



    public static void main(String[] args) {
        App02 view = new App02();
        UsuariosDB modelo = new UsuariosDB();
        LoginControler controler = new LoginControler(view, modelo);
    }

    @Override
    public JButton getSingInButton() {
        return this.aceptarButton;
    }

    @Override
    public String getUser() {
        return this.textField1.getText();
    }

    @Override
    public String getPasword() {
        //return this.passwordField1.getPassword().toString();
        return this.passwordField1.getText();
    }

    @Override
    public void showSuccessLogin() {
        JOptionPane.showMessageDialog(this.panel1, "Inicio de secion exitoso :D", "Inicio de sesion correcto",JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void showErrorLogin(String mensage) {
        JOptionPane.showMessageDialog(this.panel1, mensage, "Error al iniciar sesion :c", JOptionPane.ERROR_MESSAGE);
    }
}
