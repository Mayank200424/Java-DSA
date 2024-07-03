package ObjectOrientedProgramming.assignment;

public class Assignment2 {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountDetails(1032567182,"Mayank",10000,5);
        account.displayAccountDetails();
    }
}
class Account{
    int accountNo;
    String customerName;
    int balance;
    int interestRate;

    public void setAccountDetails(int accountNo,String customerName,int balance,int interestRate)
    {
        this.accountNo = accountNo;
        this.customerName = customerName;
        this.balance = balance;
        this.interestRate = interestRate;
    }
    public int calculateInterest()
    {
        int totalBalance = balance * interestRate / 100;
        return totalBalance + balance;
    }
    public void displayAccountDetails(){
        System.out.println(accountNo + "   " + customerName + "   " + calculateInterest());
    }

}