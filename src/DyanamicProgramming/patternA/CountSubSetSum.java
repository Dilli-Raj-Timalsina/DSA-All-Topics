package DyanamicProgramming.patternA;

public class CountSubSetSum {
    public static void main(String[] args) {
        int N=5;
        int sum=1000;
        int arr[]={1,2,3,4,5};
        Integer [][]dp=new Integer[N+1][sum+1];
        System.out.println(totalCount(N-1,arr,sum,dp));
    }
    public static int totalCount(int i,int arr[],int sum,Integer [][]dp)
    {
        if(sum==0)
        {
            return 1;
        }
        if(i<0)
        {
            return 0;
        }
        if(dp[i][sum]==null)
        {
            if(arr[i]>sum)
            {
                dp[i][sum]=totalCount(i-1,arr,sum,dp);
                return dp[i][sum];
            }
            else
            {
              dp[i][sum]=totalCount(i-1,arr,sum-arr[i],dp)+totalCount(i-1,arr,sum,dp);
              return dp[i][sum];
            }
        }

        return dp[i][sum];
    }

    public static int totalCount(int arr[],Integer [][]dp)
    {
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                if(i==0&&j==0)
                {
                    dp[i][j]=1;
                }
                else if(i==0)
                {
                    dp[i][j]=0;
                }
                else if(j==0)
                {
                    dp[i][j]=1;
                }
                else{
                    if(j>=arr[i-1])
                    {
                        dp[i][j]=dp[i-1][j]+dp[i-1][j-arr[i-1]];
                    }
                    else{
                        dp[i][j]=dp[i-1][j];
                    }
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
