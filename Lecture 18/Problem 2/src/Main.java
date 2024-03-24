// print a string in reverse --> time complexity = O(n)

public class Main {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(str);
        printInReverse(str, str.length()-1);
    }

    public static void printInReverse(String str, int idx) {
        if (idx == 0) {
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printInReverse(str, idx-1);
    }
}