package Leetcode;

public class Leetcode8 {
    public static void main(String[] args) {
        //1748
        int[] a = {1,2,3,2};
        int n = a.length;
        int s=0;

        for(int i=0;i<n;i++){
            int v = a[i],count=0;
            for(int j=i+1;j<n;j++){
                if(v == a[j]){
                    count++;
                }
            }
            if(count > 0)
            {
                System.out.print(v + " ");
            }
        }
    }
}
