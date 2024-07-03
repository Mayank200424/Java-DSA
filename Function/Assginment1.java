package Function;

public class Assginment1 {
    public static void main(String[] args) {
        int[] a = {2,7,3,60,10,12};
        int n = a.length;
        int sum=10;
        int s = 0,count=0;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                s = a[i] + a[j];
                if(s == sum)
                {
                   count++;
                }
            }
        }
       if(count > 1)
       {
           System.out.println("Present");
       }
       else
       {
           System.out.println("Not Present");
       }
    }
}
