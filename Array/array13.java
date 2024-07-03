package Array;
public class array13 {
    public static void main(String[] args) {
        // Copy all the odd elements first then even in new array
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] b = new int[a.length];
        int j = 0;

        for(int i=0;i<a.length;i++)
        {
            if(a[i] % 2 != 0)
            {
                b[j] = a[i];
                System.out.print(b[j] + " ");
                j++;
            }
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i] % 2 == 0)
            {
                b[j] = a[i];
                System.out.print(b[j] + " ");
                j++;
            }
        }
    }
}
