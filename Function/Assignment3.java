package Function;

import java.util.Arrays;

public class Assignment3 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8};
        int m = 3;
        for(int i=0;i<m;i++){
            int temp = a[0],j;
            for(j=0;j<a.length-1;j++){
                a[j] = a[j+1];
            }
            a[j] = temp;
        }
        System.out.print(Arrays.toString(a));
    }
}
