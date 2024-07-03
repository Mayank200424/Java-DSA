package HashSet;

import java.util.HashSet;

public class Program2 {
    public static void main(String[] args) {
        // Print all unique numbers in array
        int[] array = {1,2,2,4,2,5,3,5,7};
        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        for (int j : array) {
            if (hashSet.contains(j)) {
                duplicate.add(j);
            } else {
                hashSet.add(j);
            }
        }
        for (int j : array) {
            if (!duplicate.contains(j)) {
                System.out.print(j + " ");
            }
        }
    }
}
