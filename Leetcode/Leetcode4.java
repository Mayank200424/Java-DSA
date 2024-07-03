package Leetcode;

public class Leetcode4 {
    public static void main(String[] args) {
        //Question No - 2535
        int[] a = {2,7,8,10,8,10,1,10,5,9};
        int n = a.length;
        int sum=0,sum1=0,sum2=0,sum3;

        for(int i=0;i<n;i++){
            sum = a[i] + sum;
        }
        for(int j=0;j<n;j++){
            if(a[j] < 10){
                sum1 = sum1 + a[j];
            }else
            {
                while(a[j] > 0) {
                    int r = a[j] % 10;
                    sum2 = sum2 + r;
                    a[j] = a[j] / 10;
                }
            }
        }
        sum3 = sum1 + sum2;
       System.out.println(sum - sum3);

    }
}
