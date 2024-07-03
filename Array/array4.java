package Array;
public class array4 {
    public static void main(String[] args) {
        // Find average of all the element of array
        int[] a = {1, 2, 3, 4, 5};
        int sum = 0, avg = 0;

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
            avg = sum / a.length;
        }
        System.out.println(avg);
    }
}
