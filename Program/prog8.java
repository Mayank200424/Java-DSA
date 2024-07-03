package Program;

import java.util.Scanner;

public class prog8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number :");
        int a = sc.nextInt();

        System.out.println("Enter Number :");
        int b = sc.nextInt();

        if(a > b){
            System.out.println("A is Big");
        } else if (b > a) {
            System.out.println("B is Big");
        }else {
            System.out.println("Both Are Same");
        }
    }
}
