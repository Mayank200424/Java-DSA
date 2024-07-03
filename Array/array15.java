package Array;

import java.util.Arrays;

public class array15 {
    public static void main(String[] args) {
        //Reverse an array in memory
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int temp = 0, start = 0, end = a.length - 1;

        while (start < end) {
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(a));

    }
}
