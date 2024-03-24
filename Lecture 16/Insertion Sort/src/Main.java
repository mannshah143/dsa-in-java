public class Main {
    public static void main(String[] args) {
        int[] arr = {7, 8, 3, 1, 2};
        int n = arr.length;

        // insertion sort --> time complexity = O(n^2)

        // number of iterations (n-1 times) on the unsorted part starting from index 1
        for (int i=1; i<n; i++) {
            // current --> first element of unsorted part
            int current = arr[i];
            // j --> index of last element of sorted part
            int j = i-1;
            while (j>=0 && current < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            // inserting the current element at its place in the sorted part
            arr[j+1] = current;
        }
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}