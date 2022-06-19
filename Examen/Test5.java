package Examen;

import java.io.*;

public class Test5 {
    public static void main(String[] args) throws IOException {

        InputStream inputStream = new FileInputStream("<ruta archivo>");
        OutputStream outputStream = new FileOutputStream("<ruta archivo>");

        byte[] bytes = inputStream.readAllBytes();

        // TODO: Guarda los bytes leídos del `inputStream` y alamacenados
        //       en el arreglo `bytes` en el `outputStream`, pero, invierte los bytes

        // IMPORTANTE: Los bytes guardados en el `outputStream`
        //             tienen que quedar invertidos

        // PISTA: Lee al revés los bytes y usa outputStream.write(byte);

        inputStream.close();
        outputStream.close();

    }
}
