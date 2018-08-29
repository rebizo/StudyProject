package spring.JavaBase.Others;

import java.util.function.DoubleUnaryOperator;

public final class LeftIntegral {

    private static double integrate(DoubleUnaryOperator f, double a, double b) {

        // @Override
        double result;
            result = 0;
            double n = 1000000;
            double h = (b - a) / n; //Шаг сетки

        for (int i = 0; i < n; i++) {
        result += (f.applyAsDouble(a + h * (i + 0.5)));
        }
            result *= h;
            //}
            //while (a <= b);
            return result;
    }

        //return f.applyAsDouble(a);

        public static void main (String[]args){
            System.out.println(integrate(x -> 1, 0, 10));//10.0
            System.out.println(integrate(x -> x + 2, 0, 10));//70.0
            System.out.println(integrate(x -> Math.sin(x) / x , 1, 5));//0.603848
        }
    }