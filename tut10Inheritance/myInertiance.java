/* ********************************** inheritance ************************************
if you want use base/parent/super class in derived/child/sub class then use inheritance
use extends keyword for inheritance in sub/derived/child class 
we can only public method and properties access in derived class
we can not two and more than parent/base/super class extend in child/derived/sub class 

 
 */

class baseClass {
    int x;

    public void setx(int x) {
        this.x = x;
    }

    public void getx() {
        System.out.println(x);
    }

}

class derived extends baseClass {
    int y;

    public void sety(int y) {
        this.y = y;
    }

    public void gety() {
        System.out.println(y);
    }

}

public class myInertiance {
    public static void main(String args[]) {

        // ********************** base class , but we can not access derived class
        // method and properties in base class
        baseClass newbBaseClass = new baseClass();
        newbBaseClass.setx(3);
        newbBaseClass.getx();

        // ********************* derived class
        derived newdDerived = new derived();
        newdDerived.setx(3);
        newdDerived.sety(4);
        newdDerived.getx();
        newdDerived.gety();
    }
}
