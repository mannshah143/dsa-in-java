// place tiles of size (1 x m) in a floor of size (n x m)

public class Main {
    public static void main(String[] args) {
        int n = 4;
        int m = 2;
        System.out.println(placeTiles(n, m));
    }

    public static int placeTiles(int n, int m) {
        if (n == m) {
            return 2;
        }

        if (n<m) {
            return 1;
        }

        // tiles placed vertically
        int vertTiles = placeTiles(n-m, m);

        // tiles placed horizontally
        int horiTiles = placeTiles(n-1, m);

        // total placements of tiles
        return vertTiles + horiTiles;
    }
}