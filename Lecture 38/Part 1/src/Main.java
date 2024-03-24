// trie data structure

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

    // insert in trie --> time complexity = O(length of word)
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

    // search in trie --> time complexity = O(length of key)
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

    public static void main(String[] args) {
        String[] words = {"the", "a", "there", "their", "any"};
        for (int i=0; i< words.length; i++) {
            insert(words[i]);
        }

        System.out.println(search("their"));
        System.out.println(search("thor"));
        System.out.println(search("an"));
    }
}