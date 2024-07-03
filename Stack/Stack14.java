package Stack;

import java.util.Stack;

public class Stack14 {
    public static void main(String[] args) {
        // 14 - Remove All Adjacent Duplicates In String - Input: “abbaca” output: “ca”
        String str = "abbaca";
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!stack.isEmpty() && stack.peek() == ch){
                stack.pop();
            }
            else
            {
                stack.push(ch);
            }
        }
        String output = "";
        while (!stack.isEmpty()){
            output = output + stack.pop();
        }
        for(int i=output.length()-1;i>=0;i--){
            System.out.print(output.charAt(i));
        }
//        StringBuilder sb = new StringBuilder("");
//        while (!stack.isEmpty()) {
//            sb.append(stack.pop());
//        }
//        System.out.print(sb.reverse());
    }
}
