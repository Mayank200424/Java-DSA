package HashSet;

import java.util.HashSet;

public class Program5 {
    public static void main(String[] args) {
        // Check if pair with given Sum exists in unsorted Array - O(N)

        int[] array = {1,2,5,4,3,6,9,8,7};
        int sum = 10;

        HashSet<Integer> hashSet = new HashSet<>();

        for(int i=0;i< array.length;i++){
            int find = sum - array[i];
            if(hashSet.contains(find)){
                System.out.println("Present");
                return;
            }else {
                hashSet.add(array[i]);
            }
        }
        System.out.println("Not Present");
    }
}
