package spring.Numbers;

import java.util.Arrays;

public class SortArrayCopy {

    public static int[] mergeArrays(int[] a1, int[] a2) {

        int length = a1.length + a2.length;
        int[] res = new int[length];
        System.arraycopy(a1, 0, res, 0, a1.length);
        System.arraycopy(a2, 0, res, a1.length, a2.length);
        Arrays.sort(res);
        return res;
    }

    public static void main(String[] args) {
        /*int[] a1 = new int[]{1, 10, 4};
        int[] a2 = new int[]{2, 5, 3};

        int resArr;
        resArr = a1.length + a2.length;
        for (int i = 0; i <= resArr; i++) {*/
            System.out.println(Arrays.toString(mergeArrays(new int[]{1, 10, 4}, new int[]{2, 5, 3})));
        }
    }
