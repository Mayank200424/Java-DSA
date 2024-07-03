package Program;

import java.util.Scanner;

public class prog12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int r;
        int c=0;
        while (n > 0){
            r = n % 10;
            c++;
            n = n / 10;
        }
        System.out.println(c);
    }
}
