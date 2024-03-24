import com.sun.source.tree.Tree;

import java.util.Collection;
import java.util.Iterator;
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
        public static Node buildTree(int nodes[]) {
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

    public static void preorder(Node rootNode) {
        if (rootNode == null) {
            return;
        }
        System.out.print(rootNode.data + " ");
        preorder(rootNode.left);
        preorder(rootNode.right);
    }

    public static void inorder(Node rootNode) {
        if (rootNode == null) {
            return;
        }
        inorder(rootNode.left);
        System.out.print(rootNode.data + " ");
        inorder(rootNode.right);
    }

    public static void postorder(Node rootNode) {
        if (rootNode == null) {
            return;
        }
        postorder(rootNode.left);
        postorder(rootNode.right);
        System.out.print(rootNode.data + " ");
    }

    public static void levelorder(Node rootNode) {
        Queue<Node> q = new LinkedList<>();
        q.add(rootNode);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static int countOfNodes(Node rootNode) {
        if (rootNode == null) {
            return 0;
        }
        int leftCount = countOfNodes(rootNode.left);
        int rightCount = countOfNodes(rootNode.right);
        return leftCount + rightCount + 1;
    }

    public static int sumOfNodes(Node rootNode) {
        if (rootNode == null) {
            return 0;
        }
        int leftSum = sumOfNodes(rootNode.left);
        int rightSum = sumOfNodes(rootNode.right);
        return leftSum + rightSum + rootNode.data;
    }

    public static int heightOfTree(Node rootNode) {
        if (rootNode == null) {
            return 0;
        }
        int leftHeight = heightOfTree(rootNode.left);
        int rightHeight = heightOfTree(rootNode.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static int diameter1(Node rootNode) {
        if (rootNode == null) {
            return 0;
        }
        int diam1 = diameter1(rootNode.left);
        int diam2 = diameter1(rootNode.right);
        int diam3 = heightOfTree(rootNode.left) + heightOfTree(rootNode.left) + 1;
        return Math.max(Math.max(diam1, diam2), diam3);
    }

    static class TreeInfo {
        int height;
        int diameter;

        TreeInfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    public static TreeInfo diameter2(Node rootNode) {
        if (rootNode == null) {
            return new TreeInfo(0, 0);
        }
        TreeInfo leftInfo = diameter2(rootNode.left);
        TreeInfo rightInfo = diameter2(rootNode.right);

        int height = Math.max(leftInfo.height, rightInfo.height) + 1;
        int diam1 = leftInfo.diameter;
        int diam2 = rightInfo.diameter;
        int diam3 = leftInfo.height + rightInfo.height + 1;
        int diameter = Math.max(Math.max(diam1, diam2), diam3);
        TreeInfo info = new TreeInfo(height, diameter);
        return info;
    }


    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node rootNode = tree.buildTree(nodes);
//        System.out.println(rootNode.data);
//        preorder(rootNode);
//        System.out.println();
//        inorder(rootNode);
//        System.out.println();
//        postorder(rootNode);
//        System.out.println();
//        levelorder(rootNode);
//        System.out.println(countOfNodes(rootNode));
//        System.out.println(sumOfNodes(rootNode));
//        System.out.println(heightOfTree(rootNode));
//        System.out.println(diameter1(rootNode));
//        System.out.println(diameter2(rootNode).diameter);
    }
}