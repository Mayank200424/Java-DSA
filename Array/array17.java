package Array;

public class array17 {
    public static void main(String[] args) {
       // Array Assignment
       // Given an integer array of length n and a number d.print all the elements from the array which are divisible by d.

       int[] a = {1,12,6,31,7,9,3,5,0};

       for(int i=0;i<a.length;i++)
       {
           if(a[i] % 3 ==0 && a[i] > 0)
           {
               System.out.print(a[i] + " ");
           }
       }
    }
}
