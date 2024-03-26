import java.util.HashSet;

public class Main {
//    public static void printNto1(int n) {
//        if (n == 0) {
//            return;
//        }
//        System.out.println(n);
//        printNto1(n-1);
//    }
//
//    public static void printSumofN(int i, int n, int sum) {
//        if (i == n) {
//            sum += i;
//            System.out.println(sum);
//            return;
//        }
//        sum += i;
//        printSumofN(i+1, n, sum);
//    }
//
//    public static int factorial(int n) {
//        if (n == 1) {
//            return 1;
//        }
//        int fact_nm1 = factorial(n-1);
//        int fact_n = n * fact_nm1;
//        return fact_n;
//    }
//
//    public static void fibonacci(int a, int b, int n) {
//        if (n == 0) {
//            return;
//        }
//        int c = a + b;
//        System.out.println(c);
//        fibonacci(b, c, n-1);
//    }
//
////    public static int xPowN(int x, int n) { // O(n): height of stack
////        if (n == 0) {
////            return 1;
////        }
////        if (x == 0) {
////            return 0;
////        }
////        int xPowNm1 = xPowN(x, n-1);
////        int xPowN = x * xPowNm1;
////        return xPowN;
////    }
//
//    public static int xPowN(int x, int n) {
//        if (n == 0) {
//            return 1;
//        }
//        if (x == 0) {
//            return 0;
//        }
//        if (n%2 == 0) {
//            return xPowN(x, n/2) * xPowN(x, n/2);
//        } else {
//            return xPowN(x, n/2) * xPowN(x, n/2) * x;
//        }
//    }
//
//    public static void towerOfHanoi(int n, String source, String helper, String dest) {
//        if (n == 1) {
//            System.out.println("Transfer disk " + n + " from " + source + " to " + dest);
//            return;
//        }
//        towerOfHanoi(n-1, source, dest, helper);
//        System.out.println("Transfer disk " + n + " from " + source + " to " + dest);
//        towerOfHanoi(n-1, helper, source, dest);
//    }
//
//    public static void revString(String str, int idx) {
//        if (idx == 0) {
//            System.out.print(str.charAt(idx));
//            return;
//        }
//        System.out.print(str.charAt(idx));
//        revString(str, idx-1);
//    }
//
//    public static int first = -1;
//    public static int last = -1;
//    public static void findOccurrence(String str, int idx, char el) {
//        char currChar = str.charAt(idx);
//        if (idx == str.length()-1) {
//            System.out.println(first);
//            System.out.println(last);
//            return;
//        }
//        if (currChar == el) {
//            if (first == -1) {
//                first = idx;
//            } else {
//                last = idx;
//            }
//        }
//        findOccurrence(str, idx+1, el);
//    }
//
//    public static boolean strictlyIncreasing(int[] arr, int idx) {
//        if (idx == arr.length-1) {
//            return true;
//        }
//        if (arr[idx] < arr[idx+1]) {
//            return strictlyIncreasing(arr, idx+1);
//        } else {
//            return false;
//        }
//    }
//
//    public static void moveAllX(String str, int idx, int count, String newStr) {
//        if (idx == str.length()) {
//            for (int i=0; i<count; i++) {
//                newStr += 'x';
//            }
//            System.out.println(newStr);
//            return;
//        }
//        char currChar = str.charAt(idx);
//        if (currChar == 'x') {
//            moveAllX(str, idx+1, count+1, newStr);
//        } else {
//            newStr += currChar;
//            moveAllX(str, idx+1, count, newStr);
//        }
//    }
//
//    public static boolean[] map = new boolean[26];
//    public static void removeDuplicates(String str, int idx, String newStr) {
//        if (idx == str.length()) {
//            System.out.println(newStr);
//            return;
//        }
//        char currChar = str.charAt(idx);
//        if (map[currChar - 'a']) {
//            removeDuplicates(str, idx+1, newStr);
//        } else {
//            newStr += currChar;
//            map[currChar - 'a'] = true;
//            removeDuplicates(str, idx+1, newStr);
//        }
//    }
//
//    public static void subsequences(String str, int idx, String subs) {
//        if (idx == str.length()) {
//            System.out.println(subs);
//            return;
//        }
//        char currChar = str.charAt(idx);
//        // character is included
//        subsequences(str, idx+1, subs+currChar);
//
//        // character is not included
//        subsequences(str, idx+1, subs);
//    }
//
//    public static HashSet<String> set = new HashSet<>();
//    public static void uniqueSubsequences(String str, int idx, String subs) {
//        if (idx == str.length()) {
//            // hashset to keep track of unique subsequences
//            if (!set.contains(subs)) {
//                System.out.println(subs);
//                set.add(subs);
//                return;
//            }
//            return;
//        }
//        char currChar = str.charAt(idx);
//        // character is included
//        uniqueSubsequences(str, idx+1, subs+currChar);
//
//        // character is not included
//        uniqueSubsequences(str, idx+1, subs);
//    }
//
//    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
//    public static void keypadCombinations(String str, int idx, String combs) {
//        if (idx == str.length()) {
//            System.out.println(combs);
//            return;
//        }
//        char currChar = str.charAt(idx);
//        String mapping = keypad[currChar - '0'];
//
//        for (int i=0; i<mapping.length(); i++) {
//            keypadCombinations(str, idx+1, combs+mapping.charAt(i));
//        }
//    }

