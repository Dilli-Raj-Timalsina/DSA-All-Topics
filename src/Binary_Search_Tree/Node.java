package Binary_Search_Tree;
public class Node {
    int data;
    Node left;
    Node right;
    //constructor
    public Node(int key)
    {
        this.data=key;
    }

    public Node findTarget(Node node,int target)
    {
        if(node!=null&&node.data==target) return node;
        if(node!=null&&node.data>target) return findTarget(node.left,target);
        if(node!=null&&node.data<target) return findTarget(node.right,target);
        return null;

    }
    public Node findTargetI(Node node,int target)
    {
        while(node!=null||node.data!=target)
        {
            node=(target> node.data)? node.right:node.left;
        }
      return node;
    }
    public int ceilFind(Node node,int target,int ceil)
    {
        if(node==null )  return -1;
        if(node.data==target) return node.data;
        if(node.data>target){
           if(ceil<target||ceil> node.data)
           {
               ceil= node.data;
               if(node.left!=null) {
                   return ceilFind(node.left, target, ceil);
               }
           }
        }
        if(node.data<target)
        {
            if(node.right!=null)
            {
       return   ceilFind(node.right,target,ceil);
            }
        }
        return ceil;
    }
    public int ceilFindI(Node node,int target)
    {
        int ceil=-1;
      while(node!=null)
      {
          if(node.data==target)
          {
              ceil= node.data;
              return ceil;
          }
          if (target > node.data) node=node.right;
          else {
              ceil= node.data;
              node=node.left;
          }}
      return ceil;
    }
    public int floorFind(Node node,int target)
    {
        int floor=-1;
        while(node!=null)
        {
            if(node.data==target)
            {
                floor= node.data;
                return floor;
            }
            if (target > node.data){
                floor= node.data;
                node=node.right;}
            else {
                node=node.left;
            }}
        return floor;
    }
    public Node insertNode(Node node,int target)
    {
        if(node.data>target)
        {
            node.left=insertNode(node.left,target);
            return node;
        }
        else if(node.data<=target)
        {
            Node nodeX=new Node(target);
            nodeX.left=node;
            return nodeX;
        }
        return null;
    }
    public Node deleteNode(Node node,int target)
    {
        if(node==null)
        {
          return node;
        }
       if(node.data>target)
       {
         return  node.left=deleteNode(node.left,target);
       }
       else  if(node.data<target)
       {
          return node.right=deleteNode(node.right,target);
       }
       else if(node.data==target)
       {
           if(node.right!=null&&node.left!=null)
           {
               Node temp=node.left;
             while(true)
             {
                 if(node.left==right) break;
                  node=node.right;
             }
             node.right=temp;
             return node;
           }
           return node.right;
       }
       return null;
    }
    public int lca(Node node,int a,int b)
    {
        while((node.data>a&&node.data>b)||(node.data<a&&node.data<b))
        {
          if(a>node.data)
          {
            node=node.right;
          }
          else if(a<node.data)
          {
              node=node.left;
          }
        }
        return node.data;
    }

}
