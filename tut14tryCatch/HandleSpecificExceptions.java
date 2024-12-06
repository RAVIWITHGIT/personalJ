/* ************************************* Handle Specific Exceptions by Try Catch ***********************
1.here we discuss about how handel specific error
2. here see two type of error we handle --> 
first . Arithmetic Exception , 
second . ArrayIndexOutOfBoundsExceptions 
 */

package tut14tryCatch;

import java.util.Scanner;

public class HandleSpecificExceptions {
    public static void main(String args[]) {
        int myArr[] = { 1, 2, 3 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index which value you want :");
        int index = sc.nextInt();

        System.out.print("enter value which use to divide to array value :");
        int divideValue = sc.nextInt();

        try {
            System.out.printf("the value of Index which you choose %d\n", myArr[index]);
            System.out.println("the output of after divide with index value " + myArr[index] / divideValue);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
