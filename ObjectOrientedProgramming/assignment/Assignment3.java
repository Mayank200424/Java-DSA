package ObjectOrientedProgramming.assignment;

public class Assignment3 {
    public static void main(String[] args) {
        Account1 account1 = new Account1();
       account1.setAccount(1021283924,"Mayank",10000);
       account1.displayAccountDetails();

    }
}
class Account1{
    int accountNumber,balance;
    String customerName;

    public void setAccount(int accountNumber,String customerName,int balance)
    {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    public int withdraw(int  amount){
       if(balance < amount)
       {
           System.out.println("InSufficence Balance");
       }
       else
       {
           return balance - amount;
       }
       return balance;
    }

    public int deposit(int amount)
    {
        return balance + amount;
    }

    public void  displayAccountDetails(){
        System.out.println("Deposit");
        System.out.println(accountNumber + " " + customerName + " " + deposit(1000));

        System.out.println("Withdraw");
        System.out.println(accountNumber + " " + customerName + " " + withdraw(deposit(2000)));
    }
}
