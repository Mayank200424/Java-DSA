package Stack;

import java.util.Stack;

public class Stack13 {
    public static void main(String[] args) {
        // 13 - Postfix to Prefix Conversion

        String s1 = "ABC/-AK/L-*";
        System.out.println("Postfix To Prefix :"
                + PostfixToPrefix(s1));
    }
    public static String PostfixToPrefix(String str){
        Stack<String> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(isOperator(ch)){
                String value1 = stack.pop();
                String value2 = stack.pop();

                String temp = ch + value2 + value1;
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
