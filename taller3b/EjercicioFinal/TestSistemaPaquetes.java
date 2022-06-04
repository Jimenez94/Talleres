package taller3b.EjercicioFinal;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestSistemaPaquetes {
    public static void main(String[] args)
            throws ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, InstantiationException,
            IllegalAccessException, SQLException
    {
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver).getConstructor().newInstance();
        System.out.println("Diver cargado exitosamente");

        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "inventario_ijs";
        //String driver = "com.mysql.cj.jdbc.Driver";
        String user = "root";
        String password = "1234";

        Connection conn = DriverManager.getConnection(url + dbName, user, password);
        System.out.println("Conectado a la BD exitosamente");

        SistemaPaquetes sistemaPaquetes = new SistemaPaquetes(conn);
    }
}
