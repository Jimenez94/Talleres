package Examen;

import java.io.*;

public class Test5 {
    public static void main(String[] args) throws IOException {

        InputStream inputStream = new FileInputStream("C:\\Users\\IsaelPC\\Desktop\\Universidad\\IPN\\M2\\Taller2\\Taller2\\Examen\\entrada.txt");
        OutputStream outputStream = new FileOutputStream("C:\\Users\\IsaelPC\\Desktop\\Universidad\\IPN\\M2\\Taller2\\Taller2\\Examen\\salida.txt");

        byte[] bytes = inputStream.readAllBytes();

        // TODO: Guarda los bytes leídos del `inputStream` y alamacenados
        //       en el arreglo `bytes` en el `outputStream`, pero, invierte los bytes

        for (int i = bytes.length -1; i >= 0; i--){
            outputStream.write(bytes[i]);
        }
        System.out.println( outputStream.toString());

        // IMPORTANTE: Los bytes guardados en el `outputStream`
        //             tienen que quedar invertidos

        // PISTA: Lee al revés los bytes y usa outputStream.write(byte);

        inputStream.close();
        outputStream.close();

    }
}
