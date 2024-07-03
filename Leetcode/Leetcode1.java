package Extra;

import java.util.Arrays;

public class Leetcode1 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int n = a.length;

        for(int i=1;i<n;i++){
            a[i] = a[i-1]+a[i];
        }
        System.out.print(Arrays.toString(a));
    }
}
