package String;

public class String3 {
    public static void main(String[] args) {
        // 3 - Check if String Palindrome or not.

        String str = "madam";
        for(int i=0;i<str.length();i++)
        {
            if(isPalindrome(str) == true){
                System.out.println("String is Palindrome");
                return;
            }
        }
        System.out.println("String is Not Palindrome");
    }
    public static boolean isPalindrome(String s){
        int start = 0,end = s.length()-1;

        while (start <= end)
        {
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
