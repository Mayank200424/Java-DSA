package Recursion;

public class Recursion8 {
    static int ans = 0;
    public static void main(String[] args) {
        // find the sum of digits of a number using recursion
        System.out.println(sumOfDigits(1234));
    }
    public static int sumOfDigits(int n){
        if(n == 0){
            return 0;
        }
        int r = n % 10;
        ans = ans + r;
        sumOfDigits(n / 10);
        return ans;
    }
}
