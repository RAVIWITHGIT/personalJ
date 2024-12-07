/* ***************************************** Throw v/s Throws ***************************************
Throw --> Throw keyword is used to throw an Exception by the programmer
Throws --> This gives an information to the programmer that there might be an exception , so it better to be prepared with a try catch block
 * 
 */

// public class MyThrows {

//     public static int divide(int a, int b) throws ArithmeticException {
//         int result = a / b;
//         return result;
//     }

//     public static void main(String args[]) {
//         try {
//             int c = divide(5, 0);
//             System.out.println(c);

//         } catch (Exception e) {
//             System.out.println(e);
//         }
//         System.out.println("after error");
//     }
// }

// **************************************** throws with throw keyword

// create custom error for if give negative argument in Area method
class NegativeRadiusException extends Exception {
    public String toString() {
        return "Radius cannot be negative";
    }

    public String getMessage() {
        return "Radius cannot be negative";
    }
}

public class MyThrows {

    // here we try talk to user that this method then give Exception
    public static double Area(int r) throws NegativeRadiusException {
        if (r < 0) {
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }

    public static void main(String args[]) {

        // *** we can see that Area give error that may be get any exception
        // double getResult = Area(4);
        // System.out.println(getResult);

        // ** use tryCatch for handle exception
        try {
            double getResult = Area(-2);
            System.out.println(getResult);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}