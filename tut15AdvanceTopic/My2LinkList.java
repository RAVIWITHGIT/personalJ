/* *************************************** LinkList ********************************************
1. LinkList similar to arraylist
2. some new method available in LinkList which not present in arrayList
3. performance by it good apart from arraylist 
 * 
 */

import java.util.LinkedList;

public class My2LinkList {
    public static void main(String args[]) {
        LinkedList<Integer> li = new LinkedList<Integer>();
        li.add(11);
        li.add(12);
        li.add(13);
        li.add(14);

        // add element in last
        li.addLast(120);

        // add element in starting position
        li.addFirst(200);

        // print head of the list
        System.out.println(li.element());

        // print head of the list
        System.out.println(li.peek());

        System.out.println(li);

        for (int i = 0; i < li.size(); i++) {
            System.out.print(li.get(i) + " ");
        }

    }
}
