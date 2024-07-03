package Stack;

public class Stack3 {
    public static void main(String[] args) {
        // 3 - Reverse individual words using stack - print only (ex. how are you -> woh era uoy)
        String s1 = "how are you";
        reversWord(s1);

    }
    public static int push(char[] stack,int top,char Value){
        if(top == stack.length-1)
        {
            System.out.println("Stack is overflow!");
            return top;
        }
        top++;
        stack[top] = Value;
        return top;
    }
    public static void reversWord(String str){
        int top = -1;
        char[] stack = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                while (!isEmpty(top)) {
                    top = pop(stack, top);
                }
                System.out.print(" "); // print space between words
            } else {
                top = push(stack, top, str.charAt(i));
            }
        }

        // Print the remaining characters in the stack
        while (!isEmpty(top)) {
            top = pop(stack, top);
        }
    }
    public static int pop(char[] stack,int top){
        if(top == -1)
        {
            System.out.println("stack is empty!");
            return top;
        }
        System.out.print(stack[top] + "");
        top--;
        return top;
    }
    public static boolean isEmpty(int top){
        if(top == -1){
            return true;
        }
        return false;
    }
}
