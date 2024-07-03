package Algorithm;

public class Kadanes {
    public static void main(String[] args) {
        int[] array = {1, -2, 1, 4, -6, 5, 0};
        int maxSum = 0, currentSum = 0;

        for (int i = 0; i < array.length; i++) {
            currentSum = currentSum + array[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        System.out.println(currentSum);
    }
}
