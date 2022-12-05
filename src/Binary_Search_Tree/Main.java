package Binary_Search_Tree;

public class Main {
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(5);
        root.left.left=new Node(4);
        root.left.right=new Node(7);
        root.left.right.left=new Node(6);
        root.right=new Node(12);
        root.right.left=new Node(10);
        root.right.right=new Node(14);
        root.right.right.left=new Node(13);

        System.out.println(root.findTarget(root,898));
//        System.out.println(root.ceilFind(root,11,-1));
//        System.out.println(root.ceilFindI(root,11));
//        System.out.println(root.floorFind(root,15));
//        System.out.println(root.lca(root,6,4));
    }
}
