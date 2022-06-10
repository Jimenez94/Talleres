package taller4a.MVC.vista;

import javax.swing.*;

public interface ILoginView {

    JButton getSingInButton();
    String getUser();
    String getPasword();

    void showSuccessLogin();
    void showErrorLogin(String mensage);

}
