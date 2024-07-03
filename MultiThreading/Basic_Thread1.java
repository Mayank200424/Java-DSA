package MultiThreading;

public class Basic_Thread1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            PrintNumber p = new PrintNumber(i);
            p.start();
        }

    }
}
class PrintNumber extends Thread{
    // Using Thread class
    int i;

    public PrintNumber(int i){
        this.i = i;
    }
    @Override
    public void run() {
        System.out.print(i + " ");
    }
}
