package String;

public class String11 {
    public static void main(String[] args) {
        // 11 - find duplicate chars from string

        String s1 = "hello world good";
        int[] array = new int[128];

        for(int i=0;i<s1.length();i++)
        {
            int temp = s1.charAt(i);
            array[temp]++;
        }
        for(int i=0;i<array.length;i++)
        {
            if(array[i] > 1)
            {
                System.out.print((char)i + " ");
            }
        }
    }
}
