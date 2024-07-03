package ObjectOrientedProgramming;

public class ComplieTimePolymorphism {
    public static void main(String[] args) {
        sum(10,20);
        sum(10,20,30);
        sum(1.0,2.0,3.0);

    }
    public static void sum(int a,int b){
        System.out.println(a+b);
    }
    // Method Overloading by changing no of Argument
    public static void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
    // Method Overloading by type of Argument
    public static void sum(double a,double b,double c){
        System.out.println(a+b+c);
    }

    // Method Overloading is not possible by changing return type
//    public static int sum(int a,int b){
//        System.out.println(a+b);
//        return 0;
//    }
}
