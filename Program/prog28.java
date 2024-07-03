package Program;

public class prog28 {
    public static void main(String[] args) {
        int left=11,right=20;
        for(int i=left;i<=right;i++){
            if(PrimeNot(i) == true){
                System.out.print(" " + i);
            }
        }
    }
    static boolean PrimeNot(int n){
        for (int i=2;i<n;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
