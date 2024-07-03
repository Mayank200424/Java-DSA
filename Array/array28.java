package Array;

public class array28 {
    public static void main(String[] args) {
        int[] a = {1,2,3,2,4,5,6,5,7};
        int n = a.length;

        for(int i=0;i<n;i++)
        {
            int c = 0;
            for(int j=0;j<n;j++)
            {
                if(a[i] == a[j])
                {
                    c++;
                }
            }
            if(c == 1)
            {
                System.out.print(a[i] + " ");
            }
        }
    }
}
