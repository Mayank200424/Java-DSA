package Array.Matrix;

public class Matrix8 {
    public static void main(String[] args) {
        // Find highest sum among all rows
        int[][] matrix = {
                {2,9,5,6},
                {4,3,10,12},
                {6,2,4,8}
        };
        int row = matrix.length;
        int column = matrix[0].length;
        int temp = Integer.MIN_VALUE;

        for(int i=0;i<column;i++)
        {
            int sum = 0;
            for(int j=0;j<row;j++)
            {
                sum = sum + matrix[j][i];
            }
            if(sum > temp)
            {
                temp = sum;
            }
        }
        System.out.println(temp);
    }
}
