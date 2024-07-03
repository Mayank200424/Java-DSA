package Leetcode;

public class Leetcode13 {
    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3},{3,5}};
        int row = accounts.length;
        int column = accounts[0].length;
        int sum = 0;

        for (int i=0;i<row;i++)
        {
            int sum1=0;
            for (int j=0;j<column;j++)
            {
                sum1 = sum1 + accounts[i][j];
            }
            sum = Math.max(sum,sum1);
        }
        System.out.println(sum);
    }
}
