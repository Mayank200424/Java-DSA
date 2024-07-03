package String;

public class String1 {
    public static void main(String[] args) {
        //  1 -  print a string in reverse order

        String s1 = "hello";

        for (int i = s1.length() - 1; i >= 0; i--) {
            System.out.print(s1.charAt(i));
        }
    }
}
