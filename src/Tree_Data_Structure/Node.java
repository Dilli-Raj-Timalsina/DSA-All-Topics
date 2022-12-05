package Tree_Data_Structure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Node {
    int data;
    Node left;
    Node right;
    //Constructor
    public Node(int key)
    {
        this.data=key;
    }
    //**************** Methods starts Here!  *****************//
    //Pre Order Traversal
    public void preOrder(Node node)
    {
        if(node==null)
        {
            return;
        }
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    //In Order Traversal
    public void inOrder(Node node)
    {
        if(node==null)
        {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }

    //post Order Traversal
    public void postOrder(Node node)
    {
        if(node==null)
        {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");

    }

    //BFS-Breath first traversal.....Level order traversal
    public void bfs(Node node)
    {
        if(node==null)
        {
            System.out.println("Empty Tree!");
        }
        Queue<Node> queue=new LinkedList<Node>();
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

    //Iterative Pre-Order traversal(Root Left Right)
    public void iPreOrder(Node node)
    {
        if(node==null) return;
        Stack<Node> stack=new Stack<>();
        stack.push(node);
        while(!stack.isEmpty())
        {
                Node temp=stack.pop();
                System.out.print(temp.data+" ");
                if(temp.right!=null) stack.push(temp.right);
                if(temp.left!=null) stack.push(temp.left);
        }

    }

    //Iterative in order traversal(left root right)
    public void iInOrder(Node node)
    {
        Stack<Node> stack=new Stack<>();
        while(true)
        {
            if(node!=null)
            {
                stack.push(node);
                node=node.left;
            }
            else {
                if(stack.isEmpty())
                {
                    break;
                }
                node= stack.pop();
                System.out.print(node.data+" ");
                node=node.right;
            }
        }
    }

    //Iterative post-Order traversal( Left Right Root) using 2 stack
    public void iPostOrder2Stack(Node node)
    {
        if(node==null) return;
        Stack<Node> stack1=new Stack<>();
        Stack<Node> stack2=new Stack<>();

        stack1.push(node);
        while(!stack1.isEmpty())
        {
            Node temp=stack1.pop();
            stack2.push(temp);
            if(temp.left!=null) stack1.push(temp.left);
            if(temp.right!=null) stack1.push(temp.right);
        }
        while (!stack2.isEmpty())
        {
            System.out.print(stack2.pop().data+" ");
        }

    }

    //Iterative post-Order traversal( Left Right Root) using 1 Stack
    public void iPostOrder1Stack(Node node)
    {
        if(node==null) return;
        Stack<Node> stack=new Stack<>();

        stack.push(node);
        while(!stack.isEmpty())
        {
            Node temp=stack.pop();
            stack.push(temp);
            if(temp.left!=null) stack.push(temp.left);
            if(temp.right!=null) stack.push(temp.right);
        }

    }

    //Iterative pre post In order traversal
    public void iterativePreInPostTraversal(Node node)
    {
        Stack<Pair> stack=new Stack<Pair>();
        Pair pr=new Pair(node,1);
        stack.push(pr);

        String pre="";
        String in="";
        String post="";
        while(!stack.isEmpty())
        {
            Pair top=stack.peek();
            if(top.state==1)//pre, state++,left
            {
             pre+=top.node.data+" ";
             top.state++;
             if(top.node.left!=null){
                 Pair left=new Pair(top.node.left,1);
                 stack.push(left);
             }
            }
            else if(top.state==2)//in,state++,right
            {
                in+=top.node.data+" ";
                top.state++;
                if(top.node.right!=null){
                    Pair right=new Pair(top.node.right,1);
                    stack.push(right);
                }
            }
            else{//post,pop
                post+=top.node.data+" ";
                stack.pop();
            }
        }
        System.out.println(pre);
        System.out.println(in);
        System.out.println(post);
    }
    //Pair Data structure
    public class Pair{
        Node node;
        int state;
        Pair(Node node,int state)
        {
            this.node=node;
            this.state=state;
        }
    }

    //Maximum Height of Tree using Recursion
    public int maxHeight(Node node)
    {
       if(node==null)
       {
           return 0;
       }
       int lh=maxHeight(node.left);
       int rh=maxHeight(node.right);

       return 1+Math.max(lh,rh);
    }

    //Diameter of a tree
    public int diameter(Node node,int []diameter)
    {
        if(node==null)
        {
            return 0;
        }
        int lh=maxHeight(node.left);
        int rh=maxHeight(node.right);
        int maxdia=Math.max(lh,rh);
        if(maxdia>diameter[0])
            {
                diameter[0]=maxdia;
            }
        return 1+Math.max(lh,rh);
    }

    //Max Path-sum
    public int pathSum(Node node,int[] maxPath)
    {
        if(node==null)
        {
            return 0;
        }
        int lh=Math.max(0,pathSum(node.left,maxPath));
        int rh=Math.max(0,pathSum(node.right,maxPath));
        if(lh+rh+node.data>maxPath[0])
        {
            maxPath[0]=lh+rh+node.data;
        }
       return node.data+Math.max(lh,rh);
    }

    //Maximum height using bfs/level order traversal
    public void maxHeightIterative(Node node)
    {
        int height=0;
        if(node==null)
        {
            System.out.println(height+" height!");
        }
        Queue<Node> queue=new LinkedList<Node>();
        queue.offer(node);

        while(!queue.isEmpty())
        {
            int size= queue.size();
            for (int i = 0; i < size; i++) {
                if(queue.peek().left!=null) queue.offer(queue.peek().left);
                if(queue.peek().right!=null) queue.offer(queue.peek().right);
                queue.poll();
            }
            height++;
        }
        System.out.println(height);
    }

    //Zig-Zag Traversal
    public void zigZag2(Node node)
    {

        Queue<Node> queue=new LinkedList<>();
        queue.offer(node);
        boolean check=true;
        while(!queue.isEmpty())
        {
            int size= queue.size();
            for (int i = 0; i < size; i++) {
               if(check==true)
                {
                    if(queue.peek().right!=null) queue.offer(queue.peek().right);
                    if(queue.peek().left!=null) queue.offer(queue.peek().left);
                }
                else if(check==false){
                    if(queue.peek().left!=null) queue.offer(queue.peek().left);
                    if(queue.peek().right!=null) queue.offer(queue.peek().right);
                }
                System.out.print(queue.poll().data+" ");
            }
            System.out.println();
           check=!check;
        }

    }




}
