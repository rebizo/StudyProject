/*
package spring.JavaBase.FileSystem.Streams.SumScanners;

import org.junit.Assert;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Junit {

    @org.junit.Test
    public void parse1() throws Exception {
        String input = "1 2 3";
        String expected = "6.000000";

        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes(SumSysInOut.CHARSET));
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        // create custom output stream
        PrintStream customStream = new PrintStream(outputStream);

        // execute code
        SumSysInOut.main(inputStream, customStream, SumSysInOut.CHARSET);

        System.out.printf("%-20s %-30s\n", "Test", new Exception("not thrown").getStackTrace()[0].getMethodName());
        System.out.printf("%-20s %-30s\n", "Input", input);
        System.out.printf("%-20s %-30s\n", "Expected output", expected);
        System.out.printf("%-20s %-30s\n", "Actual output", outputStream);
        System.out.println();

        // compare an expected output to the actual output
        Assert.assertEquals(expected, outputStream.toString());
    }

    @org.junit.Test
    public void parse2() throws Exception {
        String input = "a1 b2 c3";
        String expected = "0.000000";

        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes(SumSysInOut.CHARSET));
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        // create custom output stream
        PrintStream customStream = new PrintStream(outputStream);

        // execute code
        SumSysInOut.main(inputStream, customStream, SumSysInOut.CHARSET);

        System.out.printf("%-20s %-30s\n", "Test", new Exception("not thrown").getStackTrace()[0].getMethodName());
        System.out.printf("%-20s %-30s\n", "Input", input);
        System.out.printf("%-20s %-30s\n", "Expected output", expected);
        System.out.printf("%-20s %-30s\n", "Actual output", outputStream);
        System.out.println();

        // compare an expected output to the actual output
        Assert.assertEquals(expected, outputStream.toString());
    }

    @org.junit.Test
    public void parse3() throws Exception {
        String input = "-1e3\n" +
                "18 .111 11bbb";
        String expected = "-981.889000";

        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes(SumSysInOut.CHARSET));
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        // create custom output stream
        PrintStream customStream = new PrintStream(outputStream);

        // execute code
        SumSysInOut.main(inputStream, customStream, SumSysInOut.CHARSET);

        System.out.printf("%-20s %-30s\n", "Test", new Exception("not thrown").getStackTrace()[0].getMethodName());
        System.out.printf("%-20s %-30s\n", "Input", input);
        System.out.printf("%-20s %-30s\n", "Expected output", expected);
        System.out.printf("%-20s %-30s\n", "Actual output", outputStream);
        System.out.println();

        // compare an expected output to the actual output
        Assert.assertEquals(expected, outputStream.toString());
    }

}*/
