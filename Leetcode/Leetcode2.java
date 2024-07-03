package Leetcode;

public class Leetcode2 {
    public static void main(String[] args) {
        int[] a = {3,2,1,5,4};
        int n = a.length;
        int c=0;
        int k = 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                    if(a[i] - a[j] == k){
                        c++;
                    }
            }
        }
        System.out.println(c);
    }
}
