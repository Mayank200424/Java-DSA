package Program;

public class prog21 {
    public static void main(String[] args) {
        int n = 234,r,a=1,b=0,c;
        while (n > 0){
            r = n % 10;
            a = a * r;
            b = b + r;
            n = n / 10;
        }
        System.out.println(a);
        System.out.println(b);
        c= a-b;
        System.out.println(c);
    }
}
