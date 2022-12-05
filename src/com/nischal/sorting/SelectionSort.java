package com.nischal.sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int []arr={0,9,8,6,5,7,4,35,2};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);

        System.out.println(Arrays.toString(arr));

    }
    static void selectionSort(int []arr)
    {
     for(int i=0;i< arr.length;i++)
     {
         int max=arr[0];
         int smallIndex=0;
         for (int j=0;j< arr.length-i;j++)
         {
             if(max<arr[j])
             {
                 max=arr[j];
                 smallIndex=j;
             }
         }
         arr[smallIndex]=arr[arr.length-1-i];
         arr[arr.length-1-i]=max;
     }
    }
}
