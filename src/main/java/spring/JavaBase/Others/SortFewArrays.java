package spring.JavaBase.Others;

import java.util.Arrays;

public class SortFewArrays {

    public static void main(String[] args) {

        int[] a1 = {1,2,5,18};
        int[] a2 = {2,3,5,9};

        //for (int i = 0; i < res.length; i++){
        System.out.println(Arrays.toString(mergeArrays(a1, a2)));
        //System.out.println(Arrays.toString(mergeArrays(new int[]{1, 10, 4}, new int[]{2, 5, 3})));
        // }
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {

        int[] res = new int[a1.length +  a2.length];
        int i1 = 0;
        int i2 = 0;

        for (int i = 0; i < a1.length+a2.length; i++) {

            if (i1 >= a1.length){
                res[i] = a2[i2];
                i2++;
                continue;
            }
            if (i2 >= a2.length){
                res[i] = a1[i1];
                i1++;
                continue;
            }

            res[i] = (a1[i1] < a2[i2] ? a1[i1++] : a2[i2++]); // ниже аналог
        }
        /*    if (a1[i1] < a2[i2]) {
                res[i] = a1[i1];
                 i1++;

            }
           else {
                res[i] = a2[i2];
                 i2++;

            }*/
             //int[] result = new int[a1.length + a2.length];
        return res;
    }
}
