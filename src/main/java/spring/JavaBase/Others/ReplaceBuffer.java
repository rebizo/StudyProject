package spring.JavaBase.Others;

import java.util.Scanner;

public class ReplaceBuffer extends Factor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text;
        text = scan.nextLine();
        System.out.println(isPalindrome(text));
    }

    public static boolean isPalindrome(String text) {

        text = text.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        StringBuilder buffer = new StringBuilder(text);
        buffer.reverse();
        return (buffer.toString().equals(text.toLowerCase()));
    }
}

