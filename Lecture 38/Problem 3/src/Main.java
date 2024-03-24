// count unique substrings of a string
// --> number of unique prefixes of all the suffixes of a string is the count of unique substrings of a string

public class Main {
    static class Node {
        Node[] children;
        boolean endOfWord;

        public Node() {
            children = new Node[26];
            for (int i=0; i<26; i++) {
                children[i] = null;
            }
            endOfWord = false;
        }
    }

    static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i=0; i<word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            if (i == word.length()-1) {
                curr.children[idx].endOfWord = true;
            }
            curr = curr.children[idx];
        }
    }

    public static boolean search(String key) {
        Node curr = root;
        for (int i=0; i<key.length(); i++) {
            int idx = key.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                return false;
            }
            if ((i == key.length() - 1) && (curr.children[idx].endOfWord == false)) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    // 3. number of nodes in trie will give the count of all the unique prefixes
    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        for (int i=0; i<26; i++) {
            if (root.children[i] != null) {
                count += countNodes(root.children[i]);
            }
        }
        return count+1;
    }

    public static void main(String[] args) {
        String str = "ababa";
        // 1. find all the possible suffixes of the string
        for (int i=0; i<str.length(); i++) {
            String suffix = str.substring(i);
            // 2. insert all the suffixes in trie
            insert(suffix);
        }
        System.out.println(countNodes(root));
    }
}