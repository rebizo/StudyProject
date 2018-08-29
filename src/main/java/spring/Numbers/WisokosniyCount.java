package spring.Numbers;

public class WisokosniyCount {

    private static int countmethod(int year) {

        int count = 0;
        for (int i=1; i<=year; i++) {
            if ((i % 4 == 0) && i % 100 != 0 || i % 400 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countmethod(200));
    }
}