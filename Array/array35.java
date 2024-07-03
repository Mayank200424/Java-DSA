package Array;

public class array35 {
    public static void main(String[] args) {
        int[] a = {1, 4, 8, 9, 10, 20, 18, 15};
        int n = a.length;
        int FirstMax = 0,SecondMax = 0,ThreeMax = 0;

        for(int i=0;i<n;i++)
        {
            if(a[i] > FirstMax)
            {
                ThreeMax = SecondMax;
                SecondMax = FirstMax;
                FirstMax = a[i];
            } else if (a[i] > SecondMax) {
                ThreeMax = SecondMax;
                 SecondMax = a[i];
            } else if (a[i] > ThreeMax) {
                ThreeMax = a[i];

            }
        }
        System.out.println(ThreeMax);
    }
}
