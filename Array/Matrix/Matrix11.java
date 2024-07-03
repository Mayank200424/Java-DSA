package Array.Matrix;

public class Matrix11 {
    public static void main(String[] args) {
        // Find element from sorted matrix : Binary search: solution log(row) + log(column)
        int[][] matrix = {
                {1,3,5,8},
                {4,7,9,10},
                {6,9,12,11},
                {8,19,20,25}
        };
        int row = 0;
        int column = matrix[0].length - 1;
        int v = 30;

        while (row < matrix.length && column >= 0)
        {
            if(matrix[row][column] == v)
            {
                System.out.println("present");
                return;
            } else if (matrix[row][column] < v) {
                row++;
            }
            else
            {
                column--;
            }
        }
        System.out.println("Not Present");
    }
}
