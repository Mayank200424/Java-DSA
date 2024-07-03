package Leetcode;

import java.util.Arrays;

public class Leetcode7 {
    public static void main(String[] args) {
        //2652
        int n = 7,a=0;

        for(int i=1;i<=n;i++)
        {
            if(i % 3 == 0 || i % 5 == 0 || i % 7 == 0)
            {
                a = a + i;
            }
        }
        System.out.println(a);

    }
}
