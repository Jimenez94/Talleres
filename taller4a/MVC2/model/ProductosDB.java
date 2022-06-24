package taller4a.MVC2.model;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;

public class ProductosDB implements IAgregarProdutoModel{
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/";
    private String dbname = "ipn";
    private String user = "root";
    private String password = "1234";

    private Connection connection = null;

    public ProductosDB() throws ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, InstantiationException,
            IllegalAccessException, SQLException {
        Class.forName(driver).getConstructor().newInstance();

        connection = DriverManager.getConnection(url + dbname, user, password);

    }

    @Override
    public boolean agregarProducto(String nombre, String descripcion, double precio, int existencias) {
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT into productos (nombre, descripcion, precio, existencias) values (?,?,?,?)");
            statement.setString(1, nombre);
            statement.setString(2, descripcion);
            statement.setDouble(3, precio);
            statement.setInt(4, existencias);

            if(statement.execute()){//execute regresa -> true si falla
                System.out.println("Surgio un error en la ejecucion");
                 statement.close();
                return false;
            }else{
                System.out.println("Todo salio bien en la ejecucion");
                statement.close();
                return true;
            }


        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
