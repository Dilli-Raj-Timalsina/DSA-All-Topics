public class printFive {
    public static void main(String[] args) {
        fun1(5);
    }
    public static void fun1(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        n-=1;
        fun1(n);
        System.out.println(n+1);
    }
}
