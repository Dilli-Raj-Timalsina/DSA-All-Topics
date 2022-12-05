package Heap_Data_Structure;

import java.util.PriorityQueue;

public class Heap {
    int[] arr;
    int size;
    Heap()
    {
        arr=new int[100];
        size=0;
    }
    //////////////////////Methods Starts here///////////////////////
    void insert(int val)
    {
     size++;
     int idx=size;
     arr[idx]=val;
     while(idx>1){
         if (arr[idx] > arr[idx / 2]) {
             //swap
             int temp = arr[idx];
             arr[idx] = arr[idx/2];
             arr[idx/2] = temp;
             idx=idx/2;
         }
         else{
         break;
         }
    }}

    void display()
    {
        if(size<1)
        {
            System.out.println("Empty Heap!");
            return;
        }
        for (int i = 1; i <= size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("End");
    }

    void delete()
    {
        if(size<1)
        {
            System.out.println("Empty Heap!");
            return;
        }
        int idx=1;
        arr[idx]=arr[size];
        size--;
        while(idx<size)
        {
            int leftIndex=2*idx;
            int rightIndex=2*idx+1;
            if(arr[idx]<arr[leftIndex]&&arr[leftIndex]>arr[rightIndex])
            {
              //swap
                int temp=arr[idx];
                arr[idx]=arr[leftIndex];
                arr[leftIndex]=temp;
                idx=leftIndex;
            }
            else if(arr[idx]<arr[rightIndex]&&arr[rightIndex]>arr[leftIndex]&&rightIndex<=size)
            {
                //swap
                int temp=arr[idx];
                arr[idx]=arr[rightIndex];
                arr[rightIndex]=temp;
                idx=rightIndex;
            }
            else{
                break;
            }
        }
    }

    void heapify(int arr[],int n,int t)
    {
        int largest=t;
        int left=2*t;
        int right=2*t+1;

        if(left<n&&arr[largest]<arr[left]&&arr[left]>arr[right])
        {
            largest=left;
        }
        if(right<=n&&arr[largest]<arr[right]&&arr[right]>arr[left])
        {
            largest=right;
        }
        if(largest!=t)
        {
            //swap
            int temp=arr[largest];
            arr[largest]=arr[t];
            arr[t]=temp;
            heapify(arr,n,largest);
        }
    }

    int kthSmallest(int arr[],int l,int r,int k)
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for (int i = l; i <k; i++) {
            pq.add(arr[i]);
        }
        for (int i = k; i <=r; i++) {
            if(arr[i]<pq.peek())
            {
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();

    }
}
