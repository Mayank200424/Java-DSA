package Stack;

public class Stack2 {
    public static void main(String[] args) {
        // 2 - Reverse a String using Stack

        String str = "hello world";
        char[] ch = new char[str.length()];
        int top = -1;

        for(int i=0;i<str.length();i++){
            top = push(ch,top,str.charAt(i));
        }
        while (!isEmpty(top)){
            top = pop(ch,top);
        }
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

    public static boolean isEmpty(int top) {
        if (top == -1) {
            return true;
        }
        return false;
    }
}
