package Array;

import java.util.Arrays;

public class array36 {
    public static void main(String[] args) {
        // Pair with sum present or not in sorted array .
        int[] array = {1,2,9,15,27,30};
        int sum = 39;
        int start = 0,end = array.length - 1;

        while (start <= end)
        {
            if(array[start] + array[end] == sum)
            {
                System.out.print("present");
                return;
            }else if(array[start] + array[end] < sum)
            {
                start++;
            }
            else
            {
                end--;
            }
        }
        System.out.println("Not Present");
    }
}
