// binary search trees --> print in range

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

    // inorder traversal
    public static void inorder(Node rootNode) {
        if (rootNode == null) {
            return;
        }
        inorder(rootNode.left);
        System.out.print(rootNode.data + " ");
        inorder(rootNode.right);
    }

    public static void printInRange(Node rootNode, int x, int y) {
        if (rootNode == null) {
            return;
        }
        if (rootNode.data >= x && rootNode.data <= y) {
            printInRange(rootNode.left, x, y);
            System.out.print(rootNode.data + " ");
            printInRange(rootNode.right, x, y);
        } else if (rootNode.data >= y) {
            printInRange(rootNode.left, x, y);
        } else {
            printInRange(rootNode.right, x, y);
        }
    }

    public static void main(String[] args) {
        int[] values = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node rootNode = null;
        for (int i=0; i< values.length; i++) {
            rootNode = BST(rootNode, values[i]);
        }

        inorder(rootNode);
        System.out.println();

        printInRange(rootNode, 3, 10);
    }
}