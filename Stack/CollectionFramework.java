package Stack;

import java.util.Stack;

public class CollectionFramework {
    public static void main(String[] args) {
        // 5 - Stack using collection framework

        Stack<Integer> stack = new Stack<>();

        System.out.println(stack.empty());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.pop();
        System.out.println(stack.size());
        System.out.println(stack.peek());


        for(int i = stack.size()-1;i>=0;i--){
            System.out.print(stack.get(i) + " ");
        }
    }
}
