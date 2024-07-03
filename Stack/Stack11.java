package Stack;

import java.util.Stack;

public class Stack11 {
    public static void main(String[] args) {
        // 11 - Postfix to Infix Conversion

        String str = "ab*c+";
        System.out.println("Postfix to Infix : " + PostfixToInfix(str));
    }
    public static String PostfixToInfix(String str){
        Stack<String> stack = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(isOperator(ch)){
                String value1 = stack.pop();
                String value2 = stack.pop();

                String temp = '(' + value2 + ch + value1 + ')';
                stack.push(temp);

            }else {
                stack.push(ch + "");
            }
        }
        return stack.pop();
    }
    public static boolean isOperator(char ch){
        if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^' || ch == '%'){
            return true;
        }
        return false;
    }
}
