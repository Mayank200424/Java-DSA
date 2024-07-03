package String;

import java.util.Arrays;

public class String7 {
    public static void main(String[] args) {
        // 7 - Sort string of characters

        String s1 = "fedcba";
        char[] chars = s1.toCharArray();

        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = 0; j < chars.length - i - 1; j++) {
                if(chars[j] > chars[j+1])
                {
                    char temp = chars[j];
                    chars[j] = chars[j+1];
                    chars[j+1] = temp;
                }
            }
        }
        System.out.println(new String(chars));
    }
}
