// binary search trees --> print all root to leaf paths

import java.util.ArrayList;

public class Main {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node BST(Node rootNode, int val) {
        if (rootNode == null) {
            rootNode = new Node(val);
            return rootNode;
        }
        if (val < rootNode.data) {
            // left subtree
            rootNode.left = BST(rootNode.left, val);
        } else {
            // right subtree
            rootNode.right = BST(rootNode.right, val);
        }
        return rootNode;
    }

    public static void inorder(Node rootNode) {
        if (rootNode == null) {
            return;
        }
        inorder(rootNode.left);
        System.out.print(rootNode.data + " ");
        inorder(rootNode.right);
    }

    public static void rootToLeaf(Node rootNode, ArrayList<Integer> path) {
        if (rootNode == null) {
            return;
        }
        
        path.add(rootNode.data);

        if (rootNode.left == null && rootNode.right == null) {
            printPath(path);
        } else {
            rootToLeaf(rootNode.left, path);
            rootToLeaf(rootNode.right, path);
        }
        path.remove(path.size()-1);
    }

    public static void printPath(ArrayList<Integer> path) {
        for (int i=0; i<path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int[] values = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node rootNode = null;
        for (int i=0; i< values.length; i++) {
            rootNode = BST(rootNode, values[i]);
        }

        inorder(rootNode);
        System.out.println();

        rootToLeaf(rootNode, new ArrayList<>());
    }
}