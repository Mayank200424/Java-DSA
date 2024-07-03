package String;

public class String5 {
    public static void main(String[] args) {
        // 5 - Program to check if two strings are same or not (without using inbuilt function.equals())

        String s1 = "hello";
        String s2 = "madam";

        boolean isSame = true;

        if (s1.length() != s2.length()){
            isSame = false;
            System.out.println(isSame);
            return;
        }

        for (int i = 0; i < s1.length(); i++){
            if (s1.charAt(i) != s2.charAt(i)){
                isSame = false;
                break;
            }
        }
        System.out.println(isSame);
    }
}
