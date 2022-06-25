package taller4b.MVCejercicio.model.implementation;

import taller4b.MVCejercicio.entidades.Todos;
import taller4b.MVCejercicio.model.IExtracionTodos;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class TodoServicioFake implements IExtracionTodos {

    @Override
    public List<Todos> getTodos() {
        List<Todos> todos = new ArrayList<>();
        todos.add(new Todos(
                        1,
                        "prueba 1",
                        true,
                        Timestamp.valueOf("24-06-2022 4.53"),
                        Timestamp.valueOf("24-06-2022 4.53")
                )
        );

        List<Todos> todos2 = new ArrayList<>();
        todos.add(new Todos(
                        1,
                        "prueba 1",
                        true,
                        Timestamp.valueOf("24-06-2022 4.53"),
                        Timestamp.valueOf("24-06-20 2 4.53")
                )
        );


        return todos;
    }
}
