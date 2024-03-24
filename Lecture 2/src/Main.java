import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.print("Hello World!\n");
        System.out.print("Hello World!\n\n");

        Scanner sc = new Scanner(System.in);
        System.out.println("sum of two numbers: ");
        String output = sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(output + " " + sum);
    }
}