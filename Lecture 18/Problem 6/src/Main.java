// remove duplicates in a string --> time complexity = O(n)

public class Main {
    public static void main(String[] args) {
        String str = "abbccda";
        removeDuplicate(str, 0, "");
    }

    public static boolean[] map = new boolean[26];
    public static void removeDuplicate(String str, int idx, String newStr) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        if (map[str.charAt(idx) - 'a']) {
            removeDuplicate(str, idx+1, newStr);
        } else {
            newStr += str.charAt(idx);
            map[str.charAt(idx) - 'a'] = true;
            removeDuplicate(str, idx+1, newStr);
        }
    }
}