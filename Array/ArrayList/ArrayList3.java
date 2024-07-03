package Array.ArrayList;

import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(60);

        int max=0;

        for(int i=0;i<arrayList.size();i++){
            if(arrayList.get(i) > max)
            {
                max = arrayList.get(i);
            }
        }
        System.out.println(max);
    }
}