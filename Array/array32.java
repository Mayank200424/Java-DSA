package Array;

public class array32 {
    public static void main(String[] args) {
        int[] a = {2,5,9,2,0,5,3,2};
        int n = a.length;
        for(int i=0;i<n;i++){
            int v = a[i],count=0;
            if(a[i] == -1)
            {
                continue;
            }
            for(int j=i+1;j<n;j++){
                if(v == a[j]){
                    count++;
                    a[j] = -1;
                }
            }
            if(count > 0)
            {
                System.out.print(v + " ");
            }
        }
    }
}
