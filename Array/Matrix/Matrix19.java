package Array.Matrix;

public class Matrix19 {
    public static void main(String[] args) {
        // Find element from matrix
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int value = 70;
        int row = matrix.length;
        int column = matrix[0].length;

        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                if(matrix[i][j] == value){
                    System.out.println("Present");
                    return;
                }
            }
        }
        System.out.println("Not Present");
    }
}
