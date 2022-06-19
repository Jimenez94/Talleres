package taller5a;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class TestInputStreamExamen {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("C:\\Users\\IsaelPC\\Desktop\\Universidad\\IPN\\M2\\Taller2\\Taller2\\taller5a\\notas.txt");
        byte[] bytes1 = inputStream.readAllBytes();
        System.out.println(Arrays.toString(bytes1));

        byte[] bytes2 = new byte[bytes1.length];//se define el tamaño de el arreglo bytes2

        System.out.println("Tamaño de bytes1: " + bytes1.length);
        System.out.println("Tamaño de bytes2: " + bytes2.length);

        int j = bytes1.length;
        System.out.println(j);
        System.out.println("");

        for (int i = bytes1.length-1; i >= 0; i--) {
            System.out.println(bytes1[i]);
        }
        int k = bytes1.length-1;
        for (int l = 0; l>= bytes1.length-1;l++){
            bytes2[l] = bytes1[k];
        }

        System.out.println(Arrays.toString(bytes2));

        inputStream.close();
    }
}
