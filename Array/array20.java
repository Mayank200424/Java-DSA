package Array;

import java.util.Arrays;

public class array20 {
    public static void main(String[] args) {
        // Array Assignment
        // Given an integer arrays.Merge both the arrays into one new array and print.

        int[] a1 = {1,2,3,4};
        int[] a2 = {5,6,7};
        int[] a = new int[a1.length + a2.length];
        int j=0;

        for(int i=0;i<a1.length;i++)
        {
            a[j] = a1[i];
            j++;
        }
        for(int i=0;i<a2.length;i++)
        {
            a[j] = a2[i];
            j++;
        }
        System.out.print(Arrays.toString(a));
    }
}
