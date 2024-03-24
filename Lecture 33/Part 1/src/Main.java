// binary search trees
/*
--> binary trees
--> left subtree nodes < root
    right subtree nodes > root
    left and right subtrees are also BSTs with no duplicates
--> inorder traversal of BST gives a sorted sequence
--> BST search works like binary search
    makes searching more efficient
    time complexity = O(height of BST)
*/

public class Main {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // inserting a node --> time complexity = O(height)
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

    // searching a node --> time complexity = O(height)
    public static boolean search(Node rootNode, int key) {
        if (rootNode == null) {
            return false;
        }
        if (key < rootNode.data) {
            return search(rootNode.left, key);
        } else if (key == rootNode.data) {
            return true;
        } else {
            return search(rootNode.right, key);
        }
    }

    // delete a node
    public static Node delete(Node rootNode, int val) {
        if (val < rootNode.data) {
            delete(rootNode.left, val);
        } else if (val > rootNode.data) {
            delete(rootNode.right, val);
        } else {

            // case 1 --> when node has no children (leaf node)
            // strategy --> delete node and return null to parent
            if (rootNode.left == null && rootNode.right == null) {
                return null;
            }

            // case 2 --> when node has one child
            // strategy --> delete node and replace with child node
            if (rootNode.left == null) {
                return rootNode.right;
            } else if (rootNode.right == null) {
                return rootNode.left;
            }

            // case 3 --> when node has two children
            // strategy --> replace value with inorder successor and delete the node for inorder successor
            Node IS = inOrderSuccessor(rootNode.right);
            rootNode.data = IS.data;
            rootNode.right = delete(rootNode.right, IS.data);
        }
        return rootNode;
    }

    // find inorder successor --> left most node in right subtree of node to be deleted
    //                        --> inorder successor will have none or one child
    public static Node inOrderSuccessor(Node rootNode) {
        while (rootNode.left != null) {
            rootNode = rootNode.left;
        }
        return rootNode;
    }

    // inorder traversal
    public static void inorder(Node rootNode) {
        if (rootNode == null) {
            return;
        }
        inorder(rootNode.left);
        System.out.print(rootNode.data + " ");
        inorder(rootNode.right);
    }

    public static void main(String[] args) {
        int[] values = {5, 1, 3, 4, 2, 7};
        Node rootNode = null;
        for (int i=0; i< values.length; i++) {
            rootNode = BST(rootNode, values[i]);
        }

        inorder(rootNode);
        System.out.println();

        int key = 5;
        if (search(rootNode, key))
            System.out.println("found");
        else
            System.out.println("not found");

        int val = 5;
        delete(rootNode, val);
        inorder(rootNode);
     }
}