package Leetcode;

import java.util.Arrays;

public class Leetcode5 {
    public static void main(String[] args) {
        //1365
        int[] a = {8,1,2,2,3};//4,0,1,1,3;
        int n = a.length;
        int[] b = new int[n];

        for(int i=0;i<n;i++){
            int c = 0;
            for(int j=0;j<n;j++)
            {
                if(a[i] > a[j])
                {
                    c++;
                    b[i] = c;
                }
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
