package Array;

public class array26 {
    public static void main(String[] args) {
        // Check if given number is unique or not
        int[] a = {1, 2, 3, 4, 3, 5};
        int d = 1;
        int c = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == d) {
                c++;
            }
        }
        if (c == 1) {
            System.out.println("Number is Unique");
        } else {
            System.out.println("Number is not Unique");
        }
    }
}
