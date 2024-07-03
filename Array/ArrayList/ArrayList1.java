package Array.ArrayList;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(70);
        arrayList.add(60);

        // For Each Loop
//        for(int ele : arrayList){
//            System.out.print(ele + " ");
//        }

        //Find Method
        System.out.println(arrayList.contains(20));

        //set method(update)
      //  arrayList.set(1,30);

        //removeall method(All element delete)
      //  arrayList.removeAll(arrayList);

        //remove method(only one element delete)
      // arrayList.remove(2);

        // Sort Arraylist
       // Collections.sort(arrayList);

        for(int i=0; i<arrayList.size();i++){
            System.out.print(arrayList.get(i) + " ");
        }
    }
}
