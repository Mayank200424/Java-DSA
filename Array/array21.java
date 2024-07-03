package Array;

public class array21 {
    public static void main(String[] args) {
        // Array Assignment
        // Given an integer array and a number b.Count how many times d is present in the array.

        int[] a = {6, 3, 5, 2, 7, 6};
        int d = 6,c=0;

        for(int i=0;i<a.length;i++)
        {
            if(a[i] == d)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}
