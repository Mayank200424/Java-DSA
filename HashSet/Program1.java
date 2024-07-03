package HashSet;

import java.util.HashSet;

public class Program1 {
    public static void main(String[] args) {
        // Print all distinct numbers in array

        int[] array = {1,2,3,3,4,5,6,6,7};
        HashSet<Integer> hashSet = new HashSet<>();

        for(int i = 0;i < array.length; i++){
            hashSet.add(array[i]);
        }
        System.out.println(hashSet);
    }
}
