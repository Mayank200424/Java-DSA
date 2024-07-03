package String;

public class String16 {
    public static void main(String[] args) {
        // 16 - Remove duplicate chars from string

        String s1 = "mayank";

        for(int i=0;i<s1.length();i++)
        {
            int c = 0;
            for(int j=0;j<s1.length();j++)
            {
                if(s1.charAt(i) == s1.charAt(j))
                {
                    c++;
                }
            }
            if(c < 2)
            {
                System.out.println(s1.charAt(i));
            }
        }
    }
}
