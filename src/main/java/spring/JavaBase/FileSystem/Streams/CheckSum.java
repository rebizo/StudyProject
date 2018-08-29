package spring.JavaBase.FileSystem.Streams;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CheckSum {

    public static void main(String[] args) throws IOException {

        /* InputStream inputStream = getStream(new byte[]{0x33, 0x45, 0x01});
        int result = checkSumOfStream(inputStream);
        System.out.print(result);*/

        System.out.println(checkSumOfStream(new ByteArrayInputStream
                (new byte[]{0x33, 0x45, 0x01})));
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {

        int Cn = 0;
        int read = inputStream.read();
        while (read > 0) {
            Cn=Integer.rotateLeft(Cn,1) ^ read;
            read = inputStream.read();
        }
        return Cn;
    }
}