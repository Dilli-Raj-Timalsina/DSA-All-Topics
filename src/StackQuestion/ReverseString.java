package StackQuestion;
import Stack_and_Queue.CustomStack;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
//       String ans= reverse("nischal","");
//        System.out.println(ans);
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(165);

        deleteMiddle(st);
        while(!st.isEmpty())
        {
            System.out.println(st.pop());
        }
    }
    public  static String reverse(String input,String output)
    {
        Stack<Character> st=new Stack();
        for (int i = 0; i < input.length(); i++) {
            st.push(input.charAt(i));
        }
        for (int i = 0; i < input.length(); i++) {
            output=output+st.pop();
        }
        return output;
    }
    public static void  deleteMiddle(Stack<Integer> st)
    {
        int count= (st.size())/2;
        Stack<Integer> st2=new Stack<>();
        while(count!=0)
        {
           st2.push(st.pop());
           count-=1;
        }
        st.pop();
        while(!st2.isEmpty())
        {
            st.push(st2.pop());
        }
    }
}
