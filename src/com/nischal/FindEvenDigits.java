package com.nischal;

public class FindEvenDigits {
    public static void main(String[] args) {
        int[] nums={12,34,5,123,3786};
        System.out.println(findD(nums));

    }
    static int findD(int[] nums)
    {
        int count=0;
        for (int num:nums){
          if(even(num))
          {
              count++;
          }
        }
        return count;
    }

   static boolean even(int num) {
       String strNum=num+"";
    int noOfDigits=strNum.length();
       System.out.println(noOfDigits);
    if(noOfDigits %2==0) {
        return true;
    }
    return false;
    }
}
