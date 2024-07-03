package HashSet;

import java.util.HashSet;

public class Basic_Hashset {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);
        hashSet.add(50);

        for(int i : hashSet){
            System.out.print(i + " ");
        }
    }
}
