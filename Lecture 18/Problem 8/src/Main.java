// print all the subsequences of a string (all subsequences are not unique) --> time complexity = O(2^n)

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String str = "aaa";
        printSubseq(str, 0, "", set);
    }

    public static void printSubseq(String str, int idx, String subSeq, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(subSeq)) {
                return;
            } else {
                System.out.println(subSeq);
                set.add(subSeq);
                return;
            }
        }

        char currChar = str.charAt(idx);
        printSubseq(str, idx+1, subSeq+currChar, set);

        printSubseq(str, idx+1, subSeq, set);
    }
}