package Function;

public class Assignment2 {
    public static void main(String[] args) {
        int[] a = {1,3,7,11,14,16,20};
        int n = a.length-1;
        int start = 0 , end = n;
        int sum=19;

        while (start <= end) {
            if (a[start] + a[end] == sum) {
                System.out.print("present");
                return;
            } else if (a[start] + a[end] < sum){
                start++;
            } else
            {
                end--;
            }
        }
        System.out.println("Not Present");
    }
}