package Program;

public class prog33 {
    public static void main(String[] args) {
        int n=5,a=1,def=1;
        while (n > 0)
        {
            System.out.println(a);
            a = a + def;
            def++;
            n--;
        }
    }
}
