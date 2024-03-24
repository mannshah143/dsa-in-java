// print all the subsets of a set of first n natural numbers --> time complexity = O(2^n)

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset);
    }

    public static void findSubsets(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printSubsets(subset);
            return;
        }

        // if the element is added to the subset
        subset.add(n);
        findSubsets(n-1, subset);

        // if the element is not added to the subset
        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);
    }

    public static void printSubsets(ArrayList<Integer> subset) {
        for (int i=0; i<subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }
}