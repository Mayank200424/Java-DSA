package Array;

public class array10 {
    public static void main(String[] args) {
        // Print odd elements first then even elements from array
        int[] a = {1,2,3,4,5,6,7};
        int n = a.length;

        for(int i=0;i<n;i++)
        {
            if(a[i] % 2 != 0)
            {
                System.out.print(a[i] + " ");
            }
        }
        for(int i=0;i<n;i++)
        {
            if(a[i] % 2 == 0)
            {
                System.out.print(a[i] + " ");
            }
        }
    }
}
