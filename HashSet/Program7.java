package HashSet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Program7 {
    public static void main(String[] args) {
        // Check if two arrays are equal or not

        int[] array1 = {1,2,5,6,7,9,3,7};
        int[] array2 = {1,2,5,6,7,9,3,7};


        HashMap<Integer,Integer> hashMap = new HashMap<>();
        HashMap<Integer,Integer> hashMap1 = new HashMap<>();

        for(int i : array1){
            if(hashMap.containsKey(i)){
                int freq = hashMap.get(i);
                hashMap.put(i,freq + 1);
            }else{
                hashMap.put(i,1);
            }
        }
        for(int j : array2){
            if(hashMap1.containsKey(j)){
                int freq = hashMap1.get(j);
                hashMap1.put(j,freq + 1);
            }else{
                hashMap1.put(j,1);
            }
        }

//        for(int i : array1){
//            if(hashMap.containsKey(i)){
//                int freq = hashMap.get(i);
//                hashMap.put(i,freq + 1);
//            }else {
//                hashMap.put(i,1);
//            }
//        }
//        for(int j : array2){
//            if(hashMap1.containsKey(j)){
//                int freq = hashMap1.get(j);
//                hashMap1.put(j,freq + 1);
//            }else {
//                hashMap1.put(j,1);
//            }
//        }
//        System.out.println(hashMap.equals(hashMap1));
        for (Map.Entry<Integer,Integer> me : hashMap.entrySet()){
            Integer key = me.getKey();
            Integer value = me.getValue();

            if(!hashMap1.containsKey(key)){
                System.out.println("False");
                return;
            }
            if(!value.equals(hashMap1.get(key))){
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
}
