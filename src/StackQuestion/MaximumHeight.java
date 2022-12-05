package StackQuestion;

import java.util.Arrays;
import java.util.Stack;

public class MaximumHeight {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,6};
        System.out.println(largestRectangleArea(arr));
    }
    public static int largestRectangleArea(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int[] ans2=new int[n];
        int countLeft=0;
        int countRight=0;
        Stack<Integer> stack=new Stack<>();
        //for Left Rectangle
        for (int i =n-1;i>=0; i--) {
            while (!stack.isEmpty()&&nums[i]>nums[stack.peek()])
            {
                if(i==0)
                {
                    ans[stack.pop()]=1;
                }
                else{
                countLeft=stack.peek()-i;
                ans[stack.pop()]=countLeft;
                }
            }
            if(i<n)
            {
                ans[i]=i+1;
                stack.push(i);
            }
        }
        //for right rectangle
        for (int i =0;i<=n-1; i++) {
            while (!stack.isEmpty()&&nums[i]>nums[stack.peek()])
            {
                if(i==n-1)
                {
                    ans[stack.pop()]=1;
                }
                else{
                    countLeft=stack.peek()-i;
                    ans[stack.pop()]=countLeft;
                }
                int temp=ans[stack.peek()];
                ans[stack.pop()]=nums[i]*temp;
            }
            if(i<n)
            {
                ans2[i]=i+1;
                stack.push(i);
            }
        }
        int finalAns=0;
        for(int i=0;i<n-1;i++)
        {
            if(ans[i]>ans[i+1])
            {
                finalAns=ans[i];
            }
            else{
                finalAns=ans[i+1];
            }
        }
        return finalAns;

    }
}
