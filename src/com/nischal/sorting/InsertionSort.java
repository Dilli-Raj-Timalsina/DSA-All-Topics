package com.nischal.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int []arr={0,5,43,2,1};
        System.out.println(Arrays.toString(arr));

        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }
    static  void insertion(int []arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j-1]>arr[j])
                {
                    swap(arr,j,j-1);
                }
                else if(arr[j-1]<arr[j])
                {
                    break;
                }
            }
        }
    }
    static int[] swap(int []arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
        return arr;
    }
}
