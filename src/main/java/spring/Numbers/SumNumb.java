package spring.Numbers;

import java.util.Scanner;

class SumNumb {

    public static void main (String [] args){

        for(int i = 0; i < 10; i++) {

        System.out.print("Введите любое целое число от 1 до 10: ");
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число 1: ");
        int one = in.nextInt();

        System.out.print("Введите число 2: ");
        int two = in.nextInt();

        int asd = one + two;

        System.out.println("Результат: " + asd);

        }
    }
}
