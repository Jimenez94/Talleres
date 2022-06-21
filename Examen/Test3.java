package Examen;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException,
            NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        // TODO: Coloca la cadena del Driver de MySQL
        String driver = "com.mysql.cj.jdbc.Driver";

        Class.forName(driver).getConstructor().newInstance();
        System.out.println("Driver cargado exitosamente");

        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "fecha";
        String user = "root";
        String password = "1234";

        Connection conn = DriverManager.getConnection(url + dbName, user, password);
        System.out.println("Conectado a la BD exitosamente");

        String sql = "SELECT NOW() as Fechas";
        // TODO: Crea una instancia de PreparedStatement llamada `stament`
        PreparedStatement stament = conn.prepareStatement(sql);
        // NOTA: Usa la conexión `conn` para crearla y el query `sql`
        ResultSet resultSet = stament.executeQuery();
        resultSet.next();

        String fecha = resultSet.getString(1);
        System.out.printf("La fecha es: %s\n", fecha);

        conn.close();
        System.out.println("La base de datos ha sido cerrada exitosamente");
    }
}

/*
* ¿Cómo corregiste obtener la fecha del resultSet.getString(...)?

a) No tuve que corregirlo, funcionó correctamente
R-> b) Sólo tuve que cambiar el 0 por 1
c) Sólo tuve que cambiar el 0 por "Fecha"
* */
