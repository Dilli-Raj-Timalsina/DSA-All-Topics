package Stack_and_Queue;
public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is full!!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop()  {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
//        int removed = data[ptr];
//        ptr--;
//        return removed;
        return data[ptr--];
    }

    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot peek from an empty stack!!");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1; // ptr is at last index
    }

    public boolean isEmpty() {
        return ptr == -1;
    }


    /////////////////////////////QUESTION SECTION////////////////////////////////////
    //Q)Reverse a given string "abcde".
    public String reverse(String str,int i,int j)
    {
        i=0;
        j=str.length()-1;
        char temp=str.charAt(i);


        return str;
    }
}
