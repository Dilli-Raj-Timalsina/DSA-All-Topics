package StackQuestion;

import java.util.Stack;

public class MinimumCost {
    public static void main(String[] args) {
        String input1="{{}}";
        String input2="}}{{";
        String input3="{}{}";
        String input4="{{{}}}";
        System.out.println(minimum(input1));
        System.out.println(minimum(input2));
        System.out.println(minimum(input3));
        System.out.println(minimum(input4));


    }
    public static int minimum(String input)
    {
        int ans=0;
        Stack<Character> stack=new Stack<>();
        if(input.length()%2!=0)
        {
            return -1;
        }
        for (int i = 0; i < input.length(); i++) {
            char ch=input.charAt(i);
            if(stack.size()>=1&&ch=='{')
            {
                stack.push(ch);
            }
            else if(stack.size()>=1&&ch=='}')
            {
                char top=stack.peek();
                if(stack.isEmpty())
                {
                    stack.push('{');
                   ans++;
                }
                if(top=='{')
                {
                    stack.pop();
                }
            }
            if(stack.size()<1&&ch=='{')
            {
                stack.push(ch);
            }
            if(stack.size()==0&&ch=='}')
            {
                stack.push('{');
                ans++;
            }
        }
        return ans;
    }
}
