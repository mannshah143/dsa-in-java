public class Main {
    // print numbers from 5 to 1
    public static void main(String[] args) {
        // initialisation condition
        int n = 5;
        printNums(n); // n=5
    }

    public static void printNums(int n) {
        // base condition
        if (n==0) {
            return;
        }
        // work to be performed
        System.out.println(n);
        // recursively calling the function
        printNums(n-1);
    }
}