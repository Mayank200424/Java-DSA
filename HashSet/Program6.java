package HashSet;

import java.util.HashMap;
import java.util.Map;

public class Program6 {
    public static void main(String[] args) {
        // Most frequent element in an array

        int[] array = {1,2,3,1,5,4,1,4,3};
        int mostfreq = 0;
        int mostvalue = 0;
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i : array){
            if(hashMap.containsKey(i)){
                int fre = hashMap.get(i);
                hashMap.put(i,fre + 1);
            }else {
                hashMap.put(i,1);
            }
        }
        for(Map.Entry<Integer,Integer> me : hashMap.entrySet()){
            if(mostvalue < me.getValue()){
                mostfreq = me.getKey();
                mostvalue = me.getValue();
            }
        }
        System.out.println(mostfreq);
    }
}
