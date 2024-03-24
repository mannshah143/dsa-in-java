import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // declaration of an array
        /*
        int[] numbers = new int[5];
        int numbers[] = new int[5];
        numbers[0] = 98;
        numbers[1] = 99;
        numbers[2] = 100;
        numbers[3] = 101;
        numbers[4] = 102;
        */
        int[] numbers = {98, 99, 100, 101, 102};

        // printing the elements of an array
        /*
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        */
        for (int i=0; i<5; i++) {
            System.out.println(numbers[i]);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int size = sc.nextInt();
        int[] digits = new int[size];

        System.out.println("enter the elements of the array: ");
        for (int i=0; i<size; i++) {
            digits[i] = sc.nextInt();
        }

        System.out.println("enter the element to be searched: ");
        int x = sc.nextInt();
        for (int j=0; j<digits.length; j++) {
            if (digits[j] == x) {
                System.out.println("element found at " + j + " index");
            }
        }
    }
}