package spring.Numbers;
import java.util.Scanner;

public class SumMaxNumber {

    public static void main(String[] args) {

        int n;
        int k;
        int dx;
        int sum;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        n = scan.nextInt();

        for (k = 2; (k + 1)*k / 2 <= n; k++);

        k--;

            sum = (1 + k) * k / 2;
            dx = n - sum;

            System.out.println(k);

        for(int i = 1; i < k; i++) {
            System.out.print(i + " ");
        }
        System.out.println(k + dx);
    }
}

