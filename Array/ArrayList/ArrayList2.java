package Array.ArrayList;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(10);

        int odd = 0,even = 0;

        for (int i=0;i<arrayList.size();i++){
            if(arrayList.get(i) % 2 == 1)
            {
                odd++;
            }
            else
            {
                even++;
            }
        }
        System.out.println("Odd Number " + odd);
        System.out.println("Even Number " + even);



    }
}
