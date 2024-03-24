import java.util.Arrays;

public class Main {
    public static void printArr(int arr[]) {
        for (int i=0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // bubble sort --> 0(n^2)
    public static void bubbleSort(int arr[]) {
        for (int i=0; i< arr.length-1; i++) {
            for (int j=0; j< arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArr(arr);
    }

    // selection sort --> O(n^2)
    public static void selectionSort(int arr[]) {
        for (int i=0; i< arr.length-1; i++) {
            int smallest = i;
            for (int j=i+1; j< arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
        printArr(arr);
    }

    // insertion sort --> O(n^2)
    public static void insertionSort(int arr[]) {
        for (int i=1; i< arr.length; i++) {
            int current = arr[i];
//            int j = i-1;
//            while (j>=0 && current < arr[j]) {
//                arr[j+1] = arr[j];
//                j--;
//            }
            int j;
            for (j=i-1; j>=0; j--) {
                if (current<arr[j]) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j+1] = current;
        }
        printArr(arr);
    }

    public static void divide(int arr[], int si, int ei) { // O(logn)
        if (si >= ei) {
            return;
        }
        int mid = si + (ei-si) / 2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void conquer(int arr[], int si, int mid, int ei) { // O(n)
        int merged[] = new int[ei-si+1];
        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;
        while (idx1 <= mid && idx2 <=ei) {
            if (arr[idx1] < arr[idx2]) {
                merged[x] = arr[idx1];
                x++;
                idx1++;
            }
            if (arr[idx2] < arr[idx1]) {
                merged[x] = arr[idx2];
                x++;
                idx2++;
            }
        }
        while (idx1 <= mid) {
            merged[x] = arr[idx1];
            x++;
            idx1++;
        }
        while (idx2 <= ei) {
            merged[x] = arr[idx2];
            x++;
            idx2++;
        }
        for (int i=0, j=si; i<merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pivotIdx = partition(arr, low, high);
            quickSort(arr, low, pivotIdx-1);
            quickSort(arr, pivotIdx+1, high);
        }
    }

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low-1;
        for (int j=low; j<high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        // bubbleSort(arr);
        // selectionSort(arr);
        insertionSort(arr);
        // merge sort --> O(nlogn)
        // divide(arr, 0, arr.length-1);
        // quick sort --> average case: O(nlogn), worst case: O(n^2)
        //quickSort(arr, 0, arr.length-1);
        //printArr(arr);
    }
}