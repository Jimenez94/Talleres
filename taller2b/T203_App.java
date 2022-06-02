package taller2b;

import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class T203_App extends JFrame {
    private JTextArea textAreaNotas;
    private JButton guardarButton;
    private JPanel panel1;
    private JButton abrirButton;

    public T203_App() {
        super();
        this.add(panel1);
        super.setTitle("Bolg de notas");
        super.setSize(400, 400);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);


        abrirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                chooser.setCurrentDirectory(new File("C:\\Users\\IsaelPC\\Desktop"));
                int result = chooser.showDialog(guardarButton, "Abrir");
                if (result == JFileChooser.APPROVE_OPTION) {//se aprobo
                    File file = chooser.getSelectedFile();
                    Scanner scanner;
                    try {
                        scanner = new Scanner(file);
                        //System.out.println("reader: "+scanner);
                    } catch (Exception ex) {
                        //ex.printStackTrace();
                        JOptionPane.showMessageDialog(panel1, "No se pudo abrir el archivo", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    textAreaNotas.setText("");
                    while (scanner.hasNextLine()){
                        String line = scanner.nextLine();
                        textAreaNotas.setText(textAreaNotas.getText()+line+"\n");
                    }

                } else {//no se aprobo
                    JOptionPane.showMessageDialog(panel1, "No se seligio ningun archivo");
                }
            }
        });

        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Se optiene todo el contenido de las areas de texto
                String contenido = textAreaNotas.getText();
                JFileChooser chooser = new JFileChooser();
                chooser.setCurrentDirectory(new File("C:\\Users\\IsaelPC\\Desktop"));
                int result = chooser.showDialog(guardarButton, "Guardar");
                System.out.println("result " + result);
                System.out.println("JFileChooser " + JFileChooser.APPROVE_OPTION);

                if (result == JFileChooser.APPROVE_OPTION) {//se aprobo
                    if (!textAreaNotas.getText().isEmpty()) {
                        //otorga la direccion
                        File file = chooser.getSelectedFile();
                        System.out.println("file -> " + file);
                        FileWriter escribe;
                        try {
                            //obtiene la direccion del archivo
                            escribe = new FileWriter(file);
                            System.out.println("witer-> " + escribe);
                        } catch (IOException ex) {
                            ex.printStackTrace();
                            JOptionPane.showMessageDialog(panel1, "No se pudo abrir el archivo", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        try {
                            //se crea el archivo
                            escribe.write(contenido);
                            System.out.println("witer-> " + escribe);
                        } catch (IOException ex) {
                            ex.printStackTrace();
                            JOptionPane.showMessageDialog(panel1, "No se pudo abrir el archivo", "Error", JOptionPane.ERROR_MESSAGE);
                            System.out.println(ex);
                            return;
                        }
                        try {
                            //Aguardar el archivo
                            escribe.close();
                            System.out.println("witer-> " + escribe);
                        } catch (IOException ex) {
                            ex.printStackTrace();
                            JOptionPane.showMessageDialog(panel1, "No se pudo aguardar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        JOptionPane.showMessageDialog(panel1, "El archivo se aguardo correctamente, \nEsta en la direccion siguiente " + file);
                    } else {
                        JOptionPane.showMessageDialog(panel1, "El area de texto esta vacia");
                    }

                } else {//no se aprobo
                    JOptionPane.showMessageDialog(panel1, "No se seligio ningun archivo");
                }

            }
        });


    }

    public static void main(String[] args) {
        new T203_App();
    }
}
