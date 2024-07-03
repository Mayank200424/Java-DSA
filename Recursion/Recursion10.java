package Recursion;

public class Recursion10 {
    static int i  = 2;
    public static void main(String[] args) {
        // check if a number is a prime number or not using recursion

        int n = 7;
        System.out.println(isPrime(n,i));
    }
    public static boolean isPrime(int n,int i){
        if(n < 2){
            return false;
        }
        if(i == n) {
            return true;
        } else if (n % i == 0) {
            return false;
        }else {
           return isPrime(n, i + 1);
        }
    }
}
