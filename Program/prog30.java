package Program;

public class prog30 {
    public static void main(String[] args) {
        int num = 110000;
        System.out.println(isBinary(num));
    }
    public static boolean isBinary(int n){
        while (n > 0){
            int r = n % 10;
            if (r > 1){
                return false;
            }
            n = n / 10;
        }
        return true;
    }
}
