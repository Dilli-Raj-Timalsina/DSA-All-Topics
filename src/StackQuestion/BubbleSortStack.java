package StackQuestion;

import java.util.Stack;


public class BubbleSortStack {
    public static void main(String[] args) {
        Stack<Integer> ans1=new Stack<>();
        ans1.push(1);
        ans1.push(2);
        ans1.push(123);
        ans1.push(134);
        ans1.push(0);
        ans1.push(9);
        Stack<Integer> ans=sort(ans1);
        while(!ans1.isEmpty())
        {
            System.out.println(ans1.pop());
        }
    }
    public static Stack<Integer> sort(Stack<Integer> stack)
    {
      if(stack.isEmpty())
      {
          return stack;
      }
      int top=stack.pop();
        Stack<Integer> ans=sort(stack);
       ans= insertSorted(ans,top);
        return ans;
    }

    private static Stack<Integer> insertSorted(Stack<Integer> stack, int top) {
        Stack<Integer> myStack=new Stack<>();
        if(stack.size()==0)
        {
            stack.push(top);
            return stack;
        }
        while(!stack.isEmpty()&&stack.peek()>top)
        {
           myStack.push(stack.pop());
        }
        stack.push(top);
        while(!myStack.isEmpty())
        {
            stack.push(myStack.pop());
        }
        return stack;
    }
}
