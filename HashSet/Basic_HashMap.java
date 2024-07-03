package HashSet;

import java.util.HashMap;
import java.util.Map;

public class Basic_HashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"ABC");
        hashMap.put(2,"XYZ");
        hashMap.put(3,"ABC");
        hashMap.put(3,"PQR");

        for(Map.Entry me  : hashMap.entrySet()){
            System.out.println(me.getKey() + " " + me.getValue());
        }
    }
}
