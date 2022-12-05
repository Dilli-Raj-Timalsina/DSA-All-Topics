package com.nischal;

public class MathForDSA {
    public static void main(String[] args) {
        System.out.println(isOdd(15));
        int arr[]={1,2,3,4,5,6,1,2,3,4,5};
        System.out.println(returnSingle(arr));
    }
    public  static boolean isOdd(int n)
    {
        return (n&1)==1;
    }
    public  static int returnSingle(int arr[])
    {
        for(int i=0;i< arr.length;i++)
        {
            int confirm=0;
            int temp=arr[i];
            for(int j=0;j<=arr.length;j++)
            {
                if(arr[j+1]==arr[i])
                {
                    confirm=arr[j+1];
                    break;
                }
            }
            if(confirm==temp)
            {
                continue;
            }
            return confirm;

        }
        return -1;
    }
}
