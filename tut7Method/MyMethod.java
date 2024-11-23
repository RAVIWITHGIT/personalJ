/* ********************************************** Method ************************************
1.method just like function which read in javascript and other language
2. but in java we do all work in class , so if we want create function then crate in class and then this time function called as method
3. we can create method two way in class
  first --> without using static
            1. if we want create method without static then calling time first create object and then use
  second --> with static
            1. this time we can call direct without make object          



 */
public class MyMethod {
    // *** without use static
    int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    // ** with static
    static int multiply(int a, int b) {
        int result = a * b;
        return result;
    }

    public static void main(String[] args) {
        MyMethod obj = new MyMethod();
        int getReturnValue = obj.sum(2, 3);
        System.out.println(getReturnValue);

        int getReturnValue2 = multiply(2, 3);
        System.out.println(getReturnValue2);
    }
}
