package Function;

public class ArrayFunction {
    public static void main(String[] args) {
        int[] a = new int[5];
        int p=0;

        System.out.println(IsEmpty(p));
        p = insert(a,p,10);
        p = insert(a,p,20);
        p = insert(a,p,30);
        p = insert(a,p,40);
        p = insert(a,p,50);
        p = update(a,p,30,35);
        p = delete(a,p,40);
        p = find(a,p,20);
        print(a,p);
       // p = find(a,p,30);
       // print(a,p);

    }
    public static int find(int[] a, int p, int value){
        int c=0;
        for(int i=0;i<p;i++)
        {
            if(a[i] == value)
            {
                c++;
            }
        }
        if(c == 1 || c > 1)
        {
            System.out.println("Value is Present");
        }
        else {
            System.out.println("Value is Not Present");
        }
        return p;
    }
    public static boolean IsEmpty(int p){
        if(p == 0)
        {
            return true;
        }
        return false;
    }
    public static int insert(int[] a,int p,int value){
        if(p == a.length)
        {
            System.out.println("Array is Full");
            return p;
        }
        a[p] = value;
        p++;
        return p;
    }
    public static int delete(int[] a,int p,int value) {
        for(int i=0;i<p;i++)
        {
            if(a[i] == value)
            {
                for(int j=i;j<p-1;j++)
                {
                    a[j] = a[j + 1];
                }
                p--;
                i--;
            }
        }
        return p;
    }
    public static int update(int[] a, int p, int oldValue, int newValue) {
        for(int i=0;i<p;i++)
        {
            if(a[i] == oldValue)
            {
                a[i] = newValue;
            }
        }
        return p;
    }

    public static void print(int[] a,int p) {
        for(int i=0;i<p;i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
