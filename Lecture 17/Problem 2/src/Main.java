public class Main {
    // print numbers from 1 to 5
    public static void main(String[] args) {
        int n = 1;
        printNums(n); // n=1
    }
    public static void printNums(int n) {
        if (n == 6) {
            return;
        }
        System.out.println(n);
        printNums(n+1);
    }
}