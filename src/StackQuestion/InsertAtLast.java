package StackQuestion;

import java.util.Stack;

public class InsertAtLast {
    public static void main(String[] args) {
        Stack<Integer> ans1=new Stack<>();
        Stack<Integer> ans2=new Stack<>();
        ans1.push(1);
        ans1.push(2);
        ans1.push(123);
        ans1.push(134);
        ans1.push(0);
        ans1.push(9);
    Stack<Integer> ans=pustAtBottomRec(ans1,ans2,5);
       while(!ans.isEmpty())
       {
           System.out.println(ans.pop());
       }
    }
    public static Stack<Integer> pustAtBottom(Stack<Integer> myStack,int x)
    {
        Stack<Integer> stack=new Stack<>();
        while(!myStack.isEmpty())
        {
            stack.push(myStack.pop());
        }
        myStack.push(x);
        while(!stack.isEmpty())
        {
            myStack.push(stack.pop());
        }
        return myStack;
    }
    public static Stack<Integer> pustAtBottomRec(Stack<Integer> myStack,Stack<Integer> stack,int x)
    {
        if(myStack.isEmpty())
        {
            myStack.push(x);
            return myStack;
        }
        stack.push(myStack.pop());
        Stack<Integer> ansSoFar=pustAtBottomRec(myStack,stack,x);
        myStack.push(stack.pop());
       return  ansSoFar;

    }
}
