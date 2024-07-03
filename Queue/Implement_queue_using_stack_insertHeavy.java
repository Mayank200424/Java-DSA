package Queue;

import java.util.Stack;

public class Implement_queue_using_stack_insertHeavy {
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    public static void main(String[] args) {
        insertHeavy(10);
        insertHeavy(20);
        insertHeavy(30);
        insertHeavy(40);
        insertHeavy(50);
        remove();
        System.out.println(stack1);

    }

    public static void insertHeavy(int value) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(value);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public static void remove() {
        stack1.pop();
    }
}
