package Recursion;

public class Recursion5 {
    public static void main(String[] args) {
        // Count the digits of a given number using recursion
        System.out.println(countDigit(125));
    }
    public static int countDigit(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + countDigit(n / 10);
    }
}
