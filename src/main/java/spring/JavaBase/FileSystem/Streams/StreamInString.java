package spring.JavaBase.FileSystem.Streams;

import java.io.*;
import java.nio.charset.Charset;

public class StreamInString {

    static String convert(InputStream inputStream, Charset charset) throws IOException {


/*      byte[] c = String.valueOf(read).getBytes("ASCII");
        char c1[];

        int i=inputStream.read();

        StringBuilder buffer = new StringBuilder();
            while (i != -1) {
                i = inputStream.read();
                c1 = Arrays.toString(c).toCharArray();
                buffer.append(c1);
            }
        return String.valueOf(buffer);*/

        BufferedReader read = new BufferedReader(new InputStreamReader(inputStream, charset)); // System.in)

       // StringWriter wr = new StringWriter();
        StringBuilder wr = new StringBuilder();
        int i;

        while ((i = read.read()) != -1) {
            //wr.write(i);
            wr.append((char)i);
        }
        return String.valueOf(wr);
    }

    public static void main(String[] args) throws IOException {

        ByteArrayInputStream inputStream = new ByteArrayInputStream(new byte[]{48, 49, 50, 51});
        String str = convert(inputStream, Charset.forName("ASCII"));
        System.out.println(str);

    }
}
