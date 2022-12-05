package PatternRecursion;

public class BSortRecursion {
    public static void main(String[] args) {
        int arr[]={1,6,5,4,2,3};
        bs(arr, arr.length-1, 0);
        int arr2[]={1,2,3,4};
        System.out.println(arr[1]);
        System.out.println(arr2);
    }
    static  void bs(int arr[],int row,int col)
    {
        if(row==0)
        {
            return;
        }
        if(col<row)
        {
            if(arr[col]>arr[col+1])
            {
                int temp=arr[col+1];
                arr[col+1]=arr[col];
                arr[col]=temp;
                bs(arr,row,col+1);
            }
            bs(arr,row,col+1);
        }
        else {
            bs(arr,row-1,0);
        }
    }
}
