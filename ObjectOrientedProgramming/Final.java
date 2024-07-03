package ObjectOrientedProgramming;

public class Final {
    public static void main(String[] args) {
        int a = 10;
        final int day = 7; // if variable is final you can't change
        System.out.println(day);
    }
}
//final class Bank{ // if class is final you can't extend
//    final public void printInterest(){ // if method is final you can't override
//        System.out.println(4);
//    }
//}
//class SBI extends Bank{ // error
//    public void printInterest(){ // if method is final you can't override
//        System.out.println(4);
//    }
//}
