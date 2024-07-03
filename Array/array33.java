package Array;

import java.util.Arrays;

public class array33 {
    public static void main(String[] args) {
        int n = 5;
        int[] a = {4,1,3,5,3,2};
        int sum2=0;
        int sum1 = (n * (n + 1))/2;

        for(int i=0;i<a.length;i++){
            sum2 = sum2 + a[i];
        }
        System.out.print(sum2 - sum1);
    }
}
