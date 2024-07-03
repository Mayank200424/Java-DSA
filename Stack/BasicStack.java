package Stack;

public class BasicStack {
    public static void main(String[] args) {

        // 1 - Implement stack : push(), pop(), peek(), isEmpty(), size(), print()

        int[] stack = new int[5];
        int top = -1;

        System.out.println(isEmpty(top));
        top = push(stack, top, 10);
        top = push(stack, top, 20);
        top = push(stack, top, 30);
        top = push(stack, top, 40);
        top = push(stack, top, 50);
        print(stack, top);
        System.out.println();
        top = pop(stack, top);
        System.out.println(peek(stack, top));
        System.out.println(size(top));

    }

    public static int push(int[] stack, int top, int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack is Overflow!!");
            return top;
        }
        top++;
        stack[top] = value;
        return top;
    }

    public static int pop(int[] stack, int top) {
        if (top == -1) {
            System.out.println("Stack is  Empty!!");
            return top;
        }
        System.out.println(stack[top] + " is popped ");
        top--;
        return top;
    }

    public static int peek(int[] stack, int top) {
        return stack[top];
    }

    public static boolean isEmpty(int top){
        if(top == -1){
            return true;
        }
        return false;
    }
    public static int size(int top){
        return top+1;
    }

    public static void print(int[] stack, int top) {
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
    }
}
