package spring.fibonachi;
import java.util.*;

public class BigFibDivide {

    private static int f (int n) {
        if (n<=2)
            return 1;
        return f(n-1)+f(n-2);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n;
        int m;
        do {
            n = scan.nextInt();
            m = scan.nextInt();
        }
        while ((n <= 1 && n <= 10e+18) && (m >= 2 && m <= 10e+5));
        System.out.println(f(n)%m);
    }

}