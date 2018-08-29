package spring.JavaBase.Others;

public class SortArrayCodewars {
    /*private static int[] mergeArrays(int[] array) {
        int i;
        int j;
        for (i = array.length - 1; i > 0; i--) {
            for (j = 0; j < i; j++) {
                if ((array[i] % 2 == 0) && (array[j] % 2 == 0)) {
                    if (array[j] > array[j + 1]) {
                        int t = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = t;
                    }
                }
            }
        }
        return array;
    }*/
    //int array [] = new int[]{};
    private static int[] mergeArrays(int[] array) {
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] % 2 != 0 && array[i] > array[i + 1]) {
                    if (array[i] > array[i + 1]) {
                        isSorted = false;
                        temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                    }
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = mergeArrays(new int[]{5, 3, 2, 8, 1, 4});
        for (int m = 0; m < arr.length; m++) {
            System.out.println(arr[m]);
        /*for (int anArr : arr) {
            System.out.println(anArr);
        }*/
        }
    }
}