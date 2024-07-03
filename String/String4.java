package String;

public class String4 {
    public static void main(String[] args) {
        // 4 - count number of words in a String (with / without split function)
        // Without split Function
        String s1 = "hello word";
        s1 = s1.trim();
        int count = 1;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println(count);

        // With split Function
        String s = "hello word";
        String[] str = s.split(" ");
        int c = 0;

        for (int i = 0; i < str.length; i++) {
           c++;
        }
        System.out.println(c);
    }
}
