package Array;

import java.util.Arrays;

public class array30 {
    public static void main(String[] args) {
        // Move odd Numbers to left and even number to right
        int[] a = {2,8,3,4,6,5,7,1};
        int  n = a.length;
        int start = 0,end = n - 1;
        while (start <= end)
        {
            if(a[start] % 2 != 0){
                start++;
            } else if (a[end] % 2 == 0) {
                end--;
            }else {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
        }
        System.out.print(Arrays.toString(a));
    }
}
