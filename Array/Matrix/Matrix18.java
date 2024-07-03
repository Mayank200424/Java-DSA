package Array.Matrix;

public class Matrix18 {
    public static void main(String[] args) {
        // Given a binary matrix of Row x Col. Find the row with maximum number of 1’s
        int[][] matrix = {
                {1,0,0},
                {0,0,0},
                {0,1,1},
        };
        int row = matrix.length;
        int column = matrix[0].length;
        int max = Integer.MIN_VALUE;
        int matrixindex = 0;

        for(int i = 0; i < row; i++) {
            int c = 0;
            for (int j = 0; j < column; j++) {
                if (matrix[i][j] == 1) {
                    c++;
                }
            }
            if (c > max) {
                max = c;
                matrixindex = i;
            }
        }
        System.out.println(matrixindex);
    }
}
