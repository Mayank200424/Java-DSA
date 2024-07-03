package Algorithm;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        //Bubble short = O(n^2)

        int[] a = {10,9,6,4,8,7,2,5,3,1};
        int n=a.length;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(a));
    }
}
