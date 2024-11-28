/* ******************************************* constructor Inheritance ************************
 
 */

// package tut10Inheritance;

// ************************ constructor without parameter
// class baseClass {
//     public baseClass() {
//         System.out.println("this is base class constructor without parameter");
//     }
// }

// class derived extends baseClass {
//     public derived() {
//         System.out.println("this is derived class constructor without parameter");
//     }
// }

// ************************ constructor with parameter , then use super() keyword
class baseClass {
    public baseClass() {
        System.out.println("this is base class constructor without one parameter");
    }

    public baseClass(int x) {
        System.out.println("this is base class constructor with one parameter" + x);
    }
}

class derived extends baseClass {
    public derived() {
        System.out.println("this is derived class constructor without parameter");
    }

    public derived(int x, int y) {
        super(x);
        System.out.println("this is derived class constructor with two parameter" + x + " " + y);
    }
}

class innerChild extends derived {
    public innerChild(int x, int y, int z) {
        super(x, y);
        System.out.println("this is derived class constructor with three parameter" + x + " " + y + " " + z);
    }
}

public class constructorsInheritance {
    public static void main(String args[]) {
        innerChild newiChild = new innerChild(3, 4, 5);
    }

}
