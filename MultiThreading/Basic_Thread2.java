package MultiThreading;

public class Basic_Thread2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            student s1 = new student(i);
            Thread t1 = new Thread(s1);
            t1.start();
        }
    }
}
class student implements Runnable{
    // Using implements Runnable
    int rno;

    public student(int rno){
        this.rno = rno;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread());
        System.out.println("Running : " + rno);
    }
}
