package Program;

import java.util.Scanner;

public class prog14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number 1 :");
        int n1 = sc.nextInt();

        System.out.print("Enter Number 2 :");
        int n2 =sc.nextInt();

        int a=0;
        for(int i=1; i<=n2; i++){
            a = a + n1;
        }
        System.out.println(a);
    }
}
