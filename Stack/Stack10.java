package Stack;

import java.util.Stack;

public class Stack10 {
    public static void main(String[] args) {
        // 10 - Prefix to Infix Conversion

        String s1 = "+-a*bd/c^ef";
        System.out.println("Prefix To Infix : "
                + PrefixToInfix(s1));
    }
    public static String PrefixToInfix(String str)
    {
        Stack<String> stack = new Stack<>();

        for(int i = str.length()-1; i >= 0; i--)
        {
            char c = str.charAt(i);
            if (isOperator(c))
            {
                String op1 = stack.pop();
                String op2 = stack.pop();

                String temp = '('+ op1 + c + op2 + ')' ;
                stack.push(temp);
            }
            else
            {
                stack.push(c + "");
            }
        }
        return stack.peek();
    }
    public static boolean isOperator(char ch)
    {
        if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^' || ch == '%'){
            return true;
        }
        return false;
    }
}
