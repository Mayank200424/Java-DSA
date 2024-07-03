package String;

import java.util.Arrays;

public class String13 {
    public static void main(String[] args) {
        // 13 - Merge two Strings of same length Alternatively

        String s1 = "ace";
        String s2 = "bdf";
        char[] ans = new char[s1.length() + s2.length()];
        int j=0,k=0,c=0;

        for(int i=0;i<ans.length;i++)
        {
            if(c % 2 == 0)
            {
                ans[i] = s1.charAt(j);
                j++;
            }
            else
            {
                ans[i] = s2.charAt(k);
                k++;
            }
            c++;
        }
        System.out.println(Arrays.toString(ans));
    }
}
