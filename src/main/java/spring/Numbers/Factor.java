package spring.Numbers;

public class Factor {

    public static void main(String[] args) {
        System.out.println(isFactor(2));
    }

    public static int isFactor(int value) {

        if (value == 0 || value == 1) return 1;
        int res = 1;
        for (int i = 2; i <=value; i++){
            res*=i;
        }
        return res;
    }
}
