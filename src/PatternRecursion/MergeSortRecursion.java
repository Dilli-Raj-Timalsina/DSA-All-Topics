package PatternRecursion;

import java.sql.Array;
import java.util.Arrays;

public class MergeSortRecursion {
    public static void main(String[] args) {
     int arr[]={798,6,5,4,3,2,1,76};
    int ans[]= mergeSrt(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] mergeSrt(int  []arr)
    {
        if(arr.length==1)
        {
            return arr;
        }
        int mid=arr.length/2;

        int first[]=mergeSrt(Arrays.copyOfRange(arr,0,mid));
        int second[]=mergeSrt(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(first,second);
    }

    private static int[] merge(int first[],int second[]) {
        int ans[]=new int[first.length+ second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i< first.length&&j< second.length)
        {
          if(first[i]>second[j])
          {
              ans[k]=second[j];
              j++;
          }
          else if(first[i]<second[j])
          {
              ans[k]=first[i];
              i++;
          }
          k++;
        }
        while(first.length>i)
        {
            ans[k]=first[i];
            i++;
            k++;
        }
        while(second.length>j)
        {
            ans[k]=second[j];
            j++;
            k++;
        }

        return ans;
    }
}
