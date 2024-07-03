package ObjectOrientedProgramming;

public class Static {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount("123abc","Mayank",10000);
        SavingAccount savingAccount1 = new SavingAccount("456efg","Raj",12000);
        savingAccount.PrintWithName();
        savingAccount.DisplayDetails();
        SavingAccount.PrintGoodMorning();
    }
}
class SavingAccount{
    String accountNo;
    String name;

    double balance;
    static double irate;

    public void PrintWithName(){ // Normal Method - instance level Method

        System.out.println("Good Morning " + name);
    }

    public static void PrintGoodMorning(){ // Static Method - only call static method

        System.out.println("Good Morning " + irate);
    }

    public void DisplayDetails(){
        System.out.println(accountNo + "  " + name + "  " + balance);
    }

    static { // block to initialise static variable
        irate = 4.20;
    }

    public SavingAccount(String accountNo, String name, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
    }
}
