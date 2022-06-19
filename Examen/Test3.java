package Examen;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException,
            NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        String driver = "com.mysql.cj.jdbc.Driver"; // TODO: Coloca la cadena del Driver de MySQL

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
        // NOTA: Usa la conexión `conn` para crearla y el query `sql`
        //System.out.println("Ingresa una fecha");
        //Scanner scanner = new Scanner(System.in);
        //String fechaDeCreacion = scanner.nextLine();
        //scanner.close();
       // PreparedStatement stament = conn.prepareStatement(sql);
        //stament.setString(1, fechaDeCreacion);
        /*int resultado = stament.executeUpdate(); //ejecutamos la inserccion en la base de datos
        System.out.println("El resultado es: " + resultado);
        //ps = conn.prepareStatement(sql);
        if (resultado > 1) {
            System.out.println("Insercion exitosa");
        } else {
            System.out.println("La inserccion no es exitosa");
        }*/

        PreparedStatement stament = conn.prepareStatement(sql);
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
