package Recursion;

public class Recursion4 {
    public static void main(String[] args) {
        // Print the array elements without using loop
        int[] array = {1, 2, 3, 4, 5};
        printArray(array,0);
    }

    public static void printArray(int[] array,int i){
        if(i == array.length){
            return;
        }
        System.out.print(array[i] + " ");
        printArray(array,i+1);
    }
}
