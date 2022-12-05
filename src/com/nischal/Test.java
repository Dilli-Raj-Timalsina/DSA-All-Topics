package com.nischal;

public class Test {
    public static void main(String[] args) {
        int []arr={1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(arr));
    }
    static int numIdenticalPairs(int[] nums) {
        int goodPair=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=1;j<nums.length-i;j++)
            {
                if(nums[i]==nums[j]&&i!=j)
                {
                    goodPair++;
                }
            }
        }
        return goodPair;
    }
}