    public static void printNto1(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNto1(n-1);
    }

    public static void printSum(int n, int sum) {
        if (n == 0) {
            System.out.println(sum);
            return;
        }
        sum += n;
        printSum(n-1, sum);
    }

    public static void printFactorial(int n, int fact) {
        if (n == 1 || n == 0) {
            fact *= 1;
            System.out.println(fact);
            return;
        }
        fact *= n;
        printFactorial(n-1, fact);
    }

    public static void printFibonacciIter(int n) {
//        int num1 = 0;
//        System.out.println(num1);
//        int num2 = 1;
//        System.out.println(num2);
//        for (int i=0; i<n-1; i++) {
//            int num3 = num1 + num2;
//            System.out.println(num3);
//            num1 = num2;
//            num2 = num3;
//        }
        int num1 = 0;
        int num2 = 1;
        for (int i=0; i<n; i++) {
            System.out.println(num1);
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }

    public static void printFibonacciRec(int a, int b, int n) {
//        if (n == 0) {
//            return;
//        }
//        int c = a + b;
//        System.out.println(c);
//        printFibonacciRec(b, c, n-1);
        if (n == 0) {
            return;
        }
        System.out.println(a);
        int c = a + b;
        printFibonacciRec(b, c, n-1);
//        System.out.println(a);
    }

    

    public static void main(String[] args) {
//        printNto1(5);
//        printSumofN(1, 5, 0);
//        System.out.println(factorial(5));
//        fibonacci(0, 1, 5);
//        System.out.println(xPowN(2, 10));
//        System.out.println(xPowN(2, 10));
//        towerOfHanoi(3, "S", "H", "D");
//        String str = "abcdefgh";
//        revString(str, str.length()-1);
//        findOccurrence("abaacdaefaah", 0, 'a');
//        int[] arr = {1,2,3,4,4,6,9};
//        System.out.println(strictlyIncreasing(arr, 0));
//        moveAllX("axbcxxd", 0, 0, "");
//        removeDuplicates("abbccda", 0, "");
//        subsequences("abc", 0, "");
//        uniqueSubsequences("aaa", 0, "");
//        keypadCombinations("23", 0, "");
//        printNto1(5);
//        printSum(5, 0);
//        printFactorial(5, 1);
//        printFibonacciIter(10);
//        printFibonacciRec(0, 1, 5);
    }
}