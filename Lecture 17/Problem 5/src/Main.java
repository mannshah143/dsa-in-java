public class Main {
    // print fibonacci series till n terms
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int n = 10;
        System.out.print(a + " " + b + " ");
        printSer(a, b, n-2);
    }

    public static void printSer(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        printSer(b, c, n-1);
    }
}