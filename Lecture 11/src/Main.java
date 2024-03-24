import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows and columns in the 2D array: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];

        System.out.println("enter the elements of the array: ");
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("the elements are: ");
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("enter the element to be searched: ");
        int x = sc.nextInt();

        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                if (matrix[i][j] == x)
                    System.out.println("element found at index (" + i + "," + j + ")");
            }
        }
    }
}