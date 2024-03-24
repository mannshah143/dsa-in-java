public class Main {
    public static void main(String[] args) {
        int[] arr = {7, 8, 3, 1, 2};
        int n = arr.length;

        // bubble sort --> time complexity = O(n^2)

        // number of iterations (n-1 times)
        for (int i=0; i<n-1; i++) {
            // pushing the largest element to the end of the array in each iteration
            for (int j=0; j<n-1-i; j++) {
                // comparing two elements --> if element at j index is greater than element at j+1 index
                if (arr[j] > arr[j+1]) {
                    // swapping of two elements
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}