package Array;
public class array6 {
    public static void main(String[] args) {
        // Count odd/even element in array
        int[] a = {1,2,3,4,5};
        int n=a.length;
        int c = 0;
        int d = 0;

        for(int i=0;i<n;i++)
        {
            if(a[i] % 2 == 0)
            {
                c++;
            }
            else
            {
                d++;
            }
        }
        System.out.println("Even Number : " + c);
        System.out.print("Odd Number : " + d);
    }
}
