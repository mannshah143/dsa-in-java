import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // program to check adult or not using if else statements
        System.out.println("enter your age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("you are an adult");
        } else {
            System.out.println("you are not an adult");
        }

        // program to check even or odd using if else statements
        System.out.println("enter a number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }

        // program to compare two numbers using else-if statements
        System.out.println("enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("a and b are equal");
        } else if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is less than b");
        }

        // program to print greetings using switch case statements
        System.out.println("enter a language: ");
        String lang = sc.next();
        switch (lang) {
            case "english" : System.out.println("hello");
            break;
            case "hindi" : System.out.println("namaste");
            break;
            case "french" : System.out.println("bonjour");
            break;
            default : System.out.println("invalid language");
        }
    }
}