package ObjectOrientedProgramming;

public class Abstraction {
    public static void main(String[] args) {
     //   Bank bank = new Banka(); // you can't create object of abstract class
    }
}
abstract class Banka{ // 0 to 100 % abstraction
    int accNo;
    String customerName;
    public void printHello(){
        System.out.println("Hello");
    }
    abstract public void printInterest();
}
class SBI1 extends Bank{
    public void printInterest(){   // implementation of abstract method of parent class
        System.out.println(4);
    }
}
