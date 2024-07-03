package Array;

public class array9 {
    public static void main(String[] args) {
        // Print alternate elements from last in array
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = a.length - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
