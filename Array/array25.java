package Array;

public class array25 {
    public static void main(String[] args) {
        // Check if given number is duplicate or not
        int[] a =  {1,2,3,3,4,5};
        int d = 5,c=0;

        for(int i=0;i<a.length;i++)
        {
            if(a[i] == d)
            {
                c++;
            }
        }
        if(c > 1)
        {
            System.out.println("Number is Duplicate");
        }
        else
        {
            System.out.println("Number not Duplicate");
        }
    }
}
