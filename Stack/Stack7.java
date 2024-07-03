package Stack;

import java.util.Stack;

public class Stack7 {
    public static void main(String[] args) {
        // 7 - getMin in O(1) time from stack
        Stack<Integer> stack = new Stack<>();
        int min = Integer.MAX_VALUE;

        min = push(stack,10,min);
        min = push(stack,5,min);
        min = push(stack,15,min);
        min = push(stack,3,min);
        min = pop(stack,min);
        System.out.println(min);


    }
    public static int push(Stack<Integer> stack,int value,int min){
        if(stack.isEmpty()){
            min = value;
            stack.push(value);
        } else if (min > value) {
            stack.push(value * 2 - min);
            min = value;
        }
        return min;
    }
    public static int pop(Stack<Integer> stack, int min) {
        int prevVal = min * 2 - stack.peek();
        if (prevVal > min) {
            min = prevVal;
            stack.pop();
            return min;
        }
        return min;
    }
}
