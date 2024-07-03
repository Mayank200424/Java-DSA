package Stack;

import java.util.Stack;

public class Stack6 {
    public static void main(String[] args) {

        // 6 - Delete middle element of a stack

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        for(int i=0;i<stack.size()/2;i++){
            stack1.push(stack.pop());
        }
        stack.pop();

        while (!stack1.empty()){
            stack.push(stack1.pop());
        }
        for(int i=0;i<stack.size();i++)
        {
            System.out.print(stack.get(i) + " ");
        }
    }
}
