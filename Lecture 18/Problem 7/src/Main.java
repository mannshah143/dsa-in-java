// print all the subsequences of a string (all subsequences are unique) --> time complexity = O(2^n)

public class Main {
    public static void main(String[] args) {
        String str = "abc";
        printSubseq(str, 0, "");
    }

    public static void printSubseq(String str, int idx, String subSeq) {
        if (idx == str.length()) {
            System.out.println(subSeq);
            return;
        }

        char currChar = str.charAt(idx);
        printSubseq(str, idx+1, subSeq+currChar);

        printSubseq(str, idx+1, subSeq);
    }
}