package Array;

public class array22 {
    public static void main(String[] args) {
        // Array Assignment
        // Given an integer array.Check if elements is in increasing order.

        int[] a1 = {1, 2, 6, 3};
        int c = a1[0];

        for (int i = 1; i < a1.length; i++) {
            if (c < a1[i]) {
                c = a1[i];
            }
            else {
                System.out.println("Not in incrementing order");
                return;
            }
        }
        System.out.println("Incrementing order");
    }
}
