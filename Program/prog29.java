package Program;

public class prog29 {
    public static void main(String[] args) {
        int n=153,rev=0,r,m;
        m=n;
        while (n > 0){
            r = n % 10;
            rev = rev + (r * r * r);
            n = n / 10;
        }
        if(rev == m){
            System.out.println("Number is Armstrong");
        }
        else {
            System.out.println("Number is not Armstrong");
        }
    }
}
