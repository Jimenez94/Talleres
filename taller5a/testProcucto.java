package taller5a;

import java.util.Scanner;

public class testProcucto {
    public static void main(String[] args) {
        //producto producto = new producto(123,"cocacola", 18.5,true);

        Scanner scanner = new Scanner(System.in);
        producto producto = new producto(scanner);
        System.out.println(producto);

        scanner.close();
    }
}
