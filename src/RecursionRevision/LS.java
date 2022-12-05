package RecursionRevision;

import java.util.Arrays;

public class LS {
    public static void main(String[] args) {
      int arr[]={1,2,3,3,5};
      int ans[]=new int[2];
       search(arr,3,0,ans,0);
        System.out.println(Arrays.toString(ans));
    }
    static void search(int arr[],int target,int index,int []ans,int p)
    {
        if(index==arr.length-1)
        {
            return ;
        }
        else if(arr[index]==target){
           ans[p]=index;
           search(arr,target,index+1,ans,p+1);

    }
        else {
            search(arr,target,index+1,ans,p);
        }

    }
}
