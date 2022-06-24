package taller4a.MVC2.view;

import taller4a.MVC2.controler.AgregarProductosController;
import taller4a.MVC2.model.ProductosDB;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

import static java.lang.System.exit;

public class productoUI extends JFrame implements IAgregarProductoUI {
    private JTextField textField1;
    private JTextArea textArea1;
    private JTextField textField2;
    private JSpinner spinner1;
    private JButton agregarButton;
    private JPanel panel1;

    private AgregarProductosController controller;
    private ProductosDB model;

    public productoUI() throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        model = new ProductosDB();

        controller = new AgregarProductosController();
        controller.setModel(model);
        controller.setView(this);

        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.transaccionAgregarProducto();
            }
        });


        super.add(panel1);
        super.setTitle("Agregar producto");
        super.setSize(600, 300);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLocation(720, 290);
        super.setVisible(true);

    }


    @Override
    public String getNombre() {
        if (textField1.getText().isEmpty() || textArea1.getText().isBlank()) {
            JOptionPane.showMessageDialog(panel1, "Tienes que escribir un producto");
        }
        return textField1.getText();
    }

    @Override
    public String getDescipcion() {
        if (textArea1.getText().isEmpty() || textArea1.getText().isBlank()) {
            JOptionPane.showMessageDialog(panel1, "Tienes que escribir una descripcion");
        }
        return textArea1.getText();
    }


    @Override
    public double getPrecio() {
        try {
            return Double.parseDouble(textField2.getText());
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(panel1, "No se puede obtener el precio", "Error en el precio", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }

    @Override
    public int getExistencias() {
        return (int) spinner1.getValue();
    }

    @Override
    public void mostrarAgregarProducto() {
        JOptionPane.showMessageDialog(panel1, "Se agrego el producto correctamente", "Producto agregado", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void mostrarAgregarProductoError(String mensaje) {
        JOptionPane.showMessageDialog(panel1, "Error al agregar el producto", "Error", JOptionPane.ERROR_MESSAGE);
    }

    @Override
    public void reiniciarFormulario() {
        textField1.setText("");
        textArea1.setText("");
        textField2.setText("");
        spinner1.setValue(0);
        textArea1.requestFocus();
    }


}
