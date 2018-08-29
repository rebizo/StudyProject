package spring.JavaBase.FileSystem.Streams;

import java.nio.charset.StandardCharsets;

public class CharInByte {

    public static void main(String[] args) {
        for (byte b : "Ы".getBytes(StandardCharsets.UTF_8)){
            System.out.printf("%d ", Byte.toUnsignedInt(b));
        }
    }
}
