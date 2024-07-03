package Program;

import java.util.Scanner;

public class prog13 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number :");

        int n = scanner.nextInt();

        int rev=0,r,m;
        m=n;
        while (n > 0){
            r = n % 10;
            rev = (rev * 10) + r;
            n = n / 10;
        }
        if(m == rev){
            System.out.println("Number is Palindrome");
        }else {
            System.out.println("Number is Not Palindrome");
        }
    }
}
