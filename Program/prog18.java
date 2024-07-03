package Program;

import java.util.Scanner;
public class prog18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number 1 : ");
        int n = sc.nextInt();

        int ans=1;

        for(int i=n;i>=1;i--){
            ans = ans * i;
            System.out.println(" "+i);
        }
        System.out.print(ans);
    }
}
