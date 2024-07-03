package String;

public class String12 {
    public static void main(String[] args) {
        // 12 - remove All Digits

        String s1 = "abc123";
        String output = "";

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) >= 65 && s1.charAt(i) <= 90 || s1.charAt(i) >= 97 && s1.charAt(i) <= 122) {
                output = output + s1.charAt(i);
            }
        }
        System.out.println(output);

    }
}
