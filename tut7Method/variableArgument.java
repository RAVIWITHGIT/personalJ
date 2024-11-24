/*  ***************************************** variable Arguments ******************************
 
 */

public class variableArgument {

    static void sum(int... arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        System.out.println(sum);
    }

    public static void main(String args[]) {
        System.out.println("hello");
        sum(1, 2, 3);
    }
}
