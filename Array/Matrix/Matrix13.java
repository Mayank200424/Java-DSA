package Array.Matrix;

public class Matrix13 {
    public static void main(String[] args) {
        // Print diagonal elements (top-left to bottom-right) - square matrix
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int row = matrix.length;
        int c = 0;
        for(int i = 0; i < row; i++)
        {
            System.out.print(matrix[i][c] + " ");
            c++;
        }
    }
}
