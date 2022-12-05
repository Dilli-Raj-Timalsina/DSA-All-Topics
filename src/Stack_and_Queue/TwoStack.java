package Stack_and_Queue;

public class TwoStack {
    protected int []data;
    int top1=0;
    int size=data.length;
    int top2=size-1;
    //Initialize two stack
    public TwoStack(int size) {
        this.data = new int[size];
    }
    //push1
    public void push1(int element)
    {
        if(top2-top1>=1)
        {
           data[top1]=element;
           top1++;
        }
        else{
            System.out.println("Stack OverFlow!");
        }
    }
    //push1
    public void push2(int element)
    {
        if(top2-top1>=1)
        {
            data[top2]=element;
            top1--;
        }
        else{
            System.out.println("Stack OverFlow!");
        }
    }
    //pop1
    public int pop1()
    {
        if(top1==0)
        {
            return -1;
        }
        int ans=data[top1];
        top1--;
        return ans;
    }
    //pop2
    public int pop2()
    {
        if(top2==size-1)
        {
            return -1;
        }
        int ans=data[top2];
        top2--;
        return ans;
    }




}
