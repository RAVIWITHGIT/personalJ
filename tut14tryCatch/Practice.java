public class Practice {
    public static void checkAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Age must be between 0 to 150");
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
        try {
            checkAge(-2);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            // System.out.println("HaHa");
        }

    }
}
