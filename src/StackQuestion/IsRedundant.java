package StackQuestion;

import java.util.Stack;

public class IsRedundant {
    public static void main(String[] args) {
       String str1="(a+b)";
        String str2="((a+b))";
        String str3="(a+(b*c))";
        String str4="(a)";
        System.out.println(isRedundant(str1));
        System.out.println(isRedundant(str2));
        System.out.println(isRedundant(str3));
        System.out.println(isRedundant(str4));
    }

    public static boolean isRedundant(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (stack.size() >= 1 && ch == '(')
            {
                if(stack.peek()==ch)
                {
                    return true;
                }
            }
            if (stack.size() >= 1 && ch == '(' || ch == '+' || ch == '-' || ch == '/' || ch == '*') {
                stack.push(ch);
            } else if (ch == ')') {
                char chek = stack.peek();
                if (chek == '+' || chek == '-' || chek == '*' || chek == '/') {
                    return false;
                }
            }
            if(stack.size()<1)
            {
                stack.push(ch);
            }
        }
        return true;
    }

}
