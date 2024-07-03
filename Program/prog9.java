package Program;

import java.util.Scanner;

public class prog9 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number :");
        int a = sc.nextInt();

        System.out.print("Enter Number :");
        int b = sc.nextInt();

        System.out.print("Enter Number :");
        int c = sc.nextInt();

       if(a > b && a >c){
           System.out.println("A is Big");
       } else if (b > a && b > c) {
           System.out.println("B is Big");
       } else if (c > a && c > b) {
           System.out.println("C is Big");
       } else if (a == b && a > c) {
           System.out.println("A and B is Big");
       } else if (b == c && b > a ) {
           System.out.println("B and C is Big");
       } else if (c == a && c > b) {
           System.out.println("C And A is Big");
       } else {
           System.out.println("All are Same");
       }
    }
}
