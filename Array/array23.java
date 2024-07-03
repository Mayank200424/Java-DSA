package Array;

import java.util.Arrays;

public class array23 {
    public static void main(String[] args) {
        // Given an array create another array arr2 with  double the size of arr and copy arr element two times in arr2.
        int[] a = {1,2,3,4,5};
        int[] a2 = new int[a.length * 2];
        int j=0;

        for(int i=0;i<a.length;i++)
        {
            a2[j] = a[i];
            j++;
        }
        for(int i=0;i<a.length;i++)
        {
            a2[j] = a[i];
            j++;
        }
        System.out.print(Arrays.toString(a2));
    }
}
