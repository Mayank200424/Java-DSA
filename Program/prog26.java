package Program;

public class prog26 {
    public static void main(String[] args) {
        //11,49,52
       int s=42592,m,h;
       m = s / 60;
       s = s % 60;
       h = m / 60;
       m = m % 60;


        System.out.println(h + " " + m + " " + s);
    }
}
