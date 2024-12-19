package basicExtraKnowledge.takeInput;

import java.util.Scanner;

/* ******************************************** Scanner class *************************************
here we discuss only how to take character input , other already read  
*/

public class TakeInput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // char ch = sc.next().charAt(0);
        // System.out.println(ch);

        // ****************** if user give binary number and get in decimal
        System.out.println("enter any binary number :");
        int getDecimal = sc.nextInt(2);
        System.out.println(getDecimal);

        // ********** if user give octal number and get in decimal
        // *********** In Java, an octal number is a number represented in base 8. The
        // octal number
        // system uses digits from 0 to 7. In Java
        // System.out.println("enter any octal number :");
        // int getDecimal = sc.nextInt(8);
        // System.out.println(getDecimal);

        // ********** if user give hexadecimal number and get in decimal
        // *********** In Java, a hexadecimal number is a number represented in base 16.

        // System.out.println("enter any hexadecimal number :");
        // int getDecimal = sc.nextInt(16);
        // System.out.println(getDecimal);

    }
}
