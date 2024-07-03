package Stack;

import java.util.Stack;

public class Stack8 {
    public static void main(String[] args) {
        // 8 - getMin() in O(1) time and O(1) extra space
        Stack<Integer> manstack = new Stack<>();
        Stack<Integer> minstack = new Stack<>();

        push(manstack,minstack,10);
        System.out.println(getMinValue(minstack));
        push(manstack,minstack,8);
        System.out.println(getMinValue(minstack));
        push(manstack,minstack,20);
        System.out.println(getMinValue(minstack));
        push(manstack,minstack,7);
        System.out.println(getMinValue(minstack));
        pop(manstack,minstack);
        push(manstack,minstack,5);
        System.out.println(getMinValue(minstack));


    }
    public static void pop(Stack<Integer> manstack,Stack<Integer> minstack){
        int temp = manstack.pop();
        if(temp == minstack.peek()){
            minstack.pop();
        }
    }
    public static void push(Stack<Integer> manstack,Stack<Integer> minstack,int value){
        manstack.push(value);
        if (minstack.isEmpty() || value <= minstack.peek()){
            minstack.push(value);
        }
    }
    public static int getMinValue(Stack<Integer> minstack){
        if(minstack.isEmpty()){
            return -1;
        }
        return minstack.peek();
    }
}
