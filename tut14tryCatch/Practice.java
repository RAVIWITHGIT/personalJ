import java.util.Scanner;

class maxReach extends Exception {
    public maxReach(String str) {
        super(str);
    }

    public String getMessage() {
        return super.getMessage();
    }
}

public class Practice {
    public static void checkAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Age must be between 0 to 150");
        }
    }

    public static void checkValue(int arr[]) throws maxReach {
        boolean flag = true;
        Scanner Sc = new Scanner(System.in);
        int i = 0;
        int getIndex = 0;
        while (flag && i < 5) {
            try {
                System.out.print("enter array Index :");
                getIndex = Sc.nextInt();
                System.out.printf("the value %d of index is %d \n", arr[getIndex], getIndex);
                break;

            } catch (Exception e) {
                System.out.println("Invalid Index");
                i++;
            }

        }
        if (i == 5) {
            throw new maxReach("Exceed 5 chance, next Time brother");
        }
    }

    public static void main(String args[]) {

        // ****************************************** first Question
        // ***************************
        // syntax error --> int a = 6
        /*
         * logical error --> like if you find birth year then
         * int age = 50;
         * int birthYear = 2000-age; //this is logical error because we subtraction with
         * current year
         */

        // runTime error --> 6/0

        // ************************** second Question *********************************

        // --> ArithmeticException
        // try {
        // int a = 6;
        // int b = 0;
        // int result = a / b;
        // System.out.println(result);
        // } catch (ArithmeticException e) {
        // System.out.println("HaHa");
        // }

        // --> IllegalArgumentException
        // try {
        // checkAge(-2);
        // } catch (IllegalArgumentException e) {
        // System.out.println(e);
        // System.out.println(e.getMessage());
        // System.out.println("HaHa");
        // }

        // ************************** third Question *********************************
        // int arr[] = { 1, 2, 3 };
        // boolean flag = true;
        // Scanner Sc = new Scanner(System.in);
        // int i = 0;
        // int getIndex = 0;
        // while (flag) {
        // try {
        // if (i > 4) {
        // System.out.println("Exceed 5 chance, next Time");
        // break;
        // }
        // System.out.print("enter array Index :");
        // getIndex = Sc.nextInt();
        // System.out.printf("the value %d of index is %d \n", arr[getIndex], i);
        // break;

        // } catch (Exception e) {
        // System.out.println("Invalid Index");
        // i++;
        // }

        // }

        // ************************** four Question **********************************
        // int arr[] = { 1, 2, 3 };
        // boolean flag = true;
        // Scanner Sc = new Scanner(System.in);
        // int i = 0;
        // int getIndex = 0;
        // while (flag && i < 5) {
        // try {
        // if (i > 4) {
        // System.out.println("Exceed 5 chance, next Time");
        // break;
        // }
        // System.out.print("enter array Index :");
        // getIndex = Sc.nextInt();
        // System.out.printf("the value %d of index is %d \n", arr[getIndex], i);
        // break;

        // } catch (Exception e) {
        // System.out.println("Invalid Index");
        // i++;
        // }

        // }
        // try {
        // throw new maxReach("get max reach");

        // } catch (Exception e) {
        // System.out.println(e.getMessage());
        // }

        // ********************* five *********************************
        int arr[] = { 1, 2, 3 };

        try {
            checkValue(arr);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
