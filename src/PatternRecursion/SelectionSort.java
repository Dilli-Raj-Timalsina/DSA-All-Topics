package PatternRecursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={4,3,2,8,34,5,6,71};
        ss(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void ss(int arr[],int row,int col,int maxInd)
    {
        if(row==0)
        {
            return;
        }
        else if(col<row)
        {
            if(arr[maxInd]>arr[col+1])
            {
               ss(arr,row,col+1,maxInd);
            }
            else{
                ss(arr,row,col+1,col+1);
            }
        }
        else {
            int temp=arr[row];
            arr[row]=arr[maxInd];
            arr[maxInd]=temp;
            ss(arr,row-1,0,0);

        }
    }
}
