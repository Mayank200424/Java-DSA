package Queue;

import java.util.*;

public class Queue3 {
    static Queue<Integer> queue1 = new LinkedList<>();
    static Queue<Integer> queue2 = new LinkedList<>();
    public static void main(String[] args) {
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insert(50);
        remove();
        System.out.println(queue1);

    }
    public static void insert(int value){
        queue1.add(value);
    }

    public static void remove(){
        int size = queue1.size();
        for (int i = 0; i < size - 1; i++) {
            queue2.add(queue1.poll());
        }
        queue1 = queue2;
        queue2 = new LinkedList<>();
    }
}