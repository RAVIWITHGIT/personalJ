
// package tut15Array_List(Advance);
import java.util.ArrayList;

public class MyArrayList {
    public static void main(String args[]) {
        ArrayList<Integer> li = new ArrayList<Integer>();
        li.add(11);
        li.add(12);
        li.add(13);
        li.add(14);

        // also we we can add element in specific position
        li.add(0, 50);
        li.add(0, 100);

        /*
         * 1. also we can add new Arraylist in existing array list , using addAll()
         * method
         * this method add in last
         * 2. we can set initialCapacity in array list
         */

        ArrayList<Integer> li2 = new ArrayList<>(5);
        li2.add(101);
        li2.add(102);
        li2.add(103);
        li2.add(104);
        li2.add(105);
        li2.add(106);
        li.addAll(li2);

        // we you want add new arrayList in starting position then first you give index
        // and then give array
        li.addAll(0, li2);

        // if you want clear all element then use clear() method
        // li.clear();

        // ** check specific element present in array then use contains() method
        System.out.println(li.contains(11));

        // get this element present which index , find from starting position
        System.out.println(li.indexOf(102));

        // **get this element present which index , find from lastIndex to starting
        // position
        System.out.println(li.lastIndexOf(102));
        System.out.println(li.lastIndexOf(14));

        // ******* if you change existing value then use set() method
        li.set(1, 1002);

        for (int i = 0; i < li.size(); i++) {
            System.out.print(li.get(i) + " ");
        }
        System.out.println();
        // ******* create copy
        ArrayList<Integer> li3 = new ArrayList<>(li);
        li3.add(20);
        for (int i = 0; i < li3.size(); i++) {
            System.out.print(li3.get(i) + " ");
        }
        System.out.println();

        // ******* forEach method on Arraylist
        li3.forEach((n) -> System.out.print(n + " "));

    }
}
