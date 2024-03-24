import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    // dsa sheet question: Find Pair with Sum in Sorted & Rotated Array
    public static boolean findPairSum (int[] nums, int sum) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        right = left - 1;

        while (left != right) {
            if (nums[right] + nums[left] == sum) {
                return true;
            } else if (nums[right] + nums[left] > sum) {
                right = (right - 1 + n) % n;
            } else {
                left = (left + 1) % n;
            }
        }
        return false;
    }

    // dsa sheet question: Find minimum number of merge operations to make an array palindrome
    public static int minOps(int arr[]) {
        int ops = 0;
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while (i <= j) {
            if (arr[i] == arr[j]) {
                i++;
                j--;
            } else if (arr[i] < arr[j]) {
                i++;
                arr[i] += arr[i-1];
                ops++;
            } else {
                j--;
                arr[j] += arr[j+1];
                ops++;
            }
        }
        return ops;
    }

    public static void isAnagram(String s, String t) {
        char[] sTemp = s.toCharArray();
        Arrays.sort(sTemp);
        String sNewStr = new String(sTemp);
        System.out.println(sNewStr);
        char[] tTemp = t.toCharArray();
        Arrays.sort(tTemp);
        String tNewStr = new String(tTemp);
        System.out.println(tNewStr);
        System.out.println(sNewStr.equals(tNewStr));
    }

    public static void printDuplicates(String s) {
//        int[] arr = new int[26];
//        for (int i=0; i<s.length(); i++) {
//            char c = s.charAt(i);
//            arr[c - 'a']++;
//        }
//        for (int i=0; i< arr.length; i++) {
//            if (arr[i] > 1) {
//                char c = (char)(i + 'a');
//                System.out.println(c + ", count = " + arr[i]);
//            }
//        }

        char[] carr = s.toCharArray();
        Arrays.sort(carr);
        String sortedStr = new String(carr);
        for (int i=0; i<sortedStr.length()-1; i++) {
            int count = 1;

            while (i < sortedStr.length() - 1 && sortedStr.charAt(i) == sortedStr.charAt(i+1)) {
                count++;
                i++;
            }
            if (count > 1) {
                System.out.println(sortedStr.charAt(i) + " " + count);
            }
        }
    }

    // dsa sheet question: Permute two arrays such that sum of every pair is greater or equal to K
    public static boolean isPossible (int[] a, int[] b, int k) {
        Arrays.sort(a);
        Arrays.sort(b);
        int n = a.length;
        for (int i=0; i<n/2; i++) {
            int temp = b[i];
            b[i] = b[n-i-1];
            b[n-i-1] = temp;
        }
        for (int i=0; i<n; i++) {
            if (a[i] + b[i] < k) {
                return false;
            }
        }
        return true;
    }

    // dsa sheet question: count sort
    public static void countSort(int[] arr) {
        int n = arr.length;
        // given input array
        System.out.println(Arrays.toString(arr));
        // finding the maximum element in the input array
        int max = arr[0];
        for (int i=0; i<n; i++) {
            max = Math.max(max, arr[i]);
        }
        // initializing a new array to store the count of each element
        int[] countArr = new int[max+1];
        // finding the frequency of each element
        for (int i=0; i<n; i++) {
            countArr[arr[i]]++;
        }
        System.out.println(Arrays.toString(countArr));
        // finding the (last-1) position of each element in the sorted array
        for (int i=1; i< countArr.length; i++) {
            countArr[i] += countArr[i - 1];
        }
        System.out.println(Arrays.toString(countArr));
        // sorting the array
        int[] sortedArr = new int[n];
        for (int i=n-1; i>=0; i--) {
            countArr[arr[i]]--;
            sortedArr[countArr[arr[i]]] = arr[i];
        }
        System.out.println(Arrays.toString(sortedArr));
        // copying sorted array to input array
        for (int i=0; i<n; i++) {
            arr[i] = sortedArr[i];
        }
        System.out.println(Arrays.toString(arr));
    }

    // dsa sheet question: find common elements in three sorted arrays
    public static void printCommon(int[] arr1, int[] arr2, int[] arr3) {
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else {
                k++;
            }
        }
    }

    // dsa sheet question: ceiling in a sorted array
    public static int findFloor(int[] nums, int x) {
        int n = nums.length;
        if (x < nums[0]) {
            return -1;
        }
        int l = 0;
        int r = n-1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == x) {
                return mid;
            } else if (nums[mid] < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    public static void multiplyMatrix(int row1, int col1, int A[][], int row2, int col2, int B[][]) {
        if (row2 != col1) {
            System.out.println("multiplication not possible");
            return;
        }
        int[][] C = new int[row1][col2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < row2; k++)
                    C[i][j] += A[i][k] * B[k][j];
            }
        }
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        int[] nums = {11, 15, 6, 8, 9, 10};
//        int sum = 16;
//        System.out.println(findPairSum(nums, sum));
//        int[] arr = {1, 4, 5, 1};
//        System.out.println(minOps(arr));
//        String s = "anagram";
//        String t = "nagaram";
//        isAnagram(s, t);
//        String s = "geeksforgeeks";
//        printDuplicates(s);
//        int[] a= {2, 1, 3};
//        int[] b = {7, 8, 9};
//        int k = 10;
//        System.out.println(isPossible(a, b, k));
//        int[] arr = {1, 3, 2, 3, 4, 1, 6, 4, 3};
//        countSort(arr);
//        int[] arr1 = {1, 5, 5};
//        int[] arr2 = {3, 4, 5, 5, 10};
//        int[] arr3 = {5, 5, 10, 20};
//        printCommon(arr1, arr2, arr3);
//        int[] nums = {1,2,8,10,10,12,19};
//        int x = 5;
//        System.out.println(findFloor(nums, x));
//        String s = "dog cat cat dog";
//        String[] arr = s.split(" ");
//        System.out.println(Arrays.toString(arr));
        int row1 = 4, col1 = 3, row2 = 3, col2 = 4;
        int A[][] = { { 1, 1, 1 },
                      { 2, 2, 2 },
                      { 3, 3, 3 },
                      { 4, 4, 4 } };
        int B[][] = { { 1, 1, 1, 1 },
                      { 2, 2, 2, 2 },
                      { 3, 3, 3, 3 } };
        multiplyMatrix(row1, col1, A, row2, col2, B);
    }
}

