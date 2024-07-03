package MultiThreading;

public class Program1 {
    int n = 10;
    static int count = 1;
    public static void main(String[] args) {
        Program1 program1 = new Program1();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                program1.PrintEven();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                program1.PrintOdd();
            }
        });
        t1.start();
        t2.start();
    }
    public void PrintOdd() {
        synchronized (this) {
            while (count < n) {
                while (count % 2 == 0) {
                    try {
                        wait();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                System.out.println(count + " " + Thread.currentThread().getName());
                count++;
                notify();
            }
        }
    }

    public void PrintEven(){
        synchronized (this) {
            while (count < n) {
                while (count % 2 != 0) {
                    try {
                        wait();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                System.out.println(count + " " + Thread.currentThread().getName());
                count++;
                notify();
            }

        }
    }
}
