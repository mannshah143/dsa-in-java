// linked list using collections framework

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        // adding elements to the beginning of linked list
        list.addFirst("a");
        list.addFirst("is");
        // printing the linked list
        System.out.println(list);

        // adding elements at the end of linked list
        list.add("list"); // list.addLast("list");
        System.out.println(list);

        list.addFirst("this");
        System.out.println(list);

        // printing a linked list
        for (int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");

        // deleting the first element of linked list
        list.removeFirst();
        System.out.println(list);

        // deleting the last element of linked list
        list.removeLast();
        System.out.println(list);

        // deleting an element at a particular index
        list.remove(1);
        System.out.println(list);
    }
}