// import java.util.Calendar;
// import java.util.GregorianCalendar;
// import java.util.Date;
// import java.util.TimeZone;

public class My5DateANDTime {
    public static void main(String args[]) {
        // System.out.println(System.currentTimeMillis());
        // System.out.println("get total minute" + System.currentTimeMillis() / 1000 /
        // 60);
        // System.out.println("get total hour" + System.currentTimeMillis() / 1000 /
        // 3600);
        // System.out.println("get total day" + System.currentTimeMillis() / 1000 / 3600
        // / 24);
        // System.out.println("get total year" + System.currentTimeMillis() / 1000 /
        // 3600 / 24 / 365);

        // long v = System.currentTimeMillis();
        // System.out.println(v);

        // *********************************
        // Date d = new Date();
        // System.out.println(d);

        // Date d2 = new Date(1733875686654L);
        // System.out.println(d2);

        // ************************** Calendar *************************
        // Calendar c = Calendar.getInstance();
        // System.out.println(c);
        // System.out.println(c.getCalendarType());
        // System.out.println(c.getTimeZone());

        // ** manually set time zone
        // Calendar c =
        // Calendar.getInstance(TimeZone.getTimeZone("America/Los_Angeles"));
        // System.out.println(c.getCalendarType());
        // System.out.println(c.getTimeZone());
        // System.out.println(c.getTime());
        // System.out.println(c.get(Calendar.YEAR));
        // System.out.println(c.getTime());
        // c.add(Calendar.DATE, -15);
        // System.out.println("15 day ago " + c.getTime());

        // *************************** GregorianCalendar *******************************
        // GregorianCalendar g = new GregorianCalendar();
        // System.out.println(g.isLeapYear(2024));

        // ***************************** TimeZone *****************************
        // System.out.println(TimeZone.getAvailableIDs()[0]);
        // for (String value : TimeZone.getAvailableIDs()) {
        // System.out.println(value);
        // }

    }
}
