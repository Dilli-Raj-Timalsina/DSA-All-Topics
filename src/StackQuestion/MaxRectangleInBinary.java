package StackQuestion;

import java.util.Arrays;
import java.util.Stack;

public class MaxRectangleInBinary {
    public static void main(String[] args) {
        int[][] nums={{1,0,1,0,0},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}};
        int maxRec=0;
        for (int i = 0; i < nums.length; i++) {
            int temp;
            if(i>0)
            {
                for (int j = 0; j < nums[i].length; j++) {
                    if(nums[i][j]==0)
                    {
                        nums[i][j]=0;
                    }
                    else {
                    nums[i][j]=nums[i][j]+nums[i-1][j];}
                }
               temp=maxArea(nums[i]);
            }
          else{temp=maxArea(nums[i]);}
            if(maxRec<temp)
            {
              maxRec=temp;
            }
        }
        System.out.println(maxRec);
    }
    public static int maxArea(int[] nums)
    {
        int[] totalLeft=nexttSmalleroLeft(nums);
        int[] totalRight=nextSmallertoRight(nums);
        int[] ans=new int[nums.length];
        int max=0;
        for (int i = 0; i < nums.length; i++) {
            ans[i]=(totalLeft[i]+totalRight[i]-1)*nums[i];
            if(max<ans[i])
            {
                max=ans[i];
            }
        }
        return max;
    }
    public static int[] nexttSmalleroLeft(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int count=0;
        Stack<Integer> stack=new Stack<>();
        for (int i =n-1;i>=0; i--) {
            while (!stack.isEmpty()&&nums[i]<nums[stack.peek()])
            {
                count=stack.peek()-i;
                ans[stack.pop()]=count;
            }
            if(i<n)
            {
                ans[i]=i+1;
                stack.push(i);
            }
        }

        return ans;
    }
    public static int[] nextSmallertoRight(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int count=0;
        Stack<Integer> stack=new Stack<>();
        for (int i =0;i<n; i++) {
            while (!stack.isEmpty()&&nums[i]<nums[stack.peek()])
            {
                count=i-stack.peek();
                ans[stack.pop()]=count;
            }
            if(i<n)
            {
                ans[i]=n-i;
                stack.push(i);
            }
        }

        return ans;
    }
}
