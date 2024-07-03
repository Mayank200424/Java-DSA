package Array;

import java.util.Arrays;

public class array24 {
    public static void main(String[] args) {
        //Arr1,Arr2 same size -> arr3 alternative
        int[] a1 = {1, 3, 5};
        int[] a2 = {2, 4, 6};
        int[] a = new int[a1.length + a2.length];
        int j = 0, k = 0, c = 0;
        for (int i = 0; i < a.length; i++) {
            if (c % 2 == 0) {
                a[i] = a1[j];
                j++;
            } else {
                a[i] = a2[k];
                k++;
            }
            c++;
        }
        System.out.print(Arrays.toString(a));
    }
}
