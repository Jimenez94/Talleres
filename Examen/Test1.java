package Examen;

import java.util.Scanner;

class Test1 {
    public static void main(String[] args) {
        // TODO: Crea una nueva instancia de la clase Scanner llamada `scanner`
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dame tu edad: ");

        int edad = scanner.nextInt();// TODO: Lee un entero desde la instancia `scanner`
        scanner.delimiter();// TODO: Termina de leer la línea en la instancia `scanner`

        System.out.printf("Tu edad es: %d\n", edad);

        // TODO: Cierra la instancia `scanner`
        scanner.close();
    }
    /*¿Qué error hay en el código?

    R = a) Falta un punto y coma en la primer impresión a consola
    b) Falta marcar como public la clase Test
    c) No hay ningún error en el código
    */
}
