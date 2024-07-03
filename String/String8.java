package String;

public class String8 {
    public static void main(String[] args) {
        // 8 - Print frequency of all the characters in string

        String s1 = "hello";
        int[] arr = new int[128];

        for(int i=0;i<s1.length();i++)
        {
            int asciiValue = s1.charAt(i);
            arr[asciiValue]++;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > 0)
            {
                System.out.println((char)i + "  " + arr[i]);
            }
        }
    }
}
