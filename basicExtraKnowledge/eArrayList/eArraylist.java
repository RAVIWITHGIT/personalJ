package basicExtraKnowledge.eArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class eArraylist {
    public static void main(String args[]) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(11);
        al.add(12);
        al.add(13);
        al.add(14);
        al.add(15);

        // for (Integer getNew : al) {
        // System.out.println(getNew);
        // }

        // also we can do this , because Object is parent class of all built in class in
        // java
        // for (Object getnew : al) {
        // System.out.println(getnew);
        // }

        // **************************************** we can store any type of value in
        // arraylist
        // ArrayList<Object> anyType = new ArrayList<>();
        // anyType.add(11);
        // anyType.add(true);
        // anyType.add("ravi");

        // for (Object newal : anyType) {
        // System.out.println(newal);
        // }

        // ******************************** we can also iterator arraylist value using
        // ********* we can print value only forward side
        // ArrayList<Object> anyType = new ArrayList<>();
        // anyType.add(11);
        // anyType.add(true);
        // anyType.add("ravi");

        // Iterator<Object> itr = anyType.iterator();
        // while (itr.hasNext()) {
        // System.out.println(itr.next());
        // }

        // **** using ListIterator we can print value forward and backward side
        ArrayList<Object> anyType = new ArrayList<>();
        anyType.add(11);
        anyType.add(true);
        anyType.add("ravi");

        ListIterator<Object> itr = anyType.listIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }

    }
}
