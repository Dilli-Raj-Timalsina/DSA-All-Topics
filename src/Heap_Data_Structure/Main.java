package Heap_Data_Structure;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Heap heap=new Heap();
        heap.insert(01);
        heap.insert(60);
        heap.insert(53);
//        heap.insert(54);
        heap.insert(55);
        heap.insert(10);
        heap.insert(8);



//
        heap.display();
        heap.delete();
        heap.display();

        //heapify test
//        int arr[]={-1,54,53,55,52,90};
//        int n=5;
//        System.out.println(Arrays.toString(arr));
//        for (int i = n/2; i >0; i--) {
//         heap.heapify(arr,5,i);
//        }
//        //displaying after heapify
//        for (int i = 1; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }

        /////////////////////////////////////////////////
        PriorityQueue<Integer> pq=new PriorityQueue<>();
//        PriorityQueue<> pq=new PriorityQueue<>();
    }
}
