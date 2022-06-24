package taller4a.MVC.controler;

import taller4a.MVC.modelo.ILoginModel;
import taller4a.MVC.vista.App02;
import taller4a.MVC.vista.ILoginView;
import taller4a.MVC2.view.productoUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;


public class LoginControler {
    ILoginView loginView;//Tiene toda la logica de la Interfas de usuario
    ILoginModel LoginModel;//Tiene toda la logica de la interfas con los datos

    public LoginControler(ILoginView loginView,ILoginModel loginModel ){
        this.loginView = loginView;
        this.LoginModel = loginModel;

        loginView.getSingInButton().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = loginView.getUser();
                String password = loginView.getPasword();

                if(LoginModel.isValidUserAndPassword(usuario,password)){//el modelo determinara si es valido via base de datos
                    loginView.showSuccessLogin();
                }else{
                    loginView.showErrorLogin("El usuario o la contraseña no son validos");
                }
            }
        });

        loginView.agregarProducto().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    productoUI productoUI = new productoUI();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                } catch (InvocationTargetException ex) {
                    ex.printStackTrace();
                } catch (NoSuchMethodException ex) {
                    ex.printStackTrace();
                } catch (InstantiationException ex) {
                    ex.printStackTrace();
                } catch (IllegalAccessException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
}
