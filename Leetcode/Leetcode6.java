package Leetcode;

public class Leetcode6 {
    public static void main(String[] args) {
        //1512
        int[] nums = {1,2,3,1,1,3};
        int n = nums.length;
        int count = 0 ;
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (nums[i]==nums[j] && i<j){
                    count++ ;
                }
            }
        }
        System.out.println(count);
    }
}
