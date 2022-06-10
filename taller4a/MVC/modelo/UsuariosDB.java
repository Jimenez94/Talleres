package taller4a.MVC.modelo;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;

public class UsuariosDB implements ILoginModel{

    private String driver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/";
    private String dbname = "inventario_ijs";
    private String user = "root";
    private String password = "1234";

    private Connection connection = null;

    public UsuariosDB() {
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
    }

    @Override
    public boolean isValidUserAndPassword(String user, String password) {

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement("SELECT * FROM usuarios when usuarios = ? and contraseña = ?");
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        try {
            statement.setString(1,user);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        try {
            statement.setString(2, password);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

        ResultSet resultSet = null;
        try {
            resultSet = statement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        try {
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }


    }
}
