package String;

public class String15 {
    public static void main(String[] args) {
        // 15 - Check if string have equal digits and chars

        String s1 = "abc123";
        String character = "";
        String digits = "";

        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i) >= 65 && s1.charAt(i) <= 90 || s1.charAt(i) >= 97 && s1.charAt(i) <= 122)
            {
                character = character + s1.charAt(i);
            }
        }
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i) >= 48 && s1.charAt(i) <= 57)
            {
                digits = digits + s1.charAt(i);
            }
        }
        if(character.length() == digits.length())
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }

    }
}
