/* ************************************************ Functional Interface **************************
  A functional interface in Java is an interface that contains only a single abstract (unimplemented) method. A functional interface can contain default and static methods which do have an implementation, in addition to the single unimplemented method
 */

@FunctionalInterface
interface myInterface {
    void meth1();

}

class modified implements myInterface {
    public void meth1() {
        System.out.println("meth1");
    }
}

public class My7FunctionalInterface {
    public static void main(String args[]) {
        System.out.println("good morning ravi");
        modified obj = new modified();
        obj.meth1();
    }
}