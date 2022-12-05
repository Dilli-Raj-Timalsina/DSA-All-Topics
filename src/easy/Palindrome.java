package easy;

public class Palindrome {
    public static void main(String[] args) {
        int n=123454321;
       if( check(n,0)==n)
       {
           System.out.println(true);
       }
       else{
           System.out.println(false);
        }
    }
    static int check(int n,int sum)
    {
        if(n==0)
        {
            return sum;
        }
        int rem=n%10;
         sum=sum*10+rem;
         return check(n/10,sum);
    }
}
