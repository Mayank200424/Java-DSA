package Recursion;

public class Recursion1 {
    public static void main(String[] args) {
        // Infinite recursive function
        printHello();
    }
    public static void printHello(){
        System.out.println("Hello");
        printHello();
    }
}
