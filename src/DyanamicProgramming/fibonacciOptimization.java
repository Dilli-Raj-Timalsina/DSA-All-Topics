package DyanamicProgramming;

public class fibonacciOptimization {
    public static int fiboRec(int n)
    {
        if(n==1||n==0)
        {
            return n;
        }
        System.out.println("Hello"+ n);
        return fiboRec(n-1)+fiboRec(n-2);
    }
    public static int fiboOpti(int n,int []qb)
    {
        if(n==0||n==1)
            return n;
        if(qb[n]!=0)
            return qb[n];

        System.out.println("Hello "+n);
        int fiboN=fiboOpti(n-1,qb)+fiboOpti(n-2,qb);
        qb[n]=fiboN;
        return fiboN;
    }

    public static void main(String[] args) {
        System.out.println(fiboRec(6));
        System.out.println(fiboOpti(6,new int[6+1]));

    }
}
