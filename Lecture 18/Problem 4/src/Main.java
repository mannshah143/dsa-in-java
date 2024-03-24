// check if an array is strictly increasing --> time complexity = O(n)

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(incArray(arr, 0));
    }

    public static boolean incArray(int[] arr, int idx) {
        if (idx == arr.length-1) {
            return true;
        }
        if (arr[idx] < arr[idx+1]) {
            return incArray(arr, idx+1);
        } else {
            return false;
        }
    }
}