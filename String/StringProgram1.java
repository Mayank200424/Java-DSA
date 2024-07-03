package String;

public class StringProgram1 {
    public static void main(String[] args) {
        // count max word in string array

         String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
         int max = Integer.MIN_VALUE;

         for(int i=0;i<sentences.length;i++)
         {
             String[] array = sentences[i].split(" ");
             int count = 0;
             for(int j=0;j<array.length;j++)
             {
                 count++;
             }
             if(max < count)
             {
                 max = count;
             }
         }
         System.out.println(max);
    }
}
