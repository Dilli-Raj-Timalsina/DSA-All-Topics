package easy;

public class ProductOfDigit {
    public static void main(String[] args) {
        System.out.println(pro(1232));
    }
    static int pro(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return (n%10)*pro(n/10);
    }
}
