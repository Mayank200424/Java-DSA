package Array;

public class array27 {
    public static void main(String[] args) {
        // Find common elements between two array
        int[] a1 = {1,2,3,4,7};
        int[] a2 = {2,3,5,6,7};

        for(int i=0;i<a1.length;i++)
        {
            for(int j=0;j<a2.length;j++)
            {
                if(a1[i] == a2[j])
                {
                    System.out.print(a1[i] + " ");
                }
            }
        }
    }
}
