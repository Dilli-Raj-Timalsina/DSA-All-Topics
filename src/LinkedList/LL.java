package LinkedList;

public class LL {

    public Node head;
    private Node tail;
    private int size;
    //This is constructor for Outer class LL
    public LL() {
        this.size=0;
    }
    public Node InPlaceRev(Node head)
    {
        Node temp=head.next;
        Node con=head.next.next;
        head.next=null;
        while(con!=null)
        {
            temp.next=head;
            head=temp;
            temp=con;
            con=con.next;
        }
        temp.next=head;
        head=temp;
        return head;
    }
    public Node reverseRec(Node temp)
    {
    if(temp.next==null)
    {
        this.head=temp;
        return temp;
    }
   Node tail=reverseRec(temp.next);
   tail.next=temp;
   tail=temp;
   tail.next=null;
   return tail;

    }

    public void insertFirst(int val)
    {
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null)
        {
            tail=head;
        }
        size+=1;
    }
    public void insert(int val,int index)
    {
        if(tail==null)
        {
            insertFirst(val);
            return;
        }
        if(size==index)
        {
            insertLast(val);
            return;
        }
       Node temp=head;
       int position=1;
       while(position!=index)
       {
           temp=temp.next;
           position+=1;
       }
        Node node=new Node(val);
        node.next=temp.next;
        temp.next=node;
        size+=1;
    }
    public void insertRec(int val,int index)
    {
        insertRec(val,index,head);
    }
    private void insertRec(int val,int index,Node node)
    {
     if(index==1)
     {
         Node temp=new Node(val,node.next);
         node.next=temp;
         size++;
         return ;
     }
     insertRec(val,index-1,node.next);
    }
    public void insertLast(int val)
    {
        if(tail==null)
        {
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size+=1;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

       Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node find(int value) {
       Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("End");
    }

    public void deleteDuplicates(Node head)
    {
        Node first=head;
        Node second=head.next;
        while(second!=null)
        {
            if(first.value== second.value)
            {
                first.next=second.next;
                second=second.next;
            }
            else
            {
                first=second;
                second=second.next;
            }
        }

        return ;
    }
    public void mergeLists(LL list1,LL list2,LL list3)
    {

      Node first=list1.head;
      Node second=list2.head;
      while(first!=null&&second!=null)
      {
          if(first.value<= second.value)
          {
              list3.insertLast(first.value);
              first=first.next;
          }
          else{
              list3.insertLast(second.value);
              second=second.next;
          }
      }
      while(first!=null)
      {
          list3.insertLast(first.value);
          first=first.next;
      }
        while(second!=null)
        {
            list3.insertLast(second.value);
            second=second.next;
        }
      return;
    }
    public int lengthOfCycle(Node head)
    {
        Node fast=head.next;
        Node slow=head;
        int length=0;
        while(fast!=slow)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
            if(fast==slow)
            {
                slow=slow.next;
                length=+1;
                while(fast!=slow)
                {
                    slow=slow.next;
                    length+=1;
                }
            }
        return length;
    }
    public Node cycleStartNode(Node head)
    {
        Node first=head;
        Node second=head;
        int length=lengthOfCycle(head);
        for (int i = 1; i <=length ; i++) {
            first=first.next;
        }
       while(first!=second)
       {
           first=first.next;
           second=second.next;
       }
       return first;

    }
    public Node mergeSort(Node head)
    {
        return head;
    }
    public boolean isHappy(int n)
    {
        return true;
    }

    //This is Node class which is also same as Container for LinkedList
    //**********************************************************
    private class Node {
        private int value;
        private Node next;
        //These are Constructor for class type Node:
        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    //***************************************************************
//    public static void main(String[] args) {
//        LL list1=new LL();
//        list1.insertFirst(2);
//        list1.insertFirst(3);
//        list1.insertFirst(25);
//        list1.insertFirst(23);
//        list1.insertFirst(982);
//        list1.display();
//        list1.insertLast(100);
//        list1.insertLast(200);
//        list1.display();
//        list1.insert(3000,3);
//        list1.display();
//        System.out.println(list1.size);
//
//
//    }
}
