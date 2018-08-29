package spring.Numbers;

public class FindMax2 {

    public static void main(String[] args) {

        System.out.println(f(12, 24));
    }

    public static int f(int a, int b) {

        int result = 0;
        if (a==0) {return b;}
        else if (b==0) {return a;}

        for (int i = 1; i < Math.max(a, b); i++) {
            if (a % i == 0 && b % i == 0)

                result = i;
        }
        return result;
    }
}
