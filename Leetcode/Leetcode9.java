package Leetcode;

import java.util.Arrays;

public class Leetcode9 {
    public static void main(String[] args) {
        //2574
        int[] a = {10,4,8,3};
        int[] leftSum = new int[a.length];
        int[] rightSum = new int[a.length];
        int[] answer = new int[a.length];
        int left=0,right=0;
        for(int i=0;i<a.length;i++){
            leftSum[i] = left;
            left = left + a[i];
        }
        for(int i=a.length - 1; i>=0; i--){
            rightSum[i] = right;
            right = right + a[i];
        }
        for(int i=0;i<a.length;i++)
        {
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        System.out.println(Arrays.toString(answer));

    }
}
