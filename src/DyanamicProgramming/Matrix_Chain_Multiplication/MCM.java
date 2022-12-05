package DyanamicProgramming.Matrix_Chain_Multiplication;

public class MCM {
    public static void main(String[] args) {
        int arr[]={10,30,5,60};
        int dp[][]=new int[arr.length][arr.length];
        System.out.println(calculate(arr,1, arr.length-1));
        System.out.println(calculateMemo(arr,1, arr.length-1, dp));
    }
    public static int calculate(int arr[],int i,int j)
    {
        if(i==j)
        {
            return 0;
        }
        int mini=1256789;
        for (int k = i; k <=j-1; k++) {
            int cost=(arr[i-1]*arr[k]*arr[j])+calculate(arr,i,k)+calculate(arr,k+1,j);
            if(mini>cost) mini=cost;
        }
        return mini;
    }

    public static int calculateMemo(int arr[],int i,int j,int dp[][])
    {
        if(i==j)
        {
            return 0;
        }
        if(dp[i][j]!=0)
        {
            return dp[i][j];
        }
        int mini=1256789;
        for (int k = i; k <=j-1; k++) {
            int cost=(arr[i-1]*arr[k]*arr[j])+calculateMemo(arr,i,k,dp)+calculateMemo(arr,k+1,j,dp);
            if(mini>cost) mini=cost;
        }
        return dp[i][j]=mini;
    }
}
