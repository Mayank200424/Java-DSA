package Array;

public class array14 {
    public static void main(String[] args) {
        // Store array in reverse order in new array
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int[] b = new int[a.length];
        int j=0;

        for(int i=a.length-1;i>=0;i--)
        {
            b[j] = a[i];
            System.out.print(b[j] + " ");
            j++;
        }



    }
}
