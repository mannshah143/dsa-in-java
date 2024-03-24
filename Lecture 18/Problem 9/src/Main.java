// print keypad combination --> time complexity = O(4^n)

public class Main {
    public static void main(String[] args) {
        String str = "23";
        keypadComb(str, 0, "");
    }

    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void keypadComb(String str, int idx, String comb) {
        if (idx == str.length()) {
            System.out.println(comb);
            return;
        }

        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];

        for (int i=0; i<mapping.length(); i++) {
            keypadComb(str, idx+1, comb+mapping.charAt(i));
        }
    }
}