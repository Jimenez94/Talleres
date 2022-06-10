package taller4a.MVC.controler;

import taller4a.MVC.modelo.ILoginModel;
import taller4a.MVC.vista.ILoginView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginControler {
    ILoginView loginView;//Tiene toda la logica de la IS
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

    }

}
