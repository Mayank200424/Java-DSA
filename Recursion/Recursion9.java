package Recursion;

public class Recursion9 {
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        // get the largest element of an array using recursion
        int[] array = {10, 20, 70, 60, 50};
        int i = 0;

        System.out.println(getLargestElement(array,i));
    }
    public static int getLargestElement(int[] array,int i){
        if(i == array.length){
            return max;
        }
        if(max < array[i]){
            max = array[i];
        }
        return getLargestElement(array,i+1);
    }
}
