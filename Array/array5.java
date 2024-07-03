package Array;
public class array5 {
    public static void main(String[] args) {
        // Check if element is present or not
        int[] a = {1,2,3,4,5};
        int n=a.length;
        int d = 5;

        for(int i=0;i<n;i++)
        {
            if(a[i] == d)
            {
                System.out.print("Number is Present");
                return;
            }
        }
        System.out.print("Number is not Present");
    }
}
