import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // print a binary triangle
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows: ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                int sum = i+j;
                if (sum % 2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
}