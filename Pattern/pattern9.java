package Pattern;

public class pattern9 {
    public static void main(String[] args) {
        int n=5,a = 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                a++;
               if(a%2==0){
                   System.out.print("0");
               }
               else
               {
                   System.out.print("1");
               }
            }
            System.out.println();
        }
    }
}
