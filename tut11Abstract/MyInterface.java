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

// interface Bicycle {
//     int speed = 30;

//     void applyBreak();   //by default is public

//     void speedUp();

// }

// interface Electrical {
//     int eSpeed = 50;

//     void lightColor(String color);

// }

// class Modified implements Bicycle, Electrical {
//     int speed = 60;

//     public void applyBreak() {
//         System.out.println("apply break");
//     }

//     public void speedUp() {
//         System.out.println("increase Modified speed ");
//     }

//     public void lightColor(String color) {
//         System.err.printf("on %s light\n", color);
//     }
// }

// public class MyInterface {
//     public static void main(String args[]) {
//         Modified mix = new Modified();
//         mix.applyBreak();
//         mix.lightColor("red");
//         System.out.println(mix.speed);

//         //**** we can not modified in here
//         //******* * mix.speed = 50;

//     }
// }

// ************************************************* interface with default keyword *******************
// interface Mycamera {
//     void takeSnap();

//     void recordVideo();

//     default void record4KVideo() {
//         System.out.println("Recording in 4k");
//     };
// }

// interface myWifi {
//     String[] getNetwork();

//     void connectToNetwork(String network);

// }

// class myCellPhone {
//     void callNumber(int phoneNumber) {
//         System.out.println("calling" + phoneNumber);
//     }

//     void pickCell() {
//         System.out.println("connecting...");
//     }
// }

// class mySmartPhone extends myCellPhone implements myWifi, Mycamera {
//     public void takeSnap() {
//         System.err.println("Taking snap");
//     }

//     public void recordVideo() {
//         System.out.println("Start Recording");
//     }

//     public void record4KVideo() {
//         System.err.println("override record4k video");
//     }

//     public String[] getNetwork() {
//         System.out.println("Getting List of Network");
//         String[] networkList = { "Ravi", "shyam", "hanuman" };
//         return networkList;
//     }

//     public void connectToNetwork(String network) {
//         System.out.println("connecting to " + network);
//     }
// }

// public class MyInterface {
//     public static void main(String args[]) {
//         mySmartPhone nokia = new mySmartPhone();
//         nokia.record4KVideo();
//         String allNewrok[] = nokia.getNetwork();
//         for (String value : allNewrok) {
//             System.err.println(value);
//         }
//     }
// }

// ************************************* Inheritance in interface *************************************

interface sampleInterface {
    void meth1();

    void meth2();
}

interface childSampleInterface extends sampleInterface {
    void meth3();

    void meth4();
}

class mySampleClass implements childSampleInterface {
    public void meth1() {
        System.out.println("meth1");
    }

    public void meth2() {
        System.out.println("meth2");
    }

    public void meth3() {
        System.out.println("meth3");
    }

    public void meth4() {
        System.out.println("meth4");
    }
}

public class MyInterface {
    public static void main(String args[]) {
        mySampleClass sampleClass = new mySampleClass();
        sampleClass.meth1();
        sampleClass.meth2();
        sampleClass.meth3();
        sampleClass.meth4();
    }
}