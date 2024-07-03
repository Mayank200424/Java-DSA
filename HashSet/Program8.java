package HashSet;

import java.util.HashSet;

public class Program8 {
    public static void main(String[] args) {
        // Print all duplicate numbers in array

        int[] array = {1,2,2,4,2,5,3,5,7};

        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        for(int i = 0;i < array.length;i++){
            if(hashSet.contains(array[i])){
                duplicate.add(array[i]);
            }else {
                hashSet.add(array[i]);
            }
        }
//        for (int j : array) {
//            if (duplicate.contains(j)) {
//                System.out.print(j + " ");
//            }
//        }
        System.out.print(duplicate);
    }
}
