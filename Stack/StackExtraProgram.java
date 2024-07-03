package Stack;

import java.util.Arrays;
import java.util.Stack;

public class StackExtraProgram {
    public static void main(String[] args) {
        int[] array = {1,2,1};

        Stack<Integer> stack = new Stack<>();

        for (int i = array.length - 1; i >= 0 ; i--) {
            stack.push(array[i]);
        }

        for (int i = array.length - 1; i >= 0; i--) {
            int number = array[i];
            while (!stack.isEmpty() && stack.peek() <= array[i]) {
                stack.pop();
            }
            if (stack.isEmpty()){
                array[i] = -1;
            } else {
                array[i] = stack.peek();
            }

            stack.push(number);
        }

        System.out.println(Arrays.toString(array));
    }
}
