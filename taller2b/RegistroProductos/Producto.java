package taller2b.RegistroProductos;

public class Producto {

    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private int existencia;
    private boolean activo;

    public Producto(int id, String nombre, String descripcion, double precio, int existencia, boolean activo) {

        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.existencia = existencia;
        this.activo = activo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public boolean getActivo() {
        return activo;
    }
}
