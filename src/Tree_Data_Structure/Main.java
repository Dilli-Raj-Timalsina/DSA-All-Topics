package Tree_Data_Structure;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.left.right.left=new Node(6);
        root.right=new Node(3);
        root.right.left=new Node(7);
        root.right.right=new Node(8);
        root.right.right.left=new Node(9);
        root.right.right.right=new Node(10);

//        root.preOrder(root);
//        System.out.println();
//        root.inOrder(root);
//        System.out.println();
//        root.postOrder(root);
//        System.out.println();
//        System.out.println("_______________________________________");
//        root.iterativePreInPostTraversal(root);
        root.bfs(root);

//        root.iPreOrder(root);
//        root.iInOrder(root);
//        root.iPostOrder2Stack(root);

        System.out.println(".............................");
//        System.out.println(  root.maxHeight(root));
//        root.maxHeightIterative(root);
//        System.out.println();
//        int []maxPath=new int[1];
//        System.out.println(root.pathSum(root,maxPath));
//        System.out.println(maxPath[0]);
        System.out.println("..................................");
        root.zigZag2(root);

    }
}
