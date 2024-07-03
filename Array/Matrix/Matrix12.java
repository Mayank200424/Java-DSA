package Array.Matrix;

public class Matrix12 {
    public static void main(String[] args) {
        // Print diagonal elements (top-right to bottom-left) - square matrix
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        int row = matrix.length;
        int c = row - 1;
        for(int i = 0; i < row; i++)
        {
            System.out.print(matrix[i][c] + " ");
            c--;
        }

    }
}
