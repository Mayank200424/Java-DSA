package Program;

public class prog20 {
    public static void main(String[] args) {
        int n=10,m=3,a=0,b=0,c;
        for(int i=1;i<=n;i++){
            if(i % m == 0){
                a = a + i;
            }
            else
            {
                b = b + i;
            }
        }
        System.out.println(a);
        System.out.println(b);
        c=b-a;
        System.out.println(c);
    }
}
