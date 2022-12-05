package StackQuestion;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int[] que={1,2,3,1,1,2,4};
        System.out.println(Arrays.toString(nextGreaterElements(que)));
    }
    public static int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int count=0;
        Stack<Integer> stack=new Stack<>();
        for (int i =n-1;i>=0; i--) {
            while (!stack.isEmpty()&&nums[i]>nums[stack.peek()])
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
}
