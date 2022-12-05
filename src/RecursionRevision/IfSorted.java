package RecursionRevision;

import java.util.Arrays;

public class IfSorted {
    public static void main(String[] args) {
     int arr[]={1,2,3,5,5};
     int arr2[]={1,2,3,5,5};
     arr2[0]=9;
        System.out.println(Arrays.toString(arr
        ));
//        System.out.println(isSorted(arr,0));
    }
    static  boolean isSorted(int arr[],int e)
    {
        if(e>=arr.length-1)
        {
            return true;
        }
      else  if(arr[e]>=arr[e+1])
        {
            return false;
        }
      else
        {
            return    isSorted(arr,e+1);
        }

    }
}
