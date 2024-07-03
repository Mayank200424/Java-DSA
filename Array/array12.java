package Array;
public class array12 {
    public static void main(String[] args) {
        // Copy array element in another array
        int[] a = {2,5,0,9,3,8};
        int n = a.length;
        int[] b = new int[n];
        int j=0;

        for(int i=0;i<n;i++)
        {
            b[j] = a[i];
            System.out.print(b[j] + " ");
            j++;
        }
    }
}
