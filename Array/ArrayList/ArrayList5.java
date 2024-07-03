package Array.ArrayList;

import java.util.ArrayList;

public class ArrayList5 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        arrayList1.add(6);
        arrayList1.add(7);
        arrayList1.add(8);
        arrayList1.add(9);
        arrayList1.add(10);

        ArrayList<Integer> arraylist2 = new ArrayList<>();

        for(int i=0;i<arrayList.size();i++)
        {
            arraylist2.add(arrayList.get(i));
        }
        for(int i=0;i<arrayList1.size();i++)
        {
            arraylist2.add(arrayList1.get(i));
        }
        System.out.println(arraylist2);
    }
}
