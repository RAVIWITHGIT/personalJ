/* ******************************************** Array Deque ************************************
1 Array Queue --> this array we add element from last and remove element from starting position
2.Array Deque --> we can add or remove element from starting or ending position

Summary: When to Use Each
=====> Use ArrayList:

1.When you need fast random access (index-based).
2.When you mostly add/remove elements from the end of the list.
3.When you don't need to frequently insert/remove at arbitrary positions.

=====>Use LinkedList:

1.When you frequently add/remove elements from both ends (e.g., implementing a queue or deque).
2.When you need to add/remove elements in the middle of the list.
3.When random access is not a frequent operation (since it’s slower).

======>Use ArrayDeque:

1.When you need a double-ended queue (deque) that allows fast insertion and removal from both ends.
2.When you need an efficient queue for adding/removing elements from the front and back.
3.When you don’t need thread safety and you don’t want the overhead of a doubly-linked list like in LinkedList.
 */

import java.util.ArrayDeque;
import java.util.Iterator;

public class My3ArrayDeque {
    public static void main(String args[]) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(10);
        ad1.add(20);
        ad1.add(30);
        ad1.add(40);
        ad1.add(50);

        ad1.addFirst(70);

        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
        System.out.println(ad1);

        // ** if you want iterator element in descending order
        Iterator value = ad1.descendingIterator();
        while (value.hasNext()) {
            System.out.println(value.next());
        }

        // *********** if you get head element and remove then use poll() method
        System.err.println(ad1.poll());
        System.out.println(ad1);

    }
}
