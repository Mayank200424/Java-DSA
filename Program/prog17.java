package Program;

public class prog17 {
    public static void main(String[] args) {
        int n=5;


        for(int i=2; i<n; i++){

            if(n % i == 0){
                System.out.println("Number is Not Prime");
                return;
            }
        }
        System.out.println("Number is Prime");
    }
}
