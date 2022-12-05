package com.nischal;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        fun1({3,4,6,7,8},7);
        int[] arr={1,2,6,5,4,7,-9,18};
        int target=876;
       int val= fun1(arr,target);
        System.out.println(val);
        int []a1rr=new int[5];
        System.out.println(5^3^5);
    }
    //Check whether the array contains "target" element
    static int fun1(int[] arr,int target)
    {
          if(arr.length==0)
          {
              return -1;
          }
        for(int index=0;index< arr.length;index++)
        {
            int currentElement=arr[index];
            if(currentElement==target)
            {
                return index;
            }
        }
        return -1;
    }
    static int fun2(int[] arr,int target)
    {
        if(arr.length==0)
        {
            return -1;
        }
        for (int currentElement : arr) {
            if (currentElement == target) {
                return currentElement;
            }
        }
        return -1;
    }
}
