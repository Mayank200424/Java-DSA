package Recursion;

public class Recursion6 {
    static int i = 0;
    public static void main(String[] args) {
        // reverse an integer number using recursion
        System.out.println(reverse(153));
    }
    public static int reverse(int n){
        if(n == 0){
            return 0;
        }
        int r = n % 10;
        i = (i * 10) + r;
        reverse(n / 10);
        return i;
    }
}
