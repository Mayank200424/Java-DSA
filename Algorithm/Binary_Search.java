package Algorithm;

public class Binary_Search {
    public static void main(String[] args) {
        // Binary Search Algorithm
        int[] a = {-8,-5, -1, 0, 1, 4, 9};
        int v = -8;
        int start = 0,end = a.length - 1;

        while (start <= end)
        {
            int mid = (start + end)/2;
            if(a[mid] == v)
            {
                System.out.println("Present");
                return;
            } else if (a[mid] < v) {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        System.out.println("Not Present");
    }
}
