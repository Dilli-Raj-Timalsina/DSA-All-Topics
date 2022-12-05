package RecursionRevision;

public class ReturnandREturn {
    public static void main(String[] args) {
        noreturn(5);
//        System.out.println(  returnWala(5));
    }
    static void noreturn(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        noreturn(n-1);
        System.out.println(n);
    }
    static int returnWala(int n)
    {
        if(n==0)
        {
            return -1;
        }
        System.out.println(n);
       return  returnWala(n-1);

    }
}
