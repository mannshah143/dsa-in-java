import java.util.ArrayList;
import java.util.Collections;

public class Main {
    // Array Lists
    // --> time complexity to insert an element = O(n)
    // --> time complexity to search an element = O(1)
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        /*
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
        */

        // add elements
        list.add(4);
        list.add(6);
        list.add(8);
        System.out.println(list);

        // get elements
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        // add element in between
        list.add(1, 10);
        System.out.println(list);

        // set element or change element
        list.set(3, 2);
        System.out.println(list);

        // remove element or delete element
        list.remove(2);
        System.out.println(list);

        // size of the array list
        System.out.println(list.size());

        // traversing through an array list
        for (int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // sorting an array list
        Collections.sort(list);
        System.out.println(list);

        // clearing or deleting all the elements
        list.clear();
        System.out.println(list);
    }
}