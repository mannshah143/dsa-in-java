import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // print a butterfly pattern
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows: ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for (int j=1; j<=(2*(n-i)); j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n; i>=1; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for (int j=1; j<=(2*(n - i)); j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}