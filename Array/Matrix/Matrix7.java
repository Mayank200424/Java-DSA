package Array.Matrix;

public class Matrix7 {
    public static void main(String[] args) {
        // Find highest sum among all columns
        int[][] matrix = {
                {2,9,5,6},
                {4,3,10,12},
                {6,2,4,8}
        };
        int row = matrix.length;
        int column = matrix[0].length;
        int temp = Integer.MIN_VALUE;

        for(int i=0;i<row;i++)
        {
            int sum = 0;
            for(int j=0;j<column;j++)
            {
                sum = sum + matrix[i][j];
            }
            if(sum > temp)
            {
                temp = sum;
            }
        }
        System.out.println(temp);
    }
}
