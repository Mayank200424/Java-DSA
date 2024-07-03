package String;

public class BasicString {
    public static void main(String[] args) {
        // Creating String

        String s1 = "hello"; // creating string using string literal - > String Pool
        String s2 = "hello";

        String s3 = new String("hello"); // creating string using new keyword - > heap
        String s4 = new String("hello");

        System.out.println(s1 == s2); // cello comparison

        if(s1.equals(s2)) // deep comparison
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }
}
