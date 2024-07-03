package Array;

public class array31 {
    public static void main(String[] args) {
        // Find 2nd largest element form array
        int[] a = {1, 4, 8, 9, 10, 20, 18, 15};
        int n = a.length;
        int FirstMax = 0,SecondMax = 0;

        for(int i = 0; i < n; i++)
        {
            if(a[i] > FirstMax)
            {
                SecondMax = FirstMax;
                FirstMax = a[i];
            }else if(a[i] > SecondMax)
            {
                SecondMax = a[i];
            }
        }
        System.out.println(SecondMax);
    }
}
