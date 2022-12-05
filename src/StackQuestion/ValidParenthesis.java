package StackQuestion;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
    String input="{[()]}";
        System.out.println(firstClosing(input));
    }
    public static boolean firstClosing(String str)
    {
        Stack<Character> stack=new Stack<>();
        int i=0;
        for ( i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
            if(isClosing(str.charAt(i)))
            {
                stack.pop();
                break;
            }
        }
        while(i<str.length()&&isValid(str.charAt(i),stack))
        {
            stack.pop();
                i+=1;
        }
        if(stack.isEmpty()&&i==str.length())
        {
            return true;
        }
       return false;
    }

    public static boolean isClosing(char ch)
    {
       if(ch==')')
       {
           return true;
       }
        if(ch=='}')
        {
            return true;
        }
        if(ch==']')
        {
            return true;
        }
        return false;
    }
    public static boolean isValid(char ch,Stack stack)
    {
        if(stack.isEmpty())
        {
            return false;
        }
        if(ch==')')
        {
            char jh= (char) stack.peek();
            if(jh=='(')
            {
                return true;
            }
        }
        if(ch=='}')
        {
            char jh= (char) stack.peek();
            if(jh=='{')
            {
                return true;
            }
        }
        if(ch==']')
        {
            char jh= (char) stack.peek();
            if(jh=='[')
            {
                return true;
            }
        }
        return false;
    }

}
