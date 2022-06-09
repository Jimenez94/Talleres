package taller3b;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;

public class TestCreacionTabla {
    public static void main(String[] args)
            throws ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, InstantiationException,
            IllegalAccessException, SQLException {
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver).getConstructor().newInstance();
        System.out.println("Diver cargado exitosamente");

        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "inventario_ijs";
        //String driver = "com.mysql.cj.jdbc.Driver";
        String user = "root";
        String password = "1234";

        //Class.forName(driver).getConstructor().newInstance();
        //System.out.println("Diver cargado exitosamente");

        Connection conn = DriverManager.getConnection(url + dbName, user, password);
        System.out.println("Conectado a la BD exitosamente");

        //TODO: usar la base de datos
        PreparedStatement statement = conn.prepareStatement(
                "CREATE TABLE if not exists prueba (" +
                        "id int not null auto_increment," +
                        "nombre varchar(255) not null," +
                        "create_at timestamp not null default now()," +
                        "primary key (id)" +
                        ")"
        );

        /*ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()){
          System.out.println(resultSet.toString());
        }*/

        int codigo = statement.executeUpdate();

        System.out.println(codigo);

        conn.close();
        System.out.println("La base de datos ha cerrado exitosamente");
    }
}
