package Tree_Data_Structure;

import java.util.*;

public class MainOfNodee {
    public static void main(String[] args) {
        Nodee root=new Nodee(1);
        root.left= new Nodee(2);
        root.left.left=new Nodee(4);
        root.left.right=new Nodee(5);
        root.right=new Nodee(3);
        root.right.left=new Nodee(6);
        root.right.right=new Nodee(7);

        for (int i = 0; i <3; i++) {
            System.out.println(Arrays.toString(root.zigZag2(root).get(i)));
        }
       root.bfs(root);
    }
}
