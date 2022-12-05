package easy;

public class Nto1 {
    public static void main(String[] args) {
//        printN(10,1);
        printNNewMethod(5);
    }
    static void printN(int  n,int start)
    {

        if(start==n)
        {
            return;
        }
        System.out.println(start);
        printN(n,start+1);
    }
    static void printNNewMethod(int  n)
    {

        if(n==0)
        {
            return;
        }

        printNNewMethod(n-1);
        System.out.println(n);
    }

}
