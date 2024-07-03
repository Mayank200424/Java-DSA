package Leetcode;

public class Leetcode10 {
    public static void main(String[] args) {
        int[] a = {2,7,11,15};
        int m = 9;
        int n = a.length;
        for(int i = 0;i < n;i++){
            for(int j=1;j<n;j++){
                if(a[i] + a[j] == m){
                    System.out.print(i + " ");
                    System.out.println(j + " ");
                }
            }
        }
    }
}
