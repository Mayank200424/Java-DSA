package String;

public class StringProgram2 {
    public static void main(String[] args) {
        // String array is equal or not.

        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        String sum = "";
        String sum1 = "";

        for(int i=0;i< word1.length;i++)
        {
            sum = sum + word1[i];
        }

        for(int i=0;i< word2.length;i++)
        {
            sum1 = sum1 + word2[i];
        }
        if(sum.equals(sum1))
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }
}
