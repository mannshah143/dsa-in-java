// print all permutations of a string --> time complexity = O(n!)

public class Main {
    public static void main(String[] args) {
        String str = "abc";
        printPerm(str, "");
    }

    public static void printPerm(String str, String perm) {
        if (str.length() == 0) {
            System.out.println(perm);
        }
        for (int i=0; i<str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPerm(newStr, perm+currChar);
        }
    }
}