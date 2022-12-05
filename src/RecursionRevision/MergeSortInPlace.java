package RecursionRevision;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
         int arr[]={3,2,1,5,0};
         sortInPlace(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void sortInPlace(int arr[],int s,int e)
    {
        if(e-s==1)
        {
            return;
        }
        int mid=(s+e)/2;
        sortInPlace(arr,s,mid);
        sortInPlace(arr,mid,e);
        merge(arr,s,mid,e);
    }

     static void merge(int[] arr, int s, int mid, int e) {
        int []ans=new int[e-s];
        int i=s;
        int j=mid;
        int k=0;
       while(i<mid&&j<e)
       {
           if(arr[i]<arr[j])
           {
            ans[k]=arr[i];
            i++;
           }
           else{
               ans[k]=arr[j];
               j++;
           }
           k++;
       }
       while(i<mid)
       {
           ans[k]=arr[i];
           i++;
           k++;
       }
         while(j<e)
         {
             ans[k]=arr[j];
             j++;
             k++;
         }
         for (int l = 0; l < ans.length; l++) {
             arr[s+l]=ans[l];
         }
    }
}
