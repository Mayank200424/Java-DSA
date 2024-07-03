package Program;

import java.util.Scanner;

public class prog10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c;
        System.out.print("Enter Number A : ");
        int a = sc.nextInt();

        System.out.print("Enter Number B :");
        int b = sc.nextInt();

        c = a;
        a = b;
        b = c;
        System.out.println("A "+a);
        System.out.println("B "+b);
    }
}
