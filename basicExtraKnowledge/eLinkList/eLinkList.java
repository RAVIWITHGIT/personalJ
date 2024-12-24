package basicExtraKnowledge.eLinkList;

import java.util.LinkedList;

public class eLinkList {
    public static void main(String args[]) {
        LinkedList<Object> lk = new LinkedList<>();
        lk.add(11);
        lk.addFirst("ravi");
        lk.addLast(false);
        lk.addLast(11.5);

        System.out.println(lk);

        // lk.remove(0);
        // lk.remove(11.5);
        System.out.println(lk);
        // ******* we can remove value from first and last
        // lk.removeFirst();
        // lk.removeLast();

        // ***** we can set value on specific index, mean replace
        // lk.set(1, "ram");
        // System.out.println(lk);
    }
}
