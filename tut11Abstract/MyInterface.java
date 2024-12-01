/* ***************************************** interface *********************************************
1.in java interface is a group of related methods with empty bodies
2. in abstract we can only  expend one abstract class ,but interface we can use multiple interface in sub class 
3. it compulsory that use  all interface method in subClass
4. we can not modify interface properties in subclass 
5. when use interface method in sub class then make method as public
6. we can not required write public keyword in interface because this is by default
7. more read in future
 */

// package tut11Abstract;

interface Bicycle {
    int speed = 30;

    void applyBreak();

    void speedUp();

}

interface Electrical {
    int eSpeed = 50;

    void lightColor(String color);

}

class Modified implements Bicycle, Electrical {
    int speed = 60;

    public void applyBreak() {
        System.out.println("apply break");
    }

    public void speedUp() {
        System.out.println("increase Modified speed ");
    }

    public void lightColor(String color) {
        System.err.printf("on %s light\n", color);
    }
}

public class MyInterface {
    public static void main(String args[]) {
        Modified mix = new Modified();
        mix.applyBreak();
        mix.lightColor("red");
        System.out.println(mix.speed);

        // we can not modified in here
        // mix.speed = 50;

    }
}
