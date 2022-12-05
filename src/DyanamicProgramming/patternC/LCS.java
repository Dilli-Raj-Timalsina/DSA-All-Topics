package DyanamicProgramming.patternC;

public class LCS {
    public static void main(String[] args) {
        System.out.println(LCS("abc","ac",3,2));
        Integer dp[][]=new Integer[4][3];
        System.out.println(LCSmemo("abc","ab",3,2,dp));
        System.out.println(LCStabu("abc","ab",3,2));
    }

    //LCS using Recursion
    public static int  LCS(String x,String y,int n,int m)
    {
      if(n==0||m==0)
      {
          return 0;
      }
      else if(x.charAt(n-1)==y.charAt(m-1))
      {
        return 1+LCS(x,y,n-1,m-1);
      }
      else{
          return Math.max(LCS(x,y,n-1,m),LCS(x,y,n,m-1));
      }
    }

    //LCS using Memoization
    public static int  LCSmemo(String x,String y,int n,int m,Integer dp[][])
    {
        if(n==0||m==0)
        {
            return 0;
        }
        if(dp[n][m]!=null)
        {
            return dp[n][m];
        }
        else if(x.charAt(n-1)==y.charAt(m-1))
        {
            return dp[n][m]=1+LCS(x,y,n-1,m-1);
        }
        else{
            return dp[n][m]=Math.max(LCS(x,y,n-1,m),LCS(x,y,n,m-1));
        }
    }

    //LCS using tabulation
    public static int LCStabu(String x,String y,int n,int m)
    {
        int dp[][]=new int[n+1][m+1];
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <=m ; j++) {
                if(i==0||j==0)
                {
                    dp[i][j]=0;
                }
                else if(x.charAt(i-1)==y.charAt(j-1))
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
     return dp[dp.length-1][dp[0].length-1];
    }

}


























