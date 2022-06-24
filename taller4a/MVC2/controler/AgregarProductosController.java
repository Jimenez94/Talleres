package taller4a.MVC2.controler;

import taller4a.MVC2.model.IAgregarProdutoModel;
import taller4a.MVC2.view.IAgregarProductoUI;


public class AgregarProductosController {
    private IAgregarProdutoModel model;
    private IAgregarProductoUI view;

    public void setModel(IAgregarProdutoModel model) {
        this.model = model;
    }

    public void setView(IAgregarProductoUI view) {
        this.view = view;
    }

    public void transaccionAgregarProducto() {
        //Todo Obtener los datos del producto desde la vista
        String nombre = view.getNombre();
        String descripcion = view.getDescipcion();
        double precio = view.getPrecio();
        int existencias = view.getExistencias();

        if (nombre.isEmpty() || nombre.isBlank()) {// si el nombre esta empleado o si esta en blanco
            view.mostrarAgregarProductoError("El nombre esta vacio");
            return;
        }
        if (precio <= 0) {
            view.mostrarAgregarProductoError("El precio no esta vacio");
            return;
        }

        if (existencias < 0) {
            view.mostrarAgregarProductoError("Las existencias no son validas");
            return;
        }
        //TODO Mandarle los datos del producto al modelo
        if (model.agregarProducto(nombre, descripcion, precio, existencias)) {
            view.reiniciarFormulario();
            view.mostrarAgregarProducto();
        } else {
            view.mostrarAgregarProductoError("No se pudo agregar el producto");
        }
    }

}
