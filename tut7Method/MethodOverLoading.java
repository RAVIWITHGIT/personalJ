/* ***************************************** Method overloading ************************************
Two or more methods can have same name but different parameters . such methods are called overloaded methods
void foo();
void foo(int a);
int foo(int a,int b); 
 */

public class MethodOverLoading {
    static void greetingMessage() {
        System.out.println("good Morning every One");
    }

    static void greetingMessage(String name) {
        System.out.printf("good Morning  %s\n", name);
    }

    static String greetingMessage(String name, int time) {
        String result = String.format("good Morning %s Now is  %d:00 PM", name, time);
        return result;
    }

    public static void main(String args[]) {
        greetingMessage();
        greetingMessage("ravi");
        String result = greetingMessage("ravi", 7);
        System.out.println(result);
    }
}