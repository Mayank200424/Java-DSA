package Array;
public class array3 {
    public static void main(String[] args) {
        //Print array in reverse order
        int[] a = {1, 2, 3, 4, 5};
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}
