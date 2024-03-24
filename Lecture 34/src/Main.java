// hash set

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // create
        HashSet<Integer> set = new HashSet<>();

        // insert --> time complexity = O(1)
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);

        // search --> time complexity = O(1)
        if (set.contains(1)) {
            System.out.println("set contains the element");
        }
        if (!set.contains(5)) {
            System.out.println("set does not contain the element");
        }

        // delete --> time complexity = O(1)
        set.remove(1);
        if (!set.contains(1)) {
            System.out.println("element deleted");
        }

        // size of a set
        System.out.println("size of the set: " + set.size());

        // print all elements in the set
        System.out.println(set);

        // iterator
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}