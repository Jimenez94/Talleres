package taller4b.MVCejercicio.model.implementation;

import taller4b.MVCejercicio.entidades.Todos;
import taller4b.MVCejercicio.model.IExtracionTodos;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TodoServicio implements IExtracionTodos {

    private String driver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/";
    private String dbname = "ipn";
    private String user = "root";
    private String password = "1234";

    private Connection connection = null;

    public TodoServicio() {
        try {
            Class.forName(driver).getConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection(url + dbname, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Ingrese a la base de datos");

    }

    @Override
    public List<Todos> getTodos() {
        PreparedStatement statement=null;
        try {
            statement = connection.prepareStatement("slect * from todos");
        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }

        ResultSet resultSet;

        try {
            resultSet = statement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }

        List<Todos> todos = new ArrayList<>();
        try {
            while (resultSet.next()) {
                Todos todo = new Todos(
                        resultSet.getInt("id"),
                        resultSet.getString("titulo"),
                        resultSet.getBoolean("completado"),
                        resultSet.getTimestamp("creado"),
                        resultSet.getTimestamp("modificado")
                );
                todos.add(todo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return todos;
        }
        return todos;
    }
}
