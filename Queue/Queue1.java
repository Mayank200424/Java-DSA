package Queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queue1 {
    public static void main(String[] args) {
        // 1 - Reverse the first K elements of a Queue

        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> ans = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        int k = 3;

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);

        for(int i=0;i<k;i++){
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()){
            ans.add(stack.pop());
        }
        while (!queue.isEmpty()){
            ans.add(queue.poll());
        }
        System.out.println(ans);

//        Deque<Integer> queue = new LinkedList<>();
//
//        int k = 3;
//        queue.add(10);
//        queue.add(20);
//        queue.add(30);
//        queue.add(40);
//        queue.add(50);
//        queue.add(60);
//
//
//        int[] array = new int[k];
//        for(int i=0;i<k;i++){
//            array[i] = queue.pollFirst();
//        }
//        for(int i=0;i<k;i++){
//            queue.addFirst(array[i]);
//        }
//        while (!queue.isEmpty()){
//            System.out.print(queue.poll() + " ");
//        }
    }
}
