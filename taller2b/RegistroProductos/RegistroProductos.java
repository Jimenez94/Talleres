package taller2b.RegistroProductos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RegistroProductos extends JFrame {
    private JTextField textFieldNombre;
    private JTextField textFieldPrecio;
    private JTextArea textAreaDescripcion;
    private JSlider sliderExistencias;
    private JCheckBox checkBoxActivo;
    private JButton crearButton;
    private JPanel panel1;

    public RegistroProductos() {
        super();
        super.add(panel1);
        super.setSize(500, 350);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);



        crearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Producto>productos = new ArrayList<>();

                String nombre = textFieldNombre.getText();
                String descripcion = textAreaDescripcion.getText();
                double precio = 0;
                if (!textFieldNombre.getText().isEmpty()) {
                    try {
                        precio = Double.parseDouble(textFieldPrecio.getText());
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(panel1, "Error, no es un numero lo que ingresaste");
                        return;
                    }
                } else {
                    JOptionPane.showMessageDialog(panel1, "No ingresaste el nombre");
                }
                int existencia = sliderExistencias.getValue();
                boolean estaActivo = checkBoxActivo.isSelected();

                Producto produsto = new Producto(1, nombre, descripcion, precio, existencia, estaActivo);
                productos.add(produsto);

                System.out.println("Este es el producto "+productos);

                System.out.println(nombre);
                System.out.println(descripcion);
                System.out.println(precio);
                System.out.println(existencia);
                System.out.println(estaActivo);
                System.out.println(produsto);


            }
        });
    }


    public static void main(String[] args) {
        new RegistroProductos();
    }

}
