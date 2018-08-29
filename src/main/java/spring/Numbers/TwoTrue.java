package spring.Numbers;

public class TwoTrue {

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {

 /*       private int count (a, b, c, d) {
        count = a + b + c + d;
        return count;
    }*/

        if ((((a)&&(b))&&((!c)&&(!d))) || (((a)&&(c))&&((!d)&&(!b))) ||
           (((a)&&(d))&&((!b)&&(!c))) || (((b)&&(d))&&((!c)&&(!a))) ||
           (((b)&&(c))&&((!a)&&(!d))) || (((c)&&(d))&&((!a)&&(!b))))
        {
            return true;
        }
        else {return false;}
    }

    public static void main(String[] args) {
        System.out.println(true);
    }
}