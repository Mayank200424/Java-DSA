package Program;

public class prog3 {
    public static void main(String[] args){
        int Balance = 1000;
        int a = deposit(Balance,2000);
        int c = Balance(Balance);
        int b = withdro(Balance,500);

        System.out.println(a);
        System.out.println(c);
        System.out.println(b);

    }
    static int deposit(int Balance,int amount){
        return Balance + amount;
    }

    static int withdro(int Balance,int amount){
        return Balance - amount;
    }

    static int Balance(int Balance){
        int b = Balance;
        return b;
    }
}
