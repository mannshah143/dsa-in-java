import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your name: ");
        String name = sc.next();
        printName(name);

        System.out.println("enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b);
        System.out.println("sum of two numbers is " + sum);

        System.out.println("enter two numbers: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        printProduct(m, n);

        System.out.println("enter a number: ");
        int f = sc.nextInt();
        printFactorial(f);
    }

    // function to print a name
    public static void printName(String name) {
        System.out.println(name);
        return;
    }

    // function to calculate sum
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // function to print product
    public static void printProduct(int m, int n) {
        System.out.println("product of two numbers is " + m*n);
        return;
    }

    // function to print factorial
    public static void printFactorial(int f) {
        if (f<0) {
            System.out.println("invalid number");
            return;
        } else {
            int factorial = 1;
            for (int i=1; i<=f; i++) {
                factorial = factorial * i;
            }
            System.out.println(factorial);
            return;
        }
    }
}

