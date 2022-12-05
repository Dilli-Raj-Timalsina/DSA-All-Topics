package RecursionRevision;

import java.util.Arrays;

public class SelectionSortUsingRecursion {
    public static void main(String[] args) {
        int arr[]={6,2,3,4,1,5};
        sort(arr,arr.length,1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int arr[],int row,int col,int max)
    {
       if(row== 1)
       {
           return;
       }
       if(col<row)
       {
           if(arr[max]<arr[col])
           {
               sort(arr,row,col+1,col);
           }
           if(arr[max]>arr[col])
           {
               sort(arr,row,col+1,max);
           }
       }
       else{

       int temp=arr[row-1];
       arr[row-1]=arr[max];
       arr[max]=temp;
       sort(arr,row-1,1,0);}}


}
