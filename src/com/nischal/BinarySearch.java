package com.nischal;

public class BinarySearch {
    public static void main(String[] args) {


    int[] arr={1,2,3,4};
    int target=2;
        System.out.println(BS(arr,target));
}
    //suppose this is not an empty array
    static int BS(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;

       while(start<=end)
       {
           int mid=(start+end)/2;

           if(arr[mid]<target)
           {
               start=mid+1;
           }
           else if(arr[mid]>target)
           {
               end=mid-1;
           }
           else if(arr[mid]==target)
           {
               return mid;
           }
       }
       return -1;
    }
}
