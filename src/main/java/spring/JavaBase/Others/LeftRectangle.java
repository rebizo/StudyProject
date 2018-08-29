package spring.JavaBase.Others;

import java.util.function.DoubleUnaryOperator;

public class LeftRectangle {

    public static void main(String[] args) {
        System.out.println(integrate(x -> 1, 0, 10));//10.0
        System.out.println(integrate(x -> x + 2, 0, 10));//70.0
        System.out.println(integrate(x -> Math.sin(x) / x, 1, 5));//0.603848
    }

    private static double integrate(DoubleUnaryOperator f, double a, double b) {

/*        int i;
        double n = 1e-7;
        double result, h;
        result = 0;
        h = (b - a) / n; //Шаг сетки

            for (i=0; i<n; i++) {
                result += f.applyAsDouble(a + h * (i + 0.5)); //Вычисляем в средней точке и добавляем в сумм
            }

            result *= h;

        return result;*/

        double res = 0;

        do {
            res += 0.000001 * f.applyAsDouble(a);
            a+=0.000001;
        }
        while (a<b);
            return res;
    }
}
