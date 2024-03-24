import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // print a solid rhombus
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows: ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}