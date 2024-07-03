package Program;

public class prog23 {
    public static void main(String[] args) {
        int left=1,right=22;
        for(int i = left; i <= right; i++){
             int ans = selfdevinding(i);
             if(ans == 1){
                 System.out.print(" "+i);
             }
        }
    }
    static int selfdevinding(int n) {
        int m = n;
        while (n > 0) {
            int r = n % 10;
            if (r == 0 || m % r != 0) {
                return 0;
            }
            n = n / 10;
        }
        return 1;
    }
}

