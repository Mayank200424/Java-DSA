package Array;

import java.util.Arrays;

public class array29 {
    public static void main(String[] args) {
        // Move all 0 to right and 1s to left
        int[] a = {0,1,1,0,1,0,1};
        int n = a.length;
        int start = 0,end = n - 1;

        while (start <= end){
            if(a[start] == 1){
                start++;
            } else if (a[end] == 0) {
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
