// given an integer array of size n, find all elements that appear more than n/3 times --> time complexity = O(n)

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        majorityElement(arr);
    }

    public static void majorityElement(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i< arr.length; i++) {
            if (map.containsKey(arr[i])) { // if map contains the key
                map.put(arr[i], map.get(arr[i])+1);
            } else { // if map does not contain the key
                map.put(arr[i], 1);
            }
        }

        for (int key : map.keySet()) {
            if (map.get(key) > arr.length/3) {
                System.out.println(key);
            }
        }
    }
}