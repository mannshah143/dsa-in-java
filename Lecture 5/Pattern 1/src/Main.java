import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // print a solid rectangle
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows: ");
        int r = sc.nextInt();
        System.out.println("enter number of columns: ");
        int c = sc.nextInt();
        for (int i=1 ; i<=r; i++) {
            for (int j=1; j<=c; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}