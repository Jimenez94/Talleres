package taller4b.test;

import taller4b.MVCejercicio.controler.todoControler;
import taller4b.MVCejercicio.model.implementation.TodoServicio;
import taller4b.MVCejercicio.view.implementation.TodoUI;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

public class testTodoApp {

    public static void main(String[] args) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        TodoServicio todoServicio = new TodoServicio();//--> Implementa a IExtraccionTodos lo podemos ocupar como (extractor)
        TodoUI todoUI = new TodoUI(); //Implementa a IVisualizacionTodos, lo podemos ocupar como visualisador

        todoControler todoControler = new todoControler();//<- Extractor + visualiador
        todoControler.setExtractor(todoServicio);
        todoControler.setVisualizador(todoUI);

        todoControler.transaccionRefescarTodos();

    }

}
