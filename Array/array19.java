package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class array19 {
    public static void main(String[] args) {
        // Array Assignment
        // Given an integer array of length n(even).Create two new arrays a1,a2 of same size from array and print.

        int[] a = {1,2,3,4,5,6};
        int n = a.length;
        int[] a1 = new int[n/2];
        int[] a2 = new int[n/2];
        int j=0,k=0;

        for(int i = 0;i<n/2;i++)
        {
            a1[j]  = a[i];
            j++;
        }
        for(int i = n/2;i<n;i++)
        {
            a2[k]  = a[i];
            k++;
        }
        System.out.println(Arrays.toString(a1));
        System.out.print(Arrays.toString(a2));

    }


}
