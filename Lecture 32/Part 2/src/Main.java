// binary trees

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

    // count the number of nodes --> time complexity = O(n)
    public static int countNodes(Node rootNode) {
        if (rootNode == null) {
            return 0;
        }
        int leftNodes = countNodes(rootNode.left);
        int rightNodes = countNodes(rootNode.right);
        return leftNodes + rightNodes + 1;
    }

    // sum of nodes --> time complexity = O(n)
    public static int sumOfNodes(Node rootNode) {
        if (rootNode == null) {
            return 0;
        }
        int leftSum = sumOfNodes(rootNode.left);
        int rightSum = sumOfNodes(rootNode.right);
        return leftSum + rightSum + rootNode.data;
    }

    // height of a tree --> time complexity = O(n)
    public static int heightOfTree(Node rootNode) {
        if (rootNode == null) {
            return 0;
        }
        int leftHeight = heightOfTree(rootNode.left);
        int rightHeight = heightOfTree(rootNode.right);
        int height = Math.max(leftHeight, rightHeight) + 1;
        return height;
    }

    // diameter of a tree (approach 1) --> time complexity = O(n^2)
    public static int diameter1(Node rootNode) {
        if (rootNode == null) {
            return 0;
        }
        int diam1 = diameter1(rootNode.left);
        int diam2 = diameter1(rootNode.right);
        int diam3 = heightOfTree(rootNode.left) + heightOfTree(rootNode.right) + 1;

        int diam = Math.max(diam3, Math.max(diam1, diam2));
        return diam;
    }

    static class TreeInfo {
        int ht;
        int diamet;

        TreeInfo(int ht, int diamet) {
            this.ht = ht;
            this.diamet = diamet;
        }
    }

    // diameter of a tree (approach 2) --> time complexity = O(n)
    public static TreeInfo diameter2(Node rootNode) {
        if (rootNode == null) {
            return new TreeInfo(0,0);
        }
        TreeInfo left = diameter2(rootNode.left);
        TreeInfo right = diameter2(rootNode.right);

        int height = Math.max(left.ht, right.ht) + 1;

        int diamet1 = left.diamet;
        int diamet2 = right.diamet;
        int diamet3 = left.ht + right.ht + 1;

        int diamet = Math.max(diamet3, Math.max(diamet1, diamet2));
        return new TreeInfo(height, diamet);
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree binaryTree = new BinaryTree();
        Node rootNode = binaryTree.buildTree(nodes);
        System.out.println(countNodes(rootNode));
        System.out.println(sumOfNodes(rootNode));
        System.out.println(heightOfTree(rootNode));
        System.out.println(diameter1(rootNode));
        System.out.println(diameter2(rootNode).diamet);
    }
}