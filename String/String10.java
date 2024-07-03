package String;

public class String10 {
    public static void main(String[] args) {
        // 10 - Reverse Words internally in a String // eg. good evening -> doog gnineve

        String s1 = "good evening";
        String[] str = s1.split(" ");
        String s = "";

        for(int i=0;i<str.length;i++)
        {
            char[] ch = str[i].toCharArray();
            int start = 0,end = ch.length-1;
            while (start <= end)
            {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
            s = s + new String(ch) + " ";
        }
        System.out.println(s);
    }
}
