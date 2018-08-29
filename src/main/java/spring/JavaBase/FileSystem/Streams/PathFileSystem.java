package spring.JavaBase.FileSystem.Streams;

import java.io.File;
import java.io.IOException;

public class PathFileSystem {

    static File file1 = new File("a\\b\\c\\file.txt");
    static File file2 = new File("a\\b\\..\\file.txt");
    static File file3 = new File("a\\..\\b\\c\\file.txt");
    static File file4 = new File("a\\.\\b\\..\\c\\.\\file.txt");
    static File file5 = new File(".\\a\\b\\..\\b\\c\\.\\file.txt");

    static String cannonicalFile1;
    static String cannonicalFile2;
    static String cannonicalFile3;
    static String cannonicalFile4;
    static String cannonicalFile5;

    static {
        try {
            cannonicalFile1 = String.valueOf(file1.getCanonicalFile());
            cannonicalFile2 = String.valueOf(file2.getCanonicalFile());
            cannonicalFile3 = String.valueOf(file3.getCanonicalFile());
            cannonicalFile4 = String.valueOf(file4.getCanonicalFile());
            cannonicalFile5 = String.valueOf(file5.getCanonicalFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(cannonicalFile1);
        System.out.println(cannonicalFile2);
        System.out.println(cannonicalFile3);
        System.out.println(cannonicalFile4);
        System.out.println(cannonicalFile5);
    }
}
