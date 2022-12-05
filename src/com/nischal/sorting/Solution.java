package com.nischal.sorting;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int nums[]={1};
        firstMissingPositive(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static int firstMissingPositive(int[] nums) {
      int i=0;
        int ans=0;
        while(i<nums.length)
        {
            int correct=nums[i]-1;
            if(nums[i]<=nums.length&&nums[i]>0&&nums[i]!=nums[correct])
            {
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=j+1)
            {
                ans=j+1;
                return ans;
            }
        }
        return ans;
    }
}