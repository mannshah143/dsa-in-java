public class Main {
    public static void main(String[] args) {
        int[] arr = {7, 8, 3, 1, 2};
        int n = arr.length;

        // selection sort --> time complexity = O(n^2)

        // number of iterations (n-1 times)
        for (int i=0; i<n-1; i++) {
            // assuming the element at index i is the smallest
            int smallest = i;
            // comparing element at index i with each element after i index (i+1 index)
            for (int j=i+1; j<n; j++) {
                // assign the value of the index of the smallest element, 'j' to 'smallest'
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            // only one swap per iteration
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}