package taller2b;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class T202_App extends JFrame {
    private JTextArea textAreaIngresaValor;
    private JTextArea textAreaMuestrResultado;
    private JButton calcularButton;
    private JPanel panel1;

    public  T202_App(){
        super();
        this.add(panel1);
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = textAreaIngresaValor.getText();
                double valor;

                try {
                    valor = Double.parseDouble(texto);
                }catch (Exception error){
                    textAreaMuestrResultado.setText("El valor que ingresaste no es un numero");
                    return;
                }
                double alcuadrado = valor*valor;
                String respuesta = String.valueOf(alcuadrado);
                textAreaMuestrResultado.setText("Al elevar al cuadrado se optiene: "+respuesta);
            }
        });
    }

    public static void main(String[] args) {
        T202_App app = new T202_App();
        app.setSize(300,300);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }

}
