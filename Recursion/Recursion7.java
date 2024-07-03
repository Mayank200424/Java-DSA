package Recursion;

public class Recursion7 {
    static int ans = 1;
    public static void main(String[] args) {
        // calculate the product of two numbers using recursion
        System.out.println(product(123));
    }
    public static int product(int n){
        if(n == 0){
            return 0;
        }
        int r = n % 10;
        ans = ans * r;
        product(n / 10);
        return ans;
    }
}
