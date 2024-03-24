// hash map --> array of linked lists

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    static class HashMap<K,V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // n = number of nodes
        private int N; // N = array length = no. of buckets
        private LinkedList<Node>[] buckets;

        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i=0; i<4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            // hashing
            int bi = key.hashCode();
            return Math.abs(bi) % N; // bucket index is positive and lies between 0 to N-1
        }

        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            for (int i=0; i<ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i;
                }
            }
            return -1;
        }

        // rehashing
        private void rehash() {
            // store the old buckets
            LinkedList<Node>[] oldBucket = buckets;
            // increase the size of array
            buckets = new LinkedList[N*2];
            // create empty linked list in new buckets
            for (int i=0; i<N*2; i++) {
                buckets[i] = new LinkedList<>();
            }
            // add the linked list nodes in new buckets
            for (int i=0; i<oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for (int j=0; j<ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        // add key-value pair to hashmap
        // --> average case time complexity = O(lambda) or O(1)
        // --> worst case time complexity = O(n)
        public void put(K key, V value) {
            int bi = hashFunction(key); // bucket index
            int di = searchInLL(key, bi); // data index
            if (di == -1) { // key does not exist, add new value
                buckets[bi].add(new Node(key, value));
                n++;
            } else { // key exists, update the value
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            double lambda = (double)n/N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if (di == -1) { // key does not exist, return null
                return null;
            } else { // key exists, return the value
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if (di == -1) { // key does not exist, return false
                return false;
            } else { // key exists, return true
                return true;
            }
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if (di == -1) { // key does not exist, return null
                return null;
            } else { // key exists, remove the node and return the value
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }

        public boolean isEmpty() {
            return n == 0;
        }

        // array list of keys
        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for (int i=0; i<buckets.length; i++) { // bucket index
                LinkedList<Node> ll = buckets[i];
                for (int j=0; j<ll.size(); j++) { // data index
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }
    }
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "USA");
        map.put(2, "China");
        map.put(3, "India");

        ArrayList<Integer> keys = map.keySet();
        for (int i=0; i< keys.size(); i++) {
            System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
        }

        map.remove(2);
        System.out.println(map.containsKey(2));
    }
}