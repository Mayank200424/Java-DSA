package HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Program3 {
    public static void main(String[] args) {
        //  Find whether an array is subset of another array

        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,3,4};

        HashSet<Integer> hashSet = new HashSet<>();

        for(int i : array1){
            hashSet.add(i);
        }

        for (int j : array2){
            if(!hashSet.contains(j)){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
