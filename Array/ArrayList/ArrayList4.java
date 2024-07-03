package Array.ArrayList;

import java.util.ArrayList;

public class ArrayList4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(9);
        arrayList.add(15);
        arrayList.add(27);
        arrayList.add(30);

        int start=0,end=arrayList.size()-1;
        int sum = 20;

        while (start <= end){
            if(arrayList.get(start) + arrayList.get(end) == sum)
            {
                System.out.println("Present");
                return;
            } else if (arrayList.get(start) + arrayList.get(end) < sum) {
                start++;
            }else{
                end--;
            }
        }
        System.out.println("Not Present");

    }
}
