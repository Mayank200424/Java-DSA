package String;

import java.util.Arrays;

public class String6 {
    public static void main(String[] args) {
        // 6 - Update a character in a string (without using .replace() function)

        String s1 = "hello";
        Update(s1,'h','c');

    }
    public static void  Update(String s, char oldCh, char newCh)
    {
        char[] ch = s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == oldCh)
            {
                ch[i] = newCh;
            }
            else
            {
                ch[i] = s.charAt(i);
            }
        }
        System.out.println(new String(ch));
    }

}
