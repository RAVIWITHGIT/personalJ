/* ****************************************** String ***********************************
you have 2 way to create String in java
1.String variableName = new String();
2.String variableName = "string";

string are immutable and cannot be changed original string , but we can do reassign . more know in future
 */

// import java.util.Scanner;

public class MyString {
    public static void main(String args[]) {
        // String name = new String("ravi");
        // String lastName = "lakshakar";
        // lastName = "shyam";
        // System.out.println(name);
        // System.out.println(lastName);

        // Scanner sc = new Scanner(System.in);
        // String st = sc.next();
        // System.out.println(st);

        // String st = sc.nextLine();
        // System.out.println(st);

        // ******************************* System.out.print() --> after code is come in
        // same line after print code
        // String getValue = "ravi";
        // String lastName = "lakshakar";
        // System.out.print(getValue);
        // System.out.print(lastName);

        // ******************************* System.out.println() --> after code is print
        // in new line after print code
        // String getValue = "ravi";
        // String lastName = "lakshakar";
        // System.out.println(getValue);
        // System.out.println(lastName);

        // **************************** System.out.printf()
        /*
         * %d for int
         * %f for float
         * %c for char
         * %s for string
         * %b for boolean
         */
        // String getValue = "ravi";
        // String lastName = "lakshakar";
        // System.out.printf("My first name is %s and last name is %s
        // ",getValue,lastName);

        // ****
        // int a = 20;
        // System.out.printf("the number is %d",a);

        // ****
        // double a = 3.14159265359;
        // System.out.printf("the number is %f",a);

        // ***** print 2 value after decimal
        // double a = 3.14159265359;
        // System.out.printf("the number is %.2f",a);

        // ***** add 8 space with 2 number after decimal
        // double a = 3.14159265359;
        // System.out.printf("the number is %8.2f",a);

        // ******** boolean
        // boolean b = true;
        // System.out.printf("this condition is %b",b);
        // System.out.printf("this condition is %B",b);

        // ********* %n for new line and use comma between % and d for add comma in
        // digit
        // int a=10000;
        // System.out.printf("%,d%n",a);

    }
}