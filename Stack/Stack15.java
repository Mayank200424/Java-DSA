package Stack;

public class Stack15 {
    public static void main(String[] args) {
        // 15 - Implement two Stacks in an Array

        int[] stack = new int[5];
        int top1 = -1;
        int top2 = stack.length;

        top1 = push1(stack,top1,top2,10);
        top1 = push1(stack,top1,top2,20);
        top2 = push2(stack,top1,top2,50);
        top2 = push2(stack,top1,top2,40);
        top2 = push2(stack,top1,top2,60);
        print1(stack,top1);
        print2(stack,top2);
        System.out.println();
        top1 = pop1(stack,top1);
        print1(stack,top1);
        System.out.println();
        top2 = pop2(stack,top2);
        print2(stack,top2);
        System.out.println();
        System.out.println("Peek1 : " + peek1(stack,top1));
        System.out.println("Peek2 : " + peek2(stack,top2));
    }
    public static int push1(int[] stack,int top1,int top2,int value){
        if(top1 == top2-1){
            System.out.println("Stack is overflow");
            return top1;
        }
        top1++;
        stack[top1] = value;
        return top1;
    }
    public static int push2(int[] stack,int top1,int top2,int value){
        if(top1 == top2-1){
            System.out.println("Stack is overflow");
            return top2;
        }
        top2--;
        stack[top2] = value;
        return top2;
    }
    public static int pop1(int[] stack,int top1){
        if(top1 == -1){
            System.out.println("Stack is Empty");
            return top1;
        }
        System.out.println(stack[top1] + " is popped");
        top1--;
        return top1;
    }
    public static int pop2(int[] stack,int top2){
        if(top2 == stack.length){
            System.out.println("Stack is Empty");
            return top2;
        }
        System.out.println(stack[top2] + " is popped");
        top2++;
        return top2;
    }
    public static int peek1(int[] stack,int top1){
        return stack[top1];
    }
    public static int peek2(int[] stack,int top2){
        return stack[top2];
    }
    public static void print1(int[] stack,int top1){
        for(int i=0;i<=top1;i++){
            System.out.print(stack[i] + " ");
        }
    }
    public static void print2(int[] stack,int top2){
        for(int i=stack.length-1;i>=top2;i--){
            System.out.print(stack[i] + " ");
        }
    }
}
