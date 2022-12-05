package RecursionRevision;

import java.util.Arrays;

public class BuubleSortViaRecursion {
    public static void main(String[] args) {
        int arr[]={3,1,5,0,4,89,67,45};
        sort(arr,0,0);
        System.out.println(Arrays.toString(arr));
    }

     static void sort(int arr[],int index,int row) {
        if(row== arr.length-1)
        {
            return;
        }
       if(index<=arr.length-2-row)
       {
        if(arr[index]>arr[index+1])
        {
            int temp=arr[index];
            arr[index]=arr[index+1];
            arr[index+1]=temp;
            sort(arr,index+1,row);
        }
        sort(arr,index+1,row);
       }
      else{
          sort(arr,0,row+1);
       }
    }
}
