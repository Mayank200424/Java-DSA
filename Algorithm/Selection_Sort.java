package Algorithm;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        // Selection Sort = O(N^2)
        int[] a = {7, 2, 1, 6, 8, 3, 4};
        int n = a.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
        }
        System.out.print(Arrays.toString(a));
    }
}
