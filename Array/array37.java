package Array;

import java.util.Arrays;

public class array37 {
    public static void main(String[] args) {
       // Left rotate an array by d positions

        int[] array = {1,2,3,4,5,6,7};
        int d = 3;

        for (int i = 0; i < d; i++){
            int temp = array[0];
            for (int j = 0; j < array.length - 1; j++){
                array[j] = array[j+1];
            }
            array[array.length-1] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
