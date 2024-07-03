package Array;

import java.util.Arrays;

public class array34 {
    public static void main(String[] args) {
        // Merge two sorted array
        int[] a1 = {1,3,5,32,56,73};
        int[] a2 = {0,9,16,21};
        int n1 = a1.length;
        int n2 = a2.length;
        int[] a3 = new int[n1 + n2];
        int k=0,i=0,j=0;

        while (i < n1 && j < n2){
            if(a1[i] > a2[j]){
                a3[k] = a2[j];
                j++;
                k++;
            }else
            {
                a3[k] = a1[i];
                i++;
                k++;
            }
        }
        while (i < n1)
        {
            a3[k] = a1[i];
            i++;
            k++;
        }
        while (j < n2)
        {
            a3[k] = a1[j];
            j++;
            k++;
        }
        System.out.print(Arrays.toString(a3));

    }
}
