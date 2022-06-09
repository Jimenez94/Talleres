package taller3b;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.NoSuchElementException;

public class TestDBConenection {
    /*public static void main(String[] args) throws ClassNotFoundException {

        Connection conn;

        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "inventario_ijs";
        String driver = "com.mysql.cj.jdbc.Driver";
        String user = "root";
        String password = "1234";

        try {
            Class.forName(driver).getConstructor().newInstance();
            System.out.println("Diver cargado exitosamente");

            conn = DriverManager.getConnection(url + dbName, user, password);
            System.out.println("Conectado a la BD exitosamente");

            //TODO: usar la base de datos

            conn.close();
            System.out.println("La base de datos ha cerrado exitosamente");

        } catch (ClassNotFoundException e) {
            System.out.println("La clase del drive no existe: " + e.getMessage());
        } catch (InvocationTargetException e) {
            System.out.println("La invocacion fallo " + e.getMessage());
        } catch (InstantiationException e) {
            System.out.println("La instancia fallo: " + e.getMessage());
        } catch (IllegalAccessException e) {
            System.out.println("Acceso ilegal: " + e.getMessage());
        } catch (NoSuchMethodException e) {
            System.out.println("El metodo no existe: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Fallo SQL: " + e.getMessage());
        }
    }*/

    public static void main(String[] args)
            throws ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException,InstantiationException,
            IllegalAccessException,SQLException
    {
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


        conn.close();
        System.out.println("La base de datos ha cerrado exitosamente");
    }
}
