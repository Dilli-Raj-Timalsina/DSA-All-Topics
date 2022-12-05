package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list1=new LL();
        LL list2=new LL();
        LL list3=new LL();
        //java Linked List
        LinkedList<Integer> list=new LinkedList<>();
        list.add(14);
        list.add(24);
        list.add(34);
        list.add(86);
//        int []arr={1,2,3,4};
//     String ans=   Arrays.toString(arr);

        //.....................
        list1.insertFirst(4);
        list1.insertFirst(4);
        list1.insertFirst(3);
        list1.insertFirst(2);
        list1.insertFirst(1);
//        list2.insertFirst(7);
//        list2.insertFirst(7);
//        list2.insertFirst(6);
//        list2.insertFirst(3);


        list1.display();
        list1.InPlaceRev(list1.head);
        list1.display();
//        list2.display();
//        list3.mergeLists(list1,list2,list3);
//        list3.display();
//        list1.display();
//        list2.display();


//        list1.display();
//        list1.insertLast(100);
//        list1.insertLast(200);
//        list1.display();
//        list1.insert(3000,3);
//        list1.display();
//        list1.insertRec(1000,2);
//        list1.display();
//        list1.insertFirst(23);
//        list1.insertFirst(982);
//        list1.display();
//        System.out.println(list1.size);


    }
}
