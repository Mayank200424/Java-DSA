package Array;
public class array8 {
    public static void main(String[] args) {
        // Print alternate elements from array
        int[] a = {1,2,3,4,5,6,7,8,9,10};

        for(int i=0;i<a.length;i++)
        {
            if(i % 2 == 0)
            {
                System.out.print(a[i] + " ");
            }
        }
    }
}
