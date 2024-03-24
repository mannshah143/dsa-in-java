public class Main {
    // print x^n (stack height = n)
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(calcPow(x, n));
    }

    public static int calcPow(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        int xPown = x * calcPow(x, n-1);
        return xPown;
    }
}