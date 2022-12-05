package com.nischal;

public class FindMinInArray {
    public static void main(String[] args) {
        int[] arr={8,3,4,7,67,3};
        System.out.println(findMinVal(arr));
    }
    //suppose this is not an empty array
    static int findMinVal(int[] arr)
    {
        int minValue=arr[0];
    for(int k:arr)
    {
        if(minValue>k)
        {
            minValue=k;
        }
    }
    return minValue;
}}
