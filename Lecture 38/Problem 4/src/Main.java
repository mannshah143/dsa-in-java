// longest word with all prefixes --> find the longest string in words[] such that every prefix of the string is also in words[]

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

    public static String ans = "";

    public static void longestWord(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }

        for (int i=0; i<26; i++) {
            if (root.children[i] != null && root.children[i].endOfWord == true) {
                temp.append((char)(i+'a'));
                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }

    public static void main(String[] args) {
        String[] words = {"a", "banana", "app", "appl", "ap", "apply" ,"apple"};
        for (int i=0; i< words.length; i++) {
            insert(words[i]);
        }

        longestWord(root, new StringBuilder());
        System.out.println(ans);
    }
}