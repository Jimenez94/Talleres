package taller4b.MVCejercicio.view.implementation;

import taller4b.MVCejercicio.entidades.Todos;
import taller4b.MVCejercicio.view.IVisualizacionTodos;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class TodoUI implements IVisualizacionTodos {
    private JTextField textField1;
    private JButton aceptarButton;
    private JPanel panelTodos;
    private JPanel panel1;
    private JFrame frame;
    public TodoUI(){
        frame = new JFrame();
        frame.add(panel1);
        frame.setTitle("Todos App");
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void mostrarTodos(List<Todos> todos) {
        panelTodos.removeAll();
        for (Todos todo : todos) {
            JPanel panelTodo = new JPanel();
            JCheckBox checkBoxCompletado = new JCheckBox();
            checkBoxCompletado.setSelected(todo.isCompletado());
            JLabel labelTitulo = new JLabel(todo.getTitulo());
            JLabel labelCreado = new JLabel(todo.getCreado().toString());
            JLabel labelModificado;
            if (todo.getModificado()!= null){
                labelModificado = new JLabel(todo.getModificado().toString());
            }else {
                labelModificado = new JLabel("Sin modificacion");
            }

            panelTodo.add(checkBoxCompletado, BorderLayout.LINE_START);
            panelTodo.add(labelTitulo, BorderLayout.CENTER);
            panelTodo.add(labelCreado, BorderLayout.PAGE_END);
            panelTodo.add(labelModificado, BorderLayout.PAGE_START);
            this.panelTodos.add(panelTodo);
        }
        panelTodos.updateUI();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
