package Recursion;

public class Recursion11 {
    public static void main(String[] args) {
        // Print nth number in fibonacci series using recursion
        System.out.println(fibonacci(4));
    }
    public static int fibonacci(int n){
        if(n == 1 || n == 0){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n - 2);
    }
}
