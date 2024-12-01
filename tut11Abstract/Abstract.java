/* ************************************************** Abstract class *****************************************
1.Abstract class work like structure
2. when make abstract method use abstract keyword then class will be abstract class
3. if we extend  from Abstract class then compulsory make all abstract method which present in abstract class
4. we can not crate object of Abstract class . it only work as layout
5. A method that is declared without an implementation
 */

// package tut11Abstract;

abstract class parentAbstract {
    public parentAbstract() {
        System.out.println("i am constructor of a parentAbstract class");
    }

    public void sayHello() {
        System.out.println("hello ravi");
    }

    abstract public void greet();
}

class child extends parentAbstract {
    public void greet() {
        System.out.println("good morning everyOne");
    }
}

public class Abstract {
    public static void main(String args[]) {
        child childAbstract = new child();
        childAbstract.greet();
    }

}
