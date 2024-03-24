// count total paths in a maze to move from (0,0) to (n,m) --> backtracking example

public class Main {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        System.out.println(countPaths(0, 0, n, m));
    }

    public static int countPaths(int i, int j, int n, int m) {
        // reached the end tile of the maze
        if (i == n-1 && j == m-1) {
            return 1;
        }

        // reached border of the maze
        if (i == n || j == m) {
            return 0;
        }

        // paths going in the downwards direction
        int downPaths = countPaths(i+1, j, n, m);

        // paths going in the rightwards direction
        int rightPaths = countPaths(i, j+1, n, m);

        // total paths = downward paths + rightward paths
        return downPaths + rightPaths;
    }
}