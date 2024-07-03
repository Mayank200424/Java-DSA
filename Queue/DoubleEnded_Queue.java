package Queue;

public class DoubleEnded_Queue {
    static int rear = -1;
    static int front = -1;

    public static void main(String[] args) {
        int[] queue = new int[5];

        insert_rear(queue,10);
        insert_rear(queue,20);
        insert_rear(queue,30);
        insert_front(queue,40);
        insert_front(queue,50);
        print(queue);
        System.out.println();
        delete_rear(queue);
        delete_rear(queue);
        delete_front(queue);
        print(queue);

    }
    public static void insert_rear(int[] queue,int value){
        if(rear == queue.length-1){
            System.out.println("Queue is Full");
            return;
        }
        rear++;
        queue[rear] = value;
    }
    public static void insert_front(int[] queue,int value){
        if(front == -1 && rear == queue.length-1){
            System.out.println("Queue is Full");
        } else if (front > -1) {
            queue[front] = value;
            front--;
        } else if (front == -1 && rear < queue.length-1) {
            rear++;
            for(int i=rear;i>0;i--){
                queue[i] = queue[i-1];
            }
            queue[front + 1] = value;
        }
    }
    public static void delete_front(int[] queue){
        if(front == rear){
            System.out.println("Queue is Empty");
            return;
        }
        front++;
        System.out.println(queue[front] + " is delete ");
        if(front == rear){
            front = -1;
            rear = -1;
        }
    }
    public static void delete_rear(int[] queue){
        if(front == rear){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println(queue[rear] + " is Delete ");
        rear--;
        if(front == rear){
            front = -1;
            rear = -1;
        }
    }
    public static void print(int[] queue){
        for(int i=front+1;i<=rear;i++){
            System.out.print(queue[i] + " ");
        }
    }
}
