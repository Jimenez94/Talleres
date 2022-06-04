package taller3b.EjercicioFinal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SistemaPaquetes {
    Connection conn;

    public SistemaPaquetes(Connection conn) throws SQLException {
        this.conn = conn;
        this.instalarTablas();
    }

    private void instalarTablas() throws SQLException {
        instalarTablasPaquete();
        //todo Intalar las demas tablas
    }

    private void instalarTablasPaquete() throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement(
                "CREATE TABLE IF NOT EXISTS Paquete(\n" +
                        "\tpaqueteID int NOT NULL AUTO_INCREMENT,\n" +
                        "\tSKU varchar(255) NOT NULL,\n" +
                        "\tGuia varchar(255),\n" +
                        "\tActivo bool,\n" +
                        "\tCreateAt timestamp NOT NULL DEFAULT now(),\n" +
                        "\tUpdate timestamp,\n" +
                        "\tPRIMARY KEY (paqueteID)\n" +
                        ")"
        );
        int resultado = preparedStatement.executeUpdate();
        if (resultado ==0){
            System.out.println("Se instalo la tabla Paquete");
        }else{
            throw new SQLException("No se pudo crear el Paquete");
        }

    }
}
