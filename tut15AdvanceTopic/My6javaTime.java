import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class My6javaTime {
    public static void main(String args[]) {
        // LocalDate d = LocalDate.now();
        // System.out.println(d);
        // LocalTime t = LocalTime.now();
        // System.out.println(t);

        // LocalDateTime dt = LocalDateTime.now();
        // System.out.println(dt);

        // *********************************** DateTime formatter
        // **************************************
        // use the dateTime formatter we can show time our according
        LocalDateTime dt = LocalDateTime.now();
        // DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        // String formateDate = dt.format(dtf);
        // System.out.println(formateDate);

        // DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // String formateDate2 = dt.format(dtf2);
        // System.out.println(formateDate2);

        // DateTimeFormatter dtf3 = DateTimeFormatter.ISO_LOCAL_DATE;
        // DateTimeFormatter dtf3 = DateTimeFormatter.ISO_DATE_TIME;
        // DateTimeFormatter dtf3 = DateTimeFormatter.ISO_DATE;
        // String formateDate3 = dt.format(dtf3);
        // System.out.println(formateDate3);

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd-MM-yyyy E a ");
        String formateDate4 = dt.format(dtf4);
        System.out.println(formateDate4);
    }
}
