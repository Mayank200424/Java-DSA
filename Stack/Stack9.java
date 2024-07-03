package Stack;

import java.util.Stack;

public class Stack9 {
    public static void main(String[] args) {
        // 9 - Check for Balanced parentheses in an expression

        String str = "({[{}]})";

        System.out.println(isParenthesisMatching(str));
    }
    public static boolean isParenthesisMatching(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(isOpening(ch)){
                stack.push(s.charAt(i));
            }else {
                if(stack.isEmpty()){
                    return false;
                } else if (!isMatching(stack.peek(),ch)) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return true;
    }
    public static boolean isOpening(char ch){
        if(ch == '(' || ch == '{' || ch == '['){
            return true;
        }
        return false;
    }
    public static boolean isMatching(char a,char b){
        if((a == '{' && b == '}') || (a == '[' && b == ']') || (a == '(' && b == ')')){
            return true;
        }
        return false;
    }
}
