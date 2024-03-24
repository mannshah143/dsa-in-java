// hash maps --> unordered maps

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // integer key (roll no.), string value (name)
        HashMap<Integer, String> map = new HashMap<>();

        // insert new key and value
        map.put(86, "lily");
        map.put(87, "marshall");
        map.put(88, "robin");
        map.put(89, "ted");
        map.put(90, "barney");

        System.out.println(map);

        // update value of existing key
        map.put(88, "tracy");
        System.out.println(map);

        // search --> returns true of false
        if (map.containsKey(90)) {
            System.out.println("key is present");
        } else {
            System.out.println("key is not present");
        }

        if (map.containsKey(91)) {
            System.out.println("key is present");
        } else {
            System.out.println("key is not present");
        }

        // return value assigned to the key
        System.out.println(map.get(90));
        System.out.println(map.get(91));

        // delete a pair from the map
        map.remove(90);
        System.out.println(map);

        // iterate through a map using enhanced for loop
        // method 1
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
        System.out.println();
        // method 2
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.println(key + " = " + map.get(key));
        }
        System.out.println();
    }
}