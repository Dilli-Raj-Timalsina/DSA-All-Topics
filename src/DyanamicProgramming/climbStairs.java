package DyanamicProgramming;

public class climbStairs {

   //Recursive Method--memoization
    public static int climbStair(int n,int[] qb) {
        if(n==0)
        {
            return 1;
        }
        if(n<0)
        {
            return 0;
        }
        if(qb[n]>0)
        {
            return qb[n];
        }
        int jump1=climbStair(n-1,qb);
        int jump2=climbStair(n-2,qb);
        int jump3=climbStair(n-3,qb);
        qb[n]=jump1+jump2+jump3;
        return qb[n];
    }

    //tabulation Method
    public static int stair(int n)
    {
        int[] dp=new int[n+1];
        dp[0]=1;
        for (int i = 1; i <=n; i++) {
            if(i==1)
            {
                dp[i]=dp[i-1];
            }
            else if(i==2)
            {
                dp[i]=dp[i-1]+dp[i-2];
            }
            else {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }
        }
        return dp[n];
    }

    //total way of climbimg via jumps
    public static int climbWithJump(int[] stair)
    {
        int n=stair.length;
        int []dp=new int[n+1];
        dp[n]=1;
        for (int i = n-1; i >=0; i--) {
            for (int j = 1; j <=stair[i] &&(i+j)<=n; j++) {
                dp[i]+=dp[i+j];
            }
        }
      return dp[0];
    }

    //climb stairs with minimum moves
    public static int climbWithMinMoves(int []stair)
    {
        int n=stair.length;
        Integer []dp=new Integer[n+1];
        dp[n]=1;
        for (int i = n-1; i >=0; i--) {
            if(stair[i]!=0) {
                int min=Integer.MIN_VALUE;
                for (int j = 1; j <= stair[i] && (i + j) <= n; j++) {
                    if(dp[i+j]!=null)
                    min=Math.min(min,dp[i+j]);
                }
                if(min!=Integer.MIN_VALUE)
                    dp[i]=min;
            }
        }
        return dp[0];
    }

    //find minimum cost to go from top right row to bottom left column of n*m matrix
    public static int minimumCost(int [][]matrix)
    {
        int [][]dp=new int[matrix.length-1][matrix[0].length-1];
        for (int i = dp.length-1;i >=0 ; i++) {
            for (int j = dp[0].length-1; j>=0 ; j++) {
                if(i== dp.length-1&&j==dp[0].length-1){
                 dp[i][j]=matrix[i][j];
                }
                else if(i==dp.length-1)
                {
                dp[i][j]=matrix[i][j]+dp[i][j+1];
                }
                else if(j==dp[0].length-1)
                {
                 dp[i][j]=matrix[i][j]+dp[i+1][j];
                }
                else{
                    dp[i][j]=Math.min(dp[i+1][j],dp[i][j+1])+matrix[i][j];
                }
            }
        }
        return dp[0][0];
    }

    //find path with Maximum gold
    public static int maxGold(int [][]matrix)
    {
        int [][]dp=new int[matrix.length-1][matrix[0].length-1];
        for (int j = dp[0].length-1; j >=0; j--) {
            for (int i = dp.length-1; i>=0; i--) {

                if(j==dp[0].length-1)
                {
                    dp[i][j]=matrix[i][j];
                }
                else if(i==dp.length-1)
                {
                    dp[i][j]=Math.max(matrix[i-1][j+1],matrix[i][j+1])+dp[i][j];
                }
                else if(i==0)
                {
                    dp[i][j]=Math.max(matrix[i][j+1],matrix[i+1][j+1]);
                }

                else{
                    dp[i][j]=Math.max(Math.max(matrix[i-1][j+1],matrix[i][j+1]+dp[i][j]),matrix[i+1][j+1]);
                }
            }
        }
        int max=dp[0][0];
        for (int i = 0; i < dp.length; i++) {
            max=Math.max(dp[0][i],max);
        }
        return max;
    }

    //Main Method
    public static void main(String[] args) {
        System.out.println(climbStair(6,new int[7]));
        System.out.println(stair(6));

    }

    public static class KnapSack {
        public static void main(String[] args) {
            int wt[]={10,20,30,40,10};
            int val[]={60,100,120,60,100};
            int W=70;
            int n= wt.length;
            int [][]dp=new int[n+1][W+1];
            for (int i = 0; i < dp.length; i++) {
                for (int j = 0; j < dp[0].length; j++) {
                    dp[i][j]=-1;
                }
            }
            System.out.println(knapSack(W,wt,val,n,dp));
            System.out.println(knapSackIte(W,wt,val,n));
        }
        //0-1 knapsack memoization
        public  static int knapSack(int W, int wt[], int val[], int n,int [][]dp)
        {
            // your code here
            if(W==0||n==0)
            {
                return 0;
            }
            if(dp[n][W]!=-1)
            {
                return dp[n][W];
            }
            if(wt[n-1]>W)
            {
                return dp[n][W]=knapSack(W,wt,val,n-1,dp);
            }
            int included=val[n-1]+knapSack(W-wt[n-1],wt,val,n-1,dp);
            int excluded=knapSack(W,wt,val,n-1,dp);
            return dp[n][W]= Math.max(included,excluded);
        }

        //0-1 knapsack bottom-up/Iterative
        public static int knapSackIte(int W,int wt[],int val[],int n)
        {
           int [][]dp=new int[n+1][W+1];
            for (int i = 1; i <dp.length ; i++) {
                for (int j = 1; j < dp[0].length; j++) {
                   if(wt[i-1]>j)
                   {
                       dp[i][j]=dp[i-1][j];//when not included bcz weight is greater at that instance
                   }
                   else{
                       int rMaxSumIndex=j-wt[i-1];
                       if(dp[i-1][rMaxSumIndex]+val[i-1]>dp[i-1][j])
                       {
                           dp[i][j]=dp[i-1][rMaxSumIndex]+val[i-1];
                       }
                       else {
                           dp[i][j]=dp[i-1][j];
                       }
                   }
                }
            }
            return dp[dp.length-1][dp[0].length-1];
        }
    }
}
