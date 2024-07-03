package Stack;

import java.util.Stack;

public class Stack12 {
    public static void main(String[] args) {
        // 12 - Prefix to Postfix Conversion

        String s1 = "+/AB*CD";
        System.out.println("Postfix To Prefix :"
                + PostfixToPrefix(s1));
    }
    public static String PostfixToPrefix(String str){
        Stack<String> stack = new Stack<>();
        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            if(isOperator(ch)){
                String value1 = stack.pop();
                String value2 = stack.pop();

                String temp = value1 + value2 + ch;
                stack.push(temp);
            }
            else {
                stack.push(ch + "");
            }
        }
        return stack.peek();
    }
    public static boolean isOperator(char ch){
        if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^' || ch == '%'){
            return true;
        }
        return false;
    }

}
