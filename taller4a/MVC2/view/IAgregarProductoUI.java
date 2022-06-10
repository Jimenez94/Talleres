package taller4a.MVC2.view;

import javax.swing.*;

public interface IAgregarProductoUI {

    String getNombre();
    String getDescipcion();
    double getPrecio();
    int getExistencias();

    void mostrarAgregarProducto();
    void mostrarAgregarProductoError(String mensaje);

    void reiniciarFormulario();

}