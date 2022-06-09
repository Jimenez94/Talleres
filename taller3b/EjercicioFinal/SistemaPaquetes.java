package taller3b.EjercicioFinal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class SistemaPaquetes {
    private Connection conn;//Coneccion global
    private Scanner scanner;

    public SistemaPaquetes(Connection conn, Scanner scanner) {//constructor
        this.conn = conn;
        this.scanner = scanner;
        this.instalarTablas();
    }

    private void instalarTablas() {
        instalarTablasPaquete();
        //todo Intalar las demas tablas
    }

    private void instalarTablasPaquete()  {
        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement(
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
        } catch (SQLException e) {
            System.out.println("Hay un error en la sintaxis para crear la tabla paquete");
            return;
        }
       boolean resultado = false;
        try {
            resultado = statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("fallo la creacion de la tabla paquete"+e.getMessage());
            return;
        }
        if (resultado) {
            System.out.println("Se instalo la tabla Paquete");
        } else {
            System.out.println("No se puedo crear la tabla Paquete");
        }
    }

    public void abrirMenu() throws SQLException {
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

    private void seleccionarOpcion() throws SQLException {
        System.out.println("Opcion: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        seleccionarOpcion(opcion);
    }

    public void seleccionarOpcion(int opcion) throws SQLException {
        switch (opcion) {
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
                buscarPa1quete();
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

    private void hacerPausa() throws SQLException {
        System.out.println("Pulsar ENTER para constinuar...");
        scanner.nextLine();

    }

    private void regresarALMenu() throws SQLException {
        hacerPausa();
        abrirMenu();
    }

    public String solicitarSKU(){
        System.out.println("Ingrese el SKU");
        String sku = scanner.nextLine();
        return sku;
    }

    public void insertarPaquete(String sku) {
        PreparedStatement statement;
        try {
            statement = conn.prepareStatement("INSERT INTO Paquete (sku) VALUES (?)");
        } catch (SQLException e) {
            System.out.println("Hay un error en la sintaxis al incertar el paquete: "+e.getMessage());
            return;
        }
        try {
            statement.setString(1,sku);//Remplazo de parametros
        } catch (SQLException e) {
            System.out.println("No se puede insertar el parametro sku en la consulta");
            return;
        }
        try {
            statement.execute(); //excute -> INSERT/CREATE | executeUpdate -> UPDATE/DELETE | executeQuery -> SELECT
        } catch (SQLException e) {
            System.out.println("El paquete ya existe");
            //System.out.println("Error al ejecutar la consulta: "+e.getMessage());
            return;
        }
        System.out.printf("El paquete con SKU: %s fue insertado.\n ",sku);
    }

    public void  registrarPaquete() throws SQLException {
        String sku = solicitarSKU();
        insertarPaquete(sku);
        regresarALMenu();
    }

    public void asignarGuia() throws SQLException {
      //  String sku = new solicitarSKU();
      //  String aguia = solicitarGuia();
      //  Paquete paquete = buscarPaquete(sku);
        regresarALMenu();

    }

    public void verPaquetes() throws SQLException {
        //Todo: implementar
        regresarALMenu();
    }

    public void activarDesactivarPaquete() throws SQLException {
        //todo: imlementar
        regresarALMenu();
    }

    public void buscarPa1quete() throws SQLException {
        //todo: imlementar
        regresarALMenu();
    }

    public void salir() {
        //todo: imlementar
        System.out.println("Gracias, fin del programa");

    }

    public void verHistorialPaquete() throws SQLException {
        //todo: imlementar
        regresarALMenu();
    }

    public void seleccionNoValida() throws SQLException {
        //TODO: implementar
        System.out.println("La opcion no es valida");
        regresarALMenu();
    }


}
