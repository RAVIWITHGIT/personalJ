/* *************************************** custom Exception class ********************************
here we see two method of custom Exception class
1. getMessage() --> this use for get message which you pass in class
2. toString() --> this provide Custom class name with message
3.e.printStackTrace() --> this provide details information about error

when print e then toString() by default run 
 */

// package tut14tryCatch;

class myException extends Exception {
    public myException(String str) {
        super(str);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}

public class CustomExceptionClass {
    public static void main(String args[]) {
        if (10 < 20) {
            try {
                throw new myException("this is Exception");

            } catch (Exception e) {
                // System.out.println(e.getMessage());
                // System.out.println(e.toString());
                // System.out.println(e);
                // e.printStackTrace();
            }
        }
    }
}
