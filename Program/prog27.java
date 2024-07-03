package Program;

public class prog27 {
    public static void main(String[] args) {
        int n=8972,r,a=0,c=0;
        while (n > 0){
            r = n % 10;
            a = a + r;
            n = n / 10;
            c++;
        }
        System.out.println(a);
        System.out.println(c);
        int b = a / c;
        System.out.println(b);
    }
}
