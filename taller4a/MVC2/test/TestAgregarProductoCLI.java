package taller4a.MVC2.test;

import taller4a.MVC2.view.AgregarProductoCLI;
import taller4a.MVC2.view.productoUI;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

public class TestAgregarProductoCLI {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        AgregarProductoCLI cli = new AgregarProductoCLI();
        cli.abrirMenu();
    }

}
