package String;

public class String14 {
    public static void main(String[] args) {
        // 14 - Check if all words are palindrome // madam oko niotin

        String s = "madam oko";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String str){
        String[] strs = str.split(" ");
        for (int i = 0; i < strs.length; i++) {

            int start = 0,end = strs[i].length()-1;
            while (start <= end)
            {
                if(strs[i].charAt(start) != strs[i].charAt(end))
                {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}
