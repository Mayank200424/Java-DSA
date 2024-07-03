package Recursion;

public class Recursion3 {

    public static void main(String[] args) {
        // Sum of 1 to n numbers
        System.out.println(sum(5));
    }
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n + sum(n-1);
    }
}
