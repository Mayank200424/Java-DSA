package Leetcode;

public class Leetcode3 {
    public static void main(String[] args) {
        int[] a = {3,3};
        int n = a.length;
        int m = 6;

        for(int i = 0;i < n;i++){
            for(int j=1;j<n;j++){
                if(a[i] + a[j] == m){
                    System.out.print(i + " ");
                }
            }
        }
    }
}
