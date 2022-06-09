package taller3b.EjercicioFinal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class SistemaPaquetes {
    private Connection conn;//Coneccion global
    private Scanner scanner;

    public SistemaPaquetes(Connection conn,Scanner scanner) throws SQLException {//constructor
        this.conn = conn;
        this.scanner = scanner;
        this.instalarTablas();
    }

    private void instalarTablas() throws SQLException {
        instalarTablasPaquete();
        //todo Intalar las demas tablas
    }

    private void instalarTablasPaquete() throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement(
                "CREATE TABLE IF NOT EXISTS Paquete (\n" +
                        "  PaqueteID int NOT NULL AUTO_INCREMENT,\n" +
                        "  Sku varchar(255) NOT NULL UNIQUE,\n" +
                        "  Guia varchar(255),\n" +
                        "  Activo bool,\n" +
                        "  CreateAt timestamp NOT NULL DEFAULT now(),\n" +
                        "  UpdateAt timestamp,\n" +
                        "  PRIMARY KEY (PaqueteID)\n" +
                        ")"
        );
        int resultado = preparedStatement.executeUpdate();
        if (resultado == 0) {
            System.out.println("Se instalo la tabla Paquete");
        } else {
            throw new SQLException("No se pudo crear el Paquete");
        }
    }

    public void abrirMenu() {
        System.out.println("Menu de paquetes");
        System.out.println("--------------------------------------");
        System.out.println("1.- Registrar Paquetes");
        System.out.println("2.- Agregar guia");
        System.out.println("3.- Ver Paquetes");
        System.out.println("4.- Buscar paquete");
        System.out.println("5.- Activar/Desactivar Paquete");
        System.out.println("6.- Ver Historial del Paquete");
        System.out.println("--------------------------------------");
        System.out.println("7.- Salir");
        System.out.println();

        seleccionarOpcion();
    }

    private void seleccionarOpcion(){
        System.out.println("Opcion: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        SQLException(opcion);
    }

    public void seleccionarOpcion(int opcion){
        switch (opcion){
            case 1:
                registrarPaquete();
                break;
            case 2:
                asignarGuia();
                break;
            case 3:
                verPaquetes();
                break;
            case 4:
                buscarPa1quetes();
                break;
            case 5:
                activarDesactivarPaquete();
                break;
            case 6:
                verHistorialPaquete();
                break;
            case 7:
                salir();
                break;
            default:
                seleccionNoValida();
                break;
        }
    }


}
