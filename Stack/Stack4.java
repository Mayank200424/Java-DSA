package Stack;

import java.util.Stack;

public class Stack4 {
    public static void main(String[] args) {
        // 4 - Check if string is palindrome or not using stack

        String str = "madam";
        Stack<Character> stack1 = new Stack<>();

        for(int i=0;i<str.length();i++){
            stack1.push(str.charAt(i));
        }

        String output = "";
        for(int i = 0; i < str.length(); i++){
            output = output + stack1.pop();
        }

        if(str.equals(output)){
            System.out.println("String is Palindrome");
        }
        else
        {
            System.out.println("String is not Palindrome");
        }
    }
}
