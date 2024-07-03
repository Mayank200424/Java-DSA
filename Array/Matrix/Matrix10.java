package Array.Matrix;

public class Matrix10 {
    public static void main(String[] args) {
        // Search in a row wise and column wise sorted matrix (approach: Right top pointer)
        int[][] matrix = {
                {1,4,8,10},
                {12,15,17,19},
                {22,25,28,30},
                {35,38,40,50},
                {55,67,87,99},
        };
        int v = 40;
        int row = matrix.length;
        int column = matrix[0].length;
        int firstRow = 0,lastRow = row - 1;
        int rowTosearched = -1;

        while (firstRow <= lastRow)
        {
            int midRow = (firstRow + lastRow) / 2;
            if(matrix[midRow][0] <= v && matrix[midRow][column-1] >= v)
            {
                rowTosearched = midRow;
                break;
            } else if (v > matrix[midRow][column-1]) {
                firstRow = midRow + 1;
            }else
            {
                lastRow = midRow - 1;
            }
        }
        if(rowTosearched == -1)
        {
            System.out.println("Not Present");
            return;
        }
        int left = 0,right = column - 1;
        while (left <= right)
        {
            int mid = (left + right) / 2;
            if(matrix[rowTosearched][mid] == v)
            {
                System.out.println("Present");
                return;
            }
            else if(matrix[rowTosearched][mid] < v)
            {
                left = mid + 1;
            }else
            {
                right = mid - 1;
            }
        }
        System.out.println("Not Present");
    }
}
