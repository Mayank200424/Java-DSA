package String;

import java.util.Arrays;

public class String2 {
    public static void main(String[] args) {
        // 2 - Reverse a String
        String s1 = "hello";
        String ans = "";
        char[] chars = s1.toCharArray();
        int start=0,end=s1.length()-1;

        while (start <= end)
        {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        ans = ans + new String(chars);
        System.out.println(ans);
    }
}
