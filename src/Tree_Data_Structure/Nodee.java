package Tree_Data_Structure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Nodee {
    int data;
    Nodee left;
    Nodee right;
    //Constructor
    public Nodee(int key)
    {
        this.data=key;
    }

//    ..................Methods Starts Here......................................
    public boolean nodePath(Nodee node, ArrayList<Integer> list, int target)
    {
        if(node==null)
        {
            return false;
        }
        list.add(node.data);
        if(node.data==target )
        {
          return true;
        }
     boolean l=   nodePath(node.left,list,target);
      boolean r=  nodePath(node.right,list,target);
        if(l==false&&r==false)
        {
            list.remove(list.size()-1);
            return false;
        }
        return true;
    }

    //Zig-Zag Traversal
    public List<int[]> zigZag2(Nodee node)
    {

        Queue<Nodee> queue=new LinkedList<>();
        queue.offer(node);
        List<int[]> ans=new ArrayList<>();
        boolean leftToRight=true;
        while(!queue.isEmpty())
        {
            int size= queue.size();
            int[] list=new int[size];
            for (int i = 0; i < size; i++) {
                Nodee top=queue.peek();
                int index=(leftToRight) ? i:(size-i-1);
                if(top.left!=null) queue.offer(top.left);
                if(top.right!=null) queue.offer(top.right);
                list[index]=queue.remove().data;
            }
            leftToRight=!leftToRight;
            ans.add(list);

        }
      return ans;
    }
    //BFS-Breath first traversal.....Level order traversal
    public void bfs(Nodee node)
    {
        if(node==null)
        {
            System.out.println("Empty Tree!");
        }
        Queue<Nodee> queue=new LinkedList<Nodee>();
        queue.offer(node);
        while(!queue.isEmpty())
        {
            int size= queue.size();
            for (int i = 0; i < size; i++) {
                if(queue.peek().left!=null) queue.offer(queue.peek().left);
                if(queue.peek().right!=null) queue.offer(queue.peek().right);
                System.out.print(queue.poll().data+" ");
            }
            System.out.println();
        }

    }
    //boundary traversal
    public void boundary(Node node)
    {

    }

}
