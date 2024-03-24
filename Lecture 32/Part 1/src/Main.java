// binary trees

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    // preorder traversal --> time complexity = O(n) --> depth first search
    // print: 1. root --> 2. left subtree --> 3. right subtree
    public static void preorderTraversal(Node rootNode) {
        if (rootNode == null) {
            return;
        }
        System.out.print(rootNode.data + " ");
        preorderTraversal(rootNode.left);
        preorderTraversal(rootNode.right);
    }

    // inorder traversal --> time complexity = O(n) --> depth first search
    // print: 1. left subtree --> 2. root --> 3. right subtree
    public static void inorderTraversal(Node rootNode) {
        if (rootNode == null) {
            return;
        }
        inorderTraversal(rootNode.left);
        System.out.print(rootNode.data + " ");
        inorderTraversal(rootNode.right);
    }

    // postorder traversal --> time complexity = O(n) --> depth first search
    // print: 1. left subtree --> 2. right subtree --> 3. root
    public static void postorderTraversal(Node rootNode) {
        if (rootNode == null) {
            return;
        }
        postorderTraversal(rootNode.left);
        postorderTraversal(rootNode.right);
        System.out.print(rootNode.data + " ");
    }

    // level order traversal --> time complexity = O(n) --> breadth first search
    public static void levelOrderTraversal(Node rootNode) {
        if (rootNode == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(rootNode);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty())
                    break;
                else
                    q.add(null);
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null)
                    q.add(currNode.left);
                if (currNode.right != null)
                    q.add(currNode.right);
            }
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}; // preorder tree
        BinaryTree binaryTree = new BinaryTree();
        Node rootNode = binaryTree.buildTree(nodes);

        System.out.println(rootNode.data);

        preorderTraversal(rootNode);
        System.out.println();

        inorderTraversal(rootNode);
        System.out.println();

        postorderTraversal(rootNode);
        System.out.println();

        levelOrderTraversal(rootNode);
        System.out.println();
    }
}