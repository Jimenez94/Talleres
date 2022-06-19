package taller5a;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class TestInputStream {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("C:\\Users\\IsaelPC\\Desktop\\Universidad\\IPN\\M2\\Taller2\\Taller2\\taller5a\\notas.txt");

        byte[] bytes1 = inputStream.readAllBytes();

        System.out.println(Arrays.toString(bytes1));

        inputStream.close();
    }
}
