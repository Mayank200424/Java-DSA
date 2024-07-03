package Array.Matrix;

public class Matrix17 {
    public static void main(String[] args) {
        // Given a matrix of Row x Col. Rotate it by 90 degree
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        int row = matrix.length;
        int column = matrix[0].length;

        for(int i=0;i<row;i++)
        {
            for(int j = column - 1; j >= 0; j--)
            {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

    }
}
