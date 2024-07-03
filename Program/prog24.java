package Program;

public class prog24 {
    public static void main(String[] args) {
        int a = 0, b = 1;
        for (int i = 1; i <= 5; i++) {
            System.out.print(a);
            int n = a + b;
            a = b;
            b = n;

        }
    }
}
