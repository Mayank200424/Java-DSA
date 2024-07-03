package Array.Matrix;

public class Matrix16 {
    public static void main(String[] args) {
        // Given an unsorted matrix of Row x Col. Check if pair with given sum is present in matrix or not
        int[][] matrix = {
                {1,9,4},
                {0,3,8},
                {11,5,9},
        };
        int sum = 70;
        int row = matrix.length;
        int column = matrix[0].length;

        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < column; j++)
            {
                for(int k = 0; k < row; k++)
                {
                    for(int l = 0; l < column; l++)
                    {
                        if(matrix[i][j] + matrix[k][l] == sum)
                        {
                            System.out.print("present");
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("Not Present");
    }
}
