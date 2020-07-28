package com.prep.interviews.trees;

public class TreeSwap {
    //07-16-2020
    //Ebay

    // A Binary Tree Node
    static class Node {
        int data;
        Node left, right;
    }

    ;

    // function to create a new tree node
    static Node newNode(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.left = temp.right = null;
        return temp;
    }


    // A utility function swap left- node & right node of tree
    // of every k'th level
    static void swapEveryKLevelUtil(Node current, int level, int k) {
        // base case
        if (current == null ||
                (current.left == null && current.right == null))
            return;

        //if current level + 1 is present in swap vector
        //then we swap left & right node
        if ((level + 1) % k == 0) {
            Node temp = current.left;
            current.left = current.right;
            current.right = temp;
        }

        // Recur for left and right subtrees
        swapEveryKLevelUtil(current.left, level + 1, k);
        swapEveryKLevelUtil(current.right, level + 1, k);
    }

    // This function mainly calls recursive function
    // swapEveryKLevelUtil()
    static void swapEveryKLevel(Node root, int k) {
        // call swapEveryKLevelUtil function with
        // initial level as 1.
        swapEveryKLevelUtil(root, 1, k);
    }

    // Utility method for inorder tree traversal
    static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Driver Code
    public static void main(String args[]) {
        /* before swap
              1
           /    \
          2      3
         /      / \
        4      7  8
        */

        /* after swap
              1
           /    \
          3      2
         /  \   / \
        7    8  4
        */

        Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(4);
        root.right.right = newNode(8);
        root.right.left = newNode(7);

        int k = 2;
        System.out.println("Before swap node :");
        inorder(root);

        swapEveryKLevel(root, k);

        System.out.println("\nAfter swap Node :");
        inorder(root);
    }
}
