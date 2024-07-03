package Array.Matrix;

public class Matrix14 {
    public static void main(String[] args) {
        // Delete max element from each row
        int[][] arr = {
                {1, 2, 3},
                {8, 22, 10},
                {11, 5, 7}
        };
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < row; i++) {
            int maxIndex = 0;
            for (int j = 1; j < col; j++) {
                if (arr[i][j] > arr[i][maxIndex]) {
                    maxIndex = j;
                }
            }
            for (int k = maxIndex; k < col - 1; k++) {
                arr[i][k] = arr[i][k + 1];
            }
        }
        col--;
        //print array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
