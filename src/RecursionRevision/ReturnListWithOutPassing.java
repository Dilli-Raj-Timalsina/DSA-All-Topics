package RecursionRevision;

import java.util.ArrayList;

public class ReturnListWithOutPassing {
    public static void main(String[] args) {
        int arr[]={1,2,4,4,5};
        System.out.println( find(arr,4,0));

    }
    static ArrayList<Integer> find(int arr[],int target,int index)
    {
        ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length)
        {
            return list;
        }
        else if(arr[index]==target)
        {
            list.add(index);
        }

        ArrayList<Integer> ansFromAboveCalls=find(arr,target,index+1);
        list.addAll(ansFromAboveCalls);
        return list;
    }
}
