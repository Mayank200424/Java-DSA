package Recursion;

public class Recursion2 {
    public static void main(String[] args) {
        // Calculate the factorial of a number
        System.out.print(fact(5));
    }
    public static int fact(int n){
        if(n == 1){
            return 1;
        }
        return n * fact(n - 1);
    }
}
