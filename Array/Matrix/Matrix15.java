package Array.Matrix;

public class Matrix15 {
    public static void main(String[] args) {
        // Sum of all diagonal elements in matrix (same position not allowed twice)
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum = sum + matrix[i][i];
            matrix[i][i] = 0;
            sum = sum + matrix[i][matrix.length - i - 1];
        }

        System.out.println(sum);
    }
}
