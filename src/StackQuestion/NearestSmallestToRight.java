package StackQuestion;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmallestToRight {
    public static void main(String[] args) {
        int[] que={1,2,7,3,4};
        System.out.println(Arrays.toString(nextSmallestElements(que)));
    }
    public static int[] nextSmallestElements(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        Arrays.fill(ans,-1);
        Stack<Integer> stack=new Stack<>();
        for (int i =0;i<=n*2-1; i++) {
            while (!stack.isEmpty()&&nums[i%n]<nums[stack.peek()])
            {
                ans[stack.pop()]=nums[i%n];
            }
            if(i<n)
            {
                stack.push(i);
            }
        }
        return ans;
    }
}
