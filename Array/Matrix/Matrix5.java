package Array.Matrix;

public class Matrix5 {
    public static void main(String[] args) {
        // Column wise traversal
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int row = matrix.length;
        int column = matrix[0].length;

        for(int i=0;i<column;i++)
        {
            for(int j=0;j<row;j++)
            {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
