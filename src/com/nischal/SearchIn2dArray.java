package com.nischal;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int [][]arr={
                {1,2,3,4},{5,6,8,23},{234,568,0}
        };
        int target=0;
        System.out.println(searchIn2d(arr,target));
    }
    static int searchIn2d(int [][]arr,int target)
    {
        int ans=0;
        for(int row=0;row< arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {
                if(arr[row][col]==target)
                {
                    ans=target;
                    return ans;
                }
            }
        }
        return -1;
    }


}
