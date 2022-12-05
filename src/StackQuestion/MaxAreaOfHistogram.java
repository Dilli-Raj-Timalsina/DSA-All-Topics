package StackQuestion;

import java.util.Arrays;
import java.util.Stack;

public class MaxAreaOfHistogram {
    public static void main(String[] args) {
        int[] que={1,1,1,1,1};
    int[] totalLeft=nextGreatertoLeft(que);
    int[] totalRight=nextGreatertoRight(que);
    int[] ans=new int[que.length];
    int max=0;

//        System.out.println(Arrays.toString(totalLeft));
//        System.out.println(Arrays.toString(totalRight));
        for (int i = 0; i < que.length; i++) {
           ans[i]=(totalLeft[i]+totalRight[i]-1)*que[i];
           if(max<ans[i])
           {
               max=ans[i];
           }
        }
        System.out.println(max);

    }
    public static int[] nextGreatertoLeft(int[] nums) {
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
    public static int[] nextGreatertoRight(int[] nums) {
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
