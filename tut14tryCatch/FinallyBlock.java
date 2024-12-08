/* ************************************************** Finally Block *********************************
1. Finally Block always run even Though run try or Catch block
2. This Block beneficial when return and break any code in try Block , but this code always run
3. if you do not use Finally Block and write some code after try Catch and code return or break from try Block then after try catch Block code not run
4. we can write try block with finally block without use Catch Block
 */

public class FinallyBlock {
    public static int task() {
        try {
            int a = 10;
            int b = 20;
            return a / b;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("after try Catch Block");
        }
        return 0;
    }

    public static int task2() {
        try {
            int getNumber = -1;
            for (int i = 0; i < 10; i++) {
                if (i == 5) {
                    getNumber = i;
                    break;
                }
            }
            return getNumber;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("after try Catch Block");
        }
        return 0;
    }

    public static void main(String args[]) {
        // int getResult = task();
        // System.out.println(getResult);
        int getResult2 = task2();
        System.out.println(getResult2);
    }
}
