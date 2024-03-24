public class Main {
    // print x^n (stack height = log n)
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
        if (n % 2 == 0) {
            int xPown = calcPow(x, n/2) * calcPow(x, n/2);
            return xPown;
        } else {
            int xPown = calcPow(x, n/2) * calcPow(x, n/2) * x;
            return xPown;
        }
    }
}