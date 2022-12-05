package StackQuestion;

import java.util.ArrayList;
import java.util.Stack;

public class NextGreatestElement {
    public static void main(String[] args) {

    }
    public static ArrayList<Integer> findGreatest(int[] arr)
    {
        ArrayList<Integer> arrayList=new ArrayList<>( arr.length);
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);
        for (int i = arr.length-1; i >=0 ; i--) {
            int current=stack.peek();
            while(!stack.isEmpty()&&arr[i]>=current)
            {
                stack.pop();
            }
            arrayList.add(i,current);
            stack.push(arr[i]);
        }
        return arrayList;
    }
}
