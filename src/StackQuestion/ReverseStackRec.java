package StackQuestion;

import java.util.Stack;

public class ReverseStackRec {
    public static void main(String[] args) {
        Stack<Integer> ans1=new Stack<>();
        Stack<Integer> ans2=new Stack<>();
        ans1.push(1);
        ans1.push(2);
        ans1.push(123);
        ans1.push(134);
        ans1.push(0);
        ans1.push(9);
        Stack<Integer> ans=reverse(ans1,ans2);
        while(!ans.isEmpty())
        {
            System.out.println(ans.pop());
        }
    }
    public static Stack<Integer> reverse(Stack<Integer> stack,Stack<Integer> ans)
    {
        if(stack.isEmpty())
        {
            return ans;
        }
        ans.push(stack.pop());
        reverse(stack,ans);
        return ans;
    }
}
