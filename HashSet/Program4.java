package HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Program4 {
    public static void main(String[] args) {
        // Count frequency of each number in array
        int[] array = {1,2,4,2,3,1,5,7,4,7,3};
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i : array){
            if(hashMap.containsKey(i)){
                int fre = hashMap.get(i);
                hashMap.put(i,fre + 1);
            }else {
                hashMap.put(i,1);
            }
        }
        for(Map.Entry me : hashMap.entrySet()){
            System.out.println(me.getKey() + "  " + me.getValue());
        }
    }
}
