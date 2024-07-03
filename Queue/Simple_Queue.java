package Queue;

public class Simple_Queue {
    static int front = -1,rear = -1;
    public static void main(String[] args) {
        int[] queue = new int[5];

        enqueue(queue,10);
        enqueue(queue,20);
        enqueue(queue,30);
        print(queue);
        System.out.println();
        dequeue(queue);
        dequeue(queue);
        dequeue(queue);
        System.out.println();
        enqueue(queue,100);
        print(queue);
        size();

    }
    public static void size(){
        System.out.println("Size " + (rear - front));
    }
    public static void dequeue(int[] queue){
        if(front == rear){
            System.out.println("Queue is Empty");
        }
        front++;
        System.out.print(queue[front] + " is removed ");
        if(rear == front){
            front = -1;
            rear = -1;
        }
    }
    public static void enqueue(int[] queue,int value){
        if(rear == queue.length-1){
            System.out.println("Queue is Full");
            return;
        }
        rear++;
        queue[rear] = value;

    }
    public static void print(int[] queue){
        for(int i=front+1;i<=rear;i++){
            System.out.print(queue[i] + " ");
        }
    }
}
