package taller2a;

import javax.swing.*;

public class T204_AppToolTipPrimeraEstrategia {
    private JPanel panel1;
    private JTree tree1;
    private JTabbedPane tabbedPane1;
    private JCheckBox checkBox1;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JTextField textField1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;

    public static void main(String[] args) {
        T204_AppToolTipPrimeraEstrategia app = new T204_AppToolTipPrimeraEstrategia();
        JFrame  frame = new JFrame();
        frame.add(app.panel1);

        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
