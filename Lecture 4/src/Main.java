import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // program to print numbers from 0 to 10 using for loop
        System.out.println("for loop: ");
        for (int counter = 0; counter < 11; counter++) {
            System.out.println(counter);
        }
        System.out.println();

        // program to print numbers from 0 to 10 using while loop
        System.out.println("while loop: ");
        int i = 0;
        while (i < 11) {
            System.out.println(i);
            i++;
        }
        System.out.println();

        // program to print numbers from 0 to 10 using do while loop
        System.out.println("do while loop: ");
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 11);
        System.out.println();

        // while vs do while loop using a false condition
        int num = 12;
        while (num < 11) {
            System.out.println("this is a while loop");
        }
        do {
            System.out.println("this is a do while loop");
        } while (num < 11);
        System.out.println();

        // program to print first n natural numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int k = 1; k <= n; k++) {
            sum = sum + k;
        }
        System.out.println(sum);

        // program to print multiplication table of a given number
        System.out.println("enter a number: ");
        int mul = sc.nextInt();
        for (int m = 1; m <= 10; m++) {
            int product = mul * m;
            System.out.println(product);
        }
    }
}