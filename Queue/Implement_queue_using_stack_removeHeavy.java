package Queue;

import java.util.Stack;

public class Implement_queue_using_stack_removeHeavy {
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();
    public static void main(String[] args) {
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insert(50);
        removeHeavy();

        System.out.println(stack1);
    }
    public static void insert(int value){
        stack1.push(value);
    }

    public static void removeHeavy(){
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack2.pop();
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }
}
