package Examen;

import java.util.Scanner;

class Test1 {
    public static void main(String[] args) {
        // TODO: Crea una nueva instancia de la clase Scanner llamada `scanner`
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dame tu edad: ");
        int edad = 0;// TODO: Lee un entero desde la instancia `scanner`
        try {
            edad = scanner.nextInt();
            System.out.printf("Tu edad es: %d\n", edad);
        } catch (Exception e) {
            System.out.println("Error, no ingresas un numero:  " + e);
        }
        // TODO: Termina de leer la línea en la instancia `scanner`
        scanner.delimiter();
        // TODO: Cierra la instancia `scanner`
        scanner.close();
    }
    /*¿Qué error hay en el código?

    R = a) Falta un punto y coma en la primer impresión a consola
    b) Falta marcar como public la clase Test
    c) No hay ningún error en el código
    */
}
