import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        // get bit
        int n = sc.nextInt();
        int pos = sc.nextInt();
        int bitMask = 1 << pos;

        if ((bitMask & n) == 0) {
            System.out.println("bit was zero");
        } else {
            System.out.println("bit was one");
        }
        */

        /*
        // set bit (change bit to 1)
        int n = sc.nextInt();
        int pos = sc.nextInt();
        int bitMask = 1 << pos;

        int newNum = bitMask | n;
        System.out.println(newNum);
        */

        /*
        // clear bit (change bit to 0)
        int n = sc.nextInt();
        int pos = sc.nextInt();
        int bitMask = 1 << pos;

        int newNum = ~(bitMask) & n;
        System.out.println(newNum);
        */

        // update bit
        int n = sc.nextInt();
        int pos = sc.nextInt();
        int bitMask = 1 << pos;
        int oper = sc.nextInt(); // 1 --> set bit, 0 --> clear bit

        if (oper == 1) {
            // set bit
            int newNum = bitMask | n;
            System.out.println(newNum);
        } else {
            // clear bit
            int newNum = ~(bitMask) & n;
            System.out.println(newNum);
        }
    }
}