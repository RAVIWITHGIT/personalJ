// import java.util.ArrayList;

// import java.time.LocalTime;
// import java.time.format.DateTimeFormatter;
// import java.util.Calendar;
// import java.util.Date;

import java.util.HashSet;

public class PracticeSet {
    public static void main(String args[]) {

        // Question 1: Create an ArrayList and store the names of ten students inside
        // it. Print it using a for each loop.

        // ArrayList<String> ar = new ArrayList<String>();
        // ar.add("student 1");
        // ar.add("student 2");
        // ar.add("student 3");
        // ar.add("student 4");
        // ar.add("student 5");
        // ar.add("student 6");
        // ar.add("student 7");
        // ar.add("student 8");
        // ar.add("student 9");
        // ar.add("student 10");

        // for (Object o : ar) {
        // System.out.println(o);

        // }

        // Question 2: Use the Date class in Java to print the time in the following
        // format : 21:47:02.
        // ans --> Date class is Deprecated , so i am not using this

        // Question 3: Repeat question number 2 using the Calendar class.
        // Calendar c = Calendar.getInstance();
        // System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE)
        // + ":" + c.get(Calendar.SECOND));

        // Question 4: Repeat question number 2 using java.time API.
        // LocalTime lt = LocalTime.now();
        // DateTimeFormatter dtf = DateTimeFormatter.ofPattern("H:m:s");
        // String formateTime = lt.format(dtf);
        // System.out.println(formateTime);

        // Question 5: Create a Set in java. Try to store the duplicate values elements
        // inside this set and verify that only one instance is stored.
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        hs.add(1);
        System.out.println(hs);

    }
}
