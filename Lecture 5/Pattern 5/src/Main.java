import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // print an inverted and rotated half pyramid
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows: ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}