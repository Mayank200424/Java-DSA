package Array.Matrix;

public class Matrix1 {
    public static void main(String[] args) {
        // Print a matrix
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int row = matrix.length;
        int column = matrix[0].length;

        for(int i=0;i<row;i++)
        {
            for (int j=0;j<column;j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }
}
