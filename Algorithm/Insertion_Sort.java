package Algorithm;

import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] array = {7, 2, 1, 6, 8, 3, 4};

        for (int i = 1; i < array.length; i++){
            int j = i - 1;
            int temp = array[i];
            while (j >= 0 && array[j] > temp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
