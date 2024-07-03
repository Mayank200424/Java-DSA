package Queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Circular_Queue {
    static int[] queue = new int[5];
    static int front = -1;
    static int rear = -1;

    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        dequeue();
        dequeue();
        enqueue(40);
        System.out.println();
        print();
        System.out.println(size());

    }
    private static int size() {
        if(rear == -1){
            System.out.println("Queue is Empty");
            return 0;
        }
        return (rear - front) % queue.length + 1;
    }
    public static void dequeue(){
        if(rear == -1){
            System.out.print("Queue is Empty");
        } else if (rear == front) {
            rear = front = -1;
        } else {
            front = (front + 1) % queue.length;
        }
    }
    public static void enqueue(int value){
        if(rear == -1){
            front = rear = 0;
            queue[rear] = value;
        }else if((rear + 1) % queue.length == front){
            System.out.println("Queue is Full");
        }else {
            rear = (rear + 1) % queue.length;
            queue[rear] = value;
        }
    }
    public static void print(){
        int i = front;
        while (i != rear){
            System.out.print(queue[i] + " ");
            i = (i + 1) % queue.length;
        }
        System.out.print(queue[i] + " ");
    }


}
