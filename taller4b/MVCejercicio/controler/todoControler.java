package taller4b.MVCejercicio.controler;

import taller4b.MVCejercicio.entidades.Todos;
import taller4b.MVCejercicio.model.IExtracionTodos;
import taller4b.MVCejercicio.view.IVisualizacionTodos;

import java.util.List;

public class todoControler {

    private IExtracionTodos extractor;
    private IVisualizacionTodos visualizador;


    //Para que en cualquier momento se puedan ajustar
    public void setExtractor(IExtracionTodos extractor) {
        this.extractor = extractor;
    }

    public void setVisualizador(IVisualizacionTodos visualizador) {
        this.visualizador = visualizador;
    }

    public void transaccionRefescarTodos() {
        List<Todos> todos = extractor.getTodos();
        visualizador.mostrarTodos(todos);

    }



}
