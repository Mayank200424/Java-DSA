package String;

public class String9 {
    public static void main(String[] args) {
        // 9 - Remove Vowels from a String

        String s1 = "hello";
        char[] chars = s1.toCharArray();
        String rev = "";

        for(int i=0; i < s1.length();i++)
        {
            if(chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u' || chars[i] == 'A' || chars[i] == 'E' || chars[i] == 'I' || chars[i] == 'O' || chars[i] == 'U')
            {

            }
            else
            {
                rev = rev + s1.charAt(i);
            }
        }
        System.out.println(rev);

    }
}
