package taller5a;

import java.io.Serializable;
import java.util.Scanner;

public class producto implements Serializable {

    private int id;
    private String nombre;
    private double precio;
    private boolean activo;




    public producto(Scanner scanner) {
        System.out.println("Ingresa datos del producto");
        System.out.println("-----------------------------");
        System.out.println("Dame el ID del producto");
        this.id = scanner.nextInt(); scanner.nextLine();
        System.out.println("Dame el nombre del producto");
        this.nombre = scanner.nextLine();
        System.out.println("Dame el precio del producto");
        this.precio = scanner.nextDouble();scanner.nextLine();
        System.out.println("¿Activo? [1: SI 0: NO]");
        this.activo = scanner.nextInt() ==1; scanner.nextLine();

    }

    public producto(int id, String nombre, double precio, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.activo = activo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isActivo() {
        return activo;
    }

    @Override
    public String toString() {
        return "producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", activo=" + activo +
                '}';
    }
}
