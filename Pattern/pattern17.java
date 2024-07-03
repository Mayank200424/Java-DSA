package Pattern;

public class pattern17 {
    public static void main(String[] args) {
        int n=9;
        for(int i=n;i>=1;i--)
        {
            for(int k=i;k<n;k++)
            {
                if(i%2==0)
                {
                    continue;
                }
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                if(i%2==0)
                {
                    continue;
                }
                System.out.print("* ");
            }
            if(i%2==0)
            {
                continue;
            }
            System.out.println();
        }
        for(int i=3;i<=n;i++)
        {
            for(int k=i;k<n;k++)
            {
                if(i%2==0)
                {
                    continue;
                }
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                if(i%2==0)
                {
                    continue;
                }
                System.out.print("* ");
            }
            if(i%2==0)
            {
                continue;
            }
            System.out.println();
        }

    }
}
