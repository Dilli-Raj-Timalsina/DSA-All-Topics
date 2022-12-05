package RecursionRevision;

public class Print5Times {
    public static void main(String[] args) {
     print(5);
    }
    static  void print(int n)
    {
        if(n<1)
        {
            return;
        }
        System.out.println("Hello world!");
        print(n-1);
    }
}
