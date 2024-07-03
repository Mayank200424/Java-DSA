package Array;

public class array11 {
    public static void main(String[] args) {
       // Find largest element from array
        int[] a = {1,5,8,2,10,7,15};
        int max = 0;

        for(int i = 0; i < a.length;i++)
        {
            if(a[i] > max)
            {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
