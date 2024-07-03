package Program;

public class prog2 {

    public static void main(String[] args)
    {
        int a = sum(10,20);
        int b = subtraction(30,10);
        int c = multipliaction(10,30);
        int d = division(10,5);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

     static int sum(int n1, int n2){
        int a = n1 + n2;
         return a;
     }

     static int subtraction(int n1,int n2){
        int b = n1 - n2;
        return b;
     }

     static int multipliaction(int n1,int n2){
        int c = n1 * n2;
        return c;
     }

     static int division(int n1,int n2){
        int d = n1/n2;
        return d;
     }
}
