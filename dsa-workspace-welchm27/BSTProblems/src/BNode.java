// Given a binary tree, write an algorithm that prints out all paths from
// the root to every leaf node.

/*
The binary tree has 4 root-to-leaf paths:
1 -> 2 -> 4
1 -> 2 -> 5
1 -> 3 -> 6 -> 8
1 -> 3 -> 7 -> 9
 */

import java.util.ArrayDeque;
import java.util.Deque;


public class BNode {
    private int data;

    public BNode left = null, right = null;

    public BNode(int data){
        this.data = data;
    }

    public int getData(){
        return this.data;
    }
}

class AllPathsInTree{

    public static boolean isLeaf(BNode node){
        return (node.left == null && node.right == null);
    }

    private static void printRootToLeafPaths(BNode node, Deque<Integer> path){
        if(node == null)
            return;
        path.addLast(node.getData());

        if(isLeaf(node)){
            System.out.println(path);
        }
        printRootToLeafPaths(node.left, path);
        printRootToLeafPaths(node.right, path);
        path.removeLast();
    }

    public static void printRootToLeafPaths(BNode node){
        Deque<Integer> path = new ArrayDeque<>();

        printRootToLeafPaths(node, path);
    }

    public static void main(String[] args) {
        /* Construct the following tree
                1
              /   \
             /     \
            2       3
           / \     / \
          4   5   6   7
                 /     \
                8       9
       */

        BNode root = new BNode(1);
        root.left = new BNode(2);
        root.right = new BNode(3);
        root.left.left = new BNode(4);
        root.left.right = new BNode(5);
        root.right.left = new BNode(6);
        root.right.right = new BNode(7);
        root.right.left.left = new BNode(8);
        root.right.right.right = new BNode(9);

        printRootToLeafPaths(root);


    }
}