import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username = "Mann143";
        System.out.println(username);

        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("Enter your full name: ");
        String firstName = sc.next();
        System.out.println(firstName);
        */
        System.out.println("Enter your full name: ");
        String fullName = sc.nextLine();
        System.out.println(fullName);

        String fName = "Ted";
        String lName = "Mosby";
        String name = fName + " " + lName;
        // concatenation of strings
        System.out.println(name);
        // length of a string
        System.out.println("length of the name = " + name.length());
        // character at a particular index in a string
        for (int i=0; i<name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        // comparing two strings
        String name1 = "marshall";
        String name2 = "marshall";
        if (name1.compareTo(name2) == 0) {
            System.out.println("strings are equal");
        } else {
            System.out.println("strings are not equal");
        }

        // substrings
        String sentence = "my name is barney";
        String nam = sentence.substring(11, sentence.length());
        System.out.println("first name is " + nam);
    }
}