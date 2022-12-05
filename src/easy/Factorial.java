package easy;

public class Factorial {
    public static void main(String[] args) {
//        System.out.println(fac1(5,5));
        System.out.println(fac2(5));
    }
    static int fac1(int  n,int ans)
    {
        if(n==1)
        {
            return ans;
        }
        return fac1(n-1,ans*(n-1));

    }
    static int fac2(int  n)
    {
        if(n==1)
        {
            return n;
        }
        return n*fac2(n-1);

    }
}
