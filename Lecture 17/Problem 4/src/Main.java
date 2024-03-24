public class Main {
    // print factorial of a number n
    public static void main(String[] args) {
        System.out.println(calcFact(5));
    }

    public static int calcFact(int n) {
        if (n==1 || n==0) {
            return 1;
        }
        int fact_n = n * calcFact(n - 1);
        return fact_n;
    }
}