// tower of hanoi --> time complexity = O(2^n)

public class Main {
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, "source", "helper", "destination");
    }

    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transferring disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("transferring disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n-1, helper, src, dest);
    }
}