package DyanamicProgramming.patternA;

public class subSetSum {
    public static void main(String[] args) {
//        10---N
//        1 1 2 2 3 4 5 5 6 7--arr
//        15----wt
        int N=5;
        int sum=6;
        int arr[]={1,2,3,4,5};
        boolean [][]dp=new boolean[N+1][sum+1];
        boolean [][]vis=new boolean[N+1][sum+1];
        System.out.println(isSubsetSum2(N,arr,sum,dp));
        System.out.println(subSetIte(N,arr,sum));
    }

    static Boolean isSubsetSum2(int N, int arr[], int sum,boolean [][]dp) {
        // code here
        if (sum==0) {
            return false;
        }
        if(N<=0)
        {
            return false;
        }
        if(arr[N-1]<=sum)
        {
            if(isSubsetSum2(N-1,arr,sum-arr[N-1],dp))
            {
                return true;
            }
        }
        return isSubsetSum2(N-1,arr,sum,dp);
    }

    static boolean subSetIte(int N, int arr[], int sum)
    {
        boolean [][]dp=new boolean[N+1][sum+1];
        for (int i = 0; i <dp.length ; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if(i==0&&j==0)
                {
                    dp[i][j]=true;
                }
                else if(j==0)
                {
                    dp[i][j]=true;
                }
                else if(i==0)
                {
                    dp[i][j]=false;
                }
                else {
                    if(dp[i-1][j])
                    {
                        dp[i][j]=true;
                    }
                    else if(j>=arr[i-1]){
                        int val=arr[i-1];
                        if(dp[i-1][j-val])
                        {
                            dp[i][j]=true;
                        }
                    }
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];

    }
}
