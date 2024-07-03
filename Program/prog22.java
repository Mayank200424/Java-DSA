package Program;

public class prog22 {
    public static void main(String[] args) {
        int n=14,c=0;
        while (n > 0){
           if(n % 2 == 0){
               n = n /2;
           }
           else
           {
               n = n - 1;
           }
           c++;
        }
        System.out.println(c);
    }
}
