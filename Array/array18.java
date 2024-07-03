package Array;

public class array18 {
    public static void main(String[] args) {
        // Array Assignment
        // Given an integer array of length n .print all the prime number elements.

        int[] a = {4,3,6,7,21,11,15,5};

        for(int i=0;i<a.length;i++)
        {
            boolean ans = true;
            for(int j=2;j<a[i];j++)
            {
                if(a[i] % j == 0)
                {
                    ans = false;
                }
            }
            if(ans == true)
            {
                System.out.print(a[i] + " ");
            }
        }
    }

}
