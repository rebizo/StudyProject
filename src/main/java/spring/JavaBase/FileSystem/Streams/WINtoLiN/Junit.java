package spring.JavaBase.FileSystem.Streams.WINtoLiN;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Junit {
    @Test
    public void DoNothingIfArrayIsEmpty() throws Exception {
        byte [] inputBytes = {};
        byte [] expectedBytes = {};
        assertArrayEquals(expectedBytes, doTest(inputBytes));
    }

    @Test
    public void DoNothingIfThereIsNoSpecialCharacters() throws Exception {
        byte[] inputBytes =  { 1, 2, 3 };
        byte[] expectedBytes = { 1, 2, 3 };
        assertArrayEquals(expectedBytes, doTest(inputBytes));
    }

    @Test
    public void ReplaceAtLeft() throws Exception {
        byte[] inputBytes = { 13, 10, 1, 2, 3, 4, 5, 6 };
        byte[] expectedBytes = { 10, 1, 2, 3, 4, 5, 6 };
        assertArrayEquals(expectedBytes, doTest(inputBytes));
    }

    @Test
    public void ReplaceAtCenter() throws Exception {
        byte[] inputBytes =  { 1, 2, 3, 13, 10, 4, 5, 6 };
        byte[] expectedBytes = { 1, 2, 3, 10, 4, 5, 6 };
        assertArrayEquals(expectedBytes, doTest(inputBytes));
    }

    @Test
    public void ReplaceAtRight() throws Exception {
        byte[] inputBytes =    { 1, 2, 3, 4, 5, 6, 13, 10 };
        byte[] expectedBytes = { 1, 2, 3, 4, 5, 6,     10 };
        assertArrayEquals(expectedBytes, doTest(inputBytes));
    }

    @Test
    public void ReplaceOnlyOnce() throws Exception {
        byte[] inputBytes =  { 1, 2, 3, 13, 13, 10, 4, 5, 6 };
        byte[] expectedBytes = { 1, 2, 3, 13, 10, 4, 5, 6 };
        assertArrayEquals(expectedBytes, doTest(inputBytes));
    }

    @Test
    public void DoNotReplaceReversedSymbols() throws Exception {
        byte[] inputBytes =  { 1, 2, 3, 10, 13, 4, 5, 6 };
        byte[] expectedBytes = { 1, 2, 3, 10, 13, 4, 5, 6 };
        assertArrayEquals(expectedBytes, doTest(inputBytes));
    }

    @Test
    public void ReplaceMultipleMatches() throws Exception {
        byte[] inputBytes =    { 1, 2, 3, 13, 10, 13, 10, 4, 5, 6 };
        byte[] expectedBytes = { 1, 2, 3, 10, 10, 4, 5, 6 };
        assertArrayEquals(expectedBytes, doTest(inputBytes));
    }

    @Test
    public void ReplaceMultipleMatchesAtDifferentPlaces() throws Exception {
        byte[] inputBytes =    { 1, 2, 13, 10, 3, 4, 13, 10, 5, 6 };
        byte[] expectedBytes = { 1, 2, 10, 3, 4, 10, 5, 6 };
        assertArrayEquals(expectedBytes, doTest(inputBytes));
    }

    @Test
    public void TestDataFromStepic() throws Exception {
        byte[] inputBytes =    { 65, 13, 10, 10, 13 };
        byte[] expectedBytes = { 65, 10, 10, 13 };
        assertArrayEquals(expectedBytes, doTest(inputBytes));
    }

    @Test
    public void TestDataFromPilosus() throws Exception {
        byte[] inputBytes =    { 65, 66, 13, 13, 10, 10, 13, 67, 13, 13 };
        byte[] expectedBytes = { 65, 66, 13, 10, 10, 13, 67, 13, 13 };
        assertArrayEquals(expectedBytes, doTest(inputBytes));
    }

    public byte[] doTest(byte[] inputBytes) throws IOException {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(inputBytes);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setIn(inputStream);
        System.setOut(printStream);
        WindowsToUnix.main(null);
        return outputStream.toByteArray();
    }
}