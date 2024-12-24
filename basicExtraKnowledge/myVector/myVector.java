package basicExtraKnowledge.myVector;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class myVector {
    public static void main(String args[]) {
        Vector<Object> v = new Vector<>();
        System.out.println(v);

        // ***** */ we can add element by add() and addElement() method
        // v.add("ravi");
        // v.addElement(11.4);
        // System.out.println(v);

        // ***** by default capacity of vector is 10
        // System.out.println(v.capacity());

        // ***** if we add 11 element then capacity increase by 10;
        // System.out.println(v.capacity());
        // for (int i = 0; i < 11; i++) {
        // v.addElement(i);
        // }
        // System.out.println("update capacity " + v.capacity());
        // System.out.println(v);

        // ****** we can set capacity after cross default capacity
        // Vector<Object> v2 = new Vector<>(10, 1);
        // System.out.println(v2.capacity());
        // for (int i = 0; i < 11; i++) {
        // v2.addElement(i);
        // }
        // System.out.println("update capacity " + v2.capacity());
        // System.out.println(v2);

        // ******************** arraylist , linkedList , vector is parent of list and
        // list is parent of object , so we can write this
        List<String> li = new ArrayList<String>();
        List<String> li2 = new LinkedList<String>();
        List<String> li3 = new Vector<String>();
        System.out.println(li);
        System.out.println(li2);
        System.out.println(li3);

    }
}
