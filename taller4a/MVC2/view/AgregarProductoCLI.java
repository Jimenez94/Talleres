package taller4a.MVC2.view;

import taller4a.MVC2.controler.AgregarProductosController;
import taller4a.MVC2.model.ProductosDB;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Scanner;

public class AgregarProductoCLI implements IAgregarProductoUI {

    AgregarProductosController controller = new AgregarProductosController();;
    ProductosDB model = new ProductosDB();

    Scanner scanner = new Scanner(System.in);

    public AgregarProductoCLI() throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        controller.setView(this);
        controller.setModel(model);
    }

    public void abrirMenu() {
        System.out.println("Selecciona una opción:");
        System.out.println("1. Agregar producto");
        System.out.println("2. Salir");

        int opcion = scanner.nextInt(); scanner.nextLine();

        switch (opcion) {
            case 1:
                controller.transaccionAgregarProducto();
                break;
            case 2:
                scanner.close();
                System.out.println("Gracias");
                break;
            default:
                System.out.println("Opción no válida");
                reiniciarFormulario();
                break;
        }
    }

    @Override
    public String getNombre() {
        System.out.println("Ingres el nombre");
        String nombre = scanner.nextLine();
        return nombre;
    }

    @Override
    public String getDescipcion() {
        System.out.println("Descripcion");
        String  descripcion = scanner.nextLine();
        return descripcion;
    }

    @Override
    public double getPrecio() {
        System.out.println("Ingresa un precio");
        double precio = scanner.nextDouble();
        return precio;
    }

    @Override
    public int getExistencias() {
        System.out.println("Ingresa las existencias");
        int existencias = scanner.nextInt();
        return existencias;
    }

    @Override
    public void mostrarAgregarProducto() {
        System.out.println("Se agrego el producto correctamente");
        System.out.println("[Pulsa Enter para continuar ...]");
        scanner.nextLine();
    }

    @Override
    public void mostrarAgregarProductoError(String mensaje) {
        System.out.printf("Error al agregar el producto: %s\n", mensaje);
        System.out.println("[Pulsa Enter para continuar ...]");
        scanner.nextLine();
    }

    @Override
    public void reiniciarFormulario() {
        abrirMenu();
    }
}
