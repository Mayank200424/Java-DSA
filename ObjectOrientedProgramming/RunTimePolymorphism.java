package ObjectOrientedProgramming;

import java.util.Scanner;

public class RunTimePolymorphism {
    public static void main(String[] args) {
        // Runtime Polymorphism

        Bank bank;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Choice : ");
        int choice = sc.nextInt();

        if(choice == 1)
        {
            bank = new SBI();
        }
        else
        {
            bank = new Kotak();
        }
        bank.InterestRate();

    }
}
class Bank{
    int accountNo;
    String customerName;
    int balance;

    public void InterestRate(){

        System.out.println(4);
    }
}
class SBI extends Bank{

}
class Kotak extends Bank{
   @Override
    public void InterestRate() {

       System.out.println(5);
    }
}