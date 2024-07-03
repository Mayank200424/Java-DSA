package ObjectOrientedProgramming;

public class Interface {
}
interface Bank2{ // 100% Abstraction -- all method are by default abstract and public
    static final int day = 7;
    void printInterest(); // after java 7,since java 8;
    static void PrintHello(){
        // interface can have static method with body
        System.out.println("Hello");
    }
    default void PrintGoodMorning(){
        // interface can have default method with body
        System.out.println("Good Morning");
    }
}
class BOB implements Bank2{
    public void printInterest(){
        // implementing abstract method of interface Bank2
        System.out.println(4);
    }
}