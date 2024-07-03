package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Basic_Comparator {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(40);
        arrayList.add(10);
        arrayList.add(9);
        System.out.println(arrayList);
        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer n1, Integer n2) {
                String s1 = String.valueOf(n1) + String.valueOf(n2);
                String s2 = String.valueOf(n2) + String.valueOf(n1);

                if(Integer.parseInt(s1) > Integer.parseInt(s2)){
                    return -1;
                } else if (Integer.parseInt(s2) > Integer.parseInt(s1)) {
                    return 1;
                }
                return 0;
            }
        });
        System.out.println(arrayList);
    }
}
