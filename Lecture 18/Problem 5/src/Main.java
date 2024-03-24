// move all x to end of the string --> time complexity = O(n)

public class Main {
    public static void main(String[] args) {
        String str = "axbcxxd";
        moveAllX(str, 0, 0, "");
    }

    public static void moveAllX(String str, int idx, int count, String newStr) {
        if (idx == str.length()) {
            for (int i=0; i<count; i++) {
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }
        if (str.charAt(idx) == 'x') {
            count ++;
            moveAllX(str, idx+1, count, newStr);
        } else {
            newStr += str.charAt(idx);
            moveAllX(str, idx+1, count, newStr);
        }
    }
}