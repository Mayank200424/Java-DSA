package Array.Matrix;

public class Matrix6 {
    public static void main(String[] args) {
        // Print matrix in spiral
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int row = matrix.length;
        int column = matrix[0].length;

        for(int i=0;i<row;i++)
        {
            if(i % 2 == 0)
            {
                for(int j=0;j<column;j++)
                {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            else
            {
                for(int j=column-1;j>=0;j--)
                {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
