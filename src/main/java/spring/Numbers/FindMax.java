package spring.Numbers;
import java.util.Scanner;

public class FindMax {

    public static int f (int a, int b) {

       if (a==0) {return b;}
       else if (b==0) {return a;}
       if (a>=b) {return f(a % b, b);}
       else if (a<=b) {return f(a, b % a);}

       return 0;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a,b; { // мб do {

            a = scan.nextInt();
            b = scan.nextInt();}
        /*while (a < 1 && b > 2 * 10e+9);*/
        System.out.println("Наибольший общий делитель = " + f(a,b));
    }


}
