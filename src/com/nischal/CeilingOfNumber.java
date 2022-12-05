package com.nischal;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int arr[]={1,3,4,6,9,12,13};
        int target=11;
        System.out.println(ceiling(arr,target));
    }
    static int ceiling(int []arr,int target)
    {
        int start=0;
        int end= arr.length-1;
        int mid=(start+end)/2;
        while(start<=end)
        {
            if(arr[mid]==target)
            {
                return arr[mid];
            }

            else if(arr[mid]<target)
            {
                start=mid+1;
            }
            else if(arr[mid]>target)
            {
                end=mid-1;
            }
            mid=(start+end)/2;
        }


        return arr[mid+1];
    }
}
