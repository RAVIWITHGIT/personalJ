/*  ********************************************** PolyMorphism interface ******************************
 here we can decide which method you use or not
 */

// package tut11Abstract;

interface Mycamera {
    void takeSnap();

    void recordVideo();

    default void record4KVideo() {
        System.out.println("Recording in 4k");
    };
}

interface myWifi {
    String[] getNetwork();

    void connectToNetwork(String network);

}

class myCellPhone {
    void callNumber(int phoneNumber) {
        System.out.println("calling" + phoneNumber);
    }

    void pickCell() {
        System.out.println("connecting...");
    }
}

class mySmartPhone extends myCellPhone implements myWifi, Mycamera {
    public void takeSnap() {
        System.err.println("Taking snap");
    }

    public void recordVideo() {
        System.out.println("Start Recording");
    }

    public void record4KVideo() {
        System.err.println("override record4k video");
    }

    public String[] getNetwork() {
        System.out.println("Getting List of Network");
        String[] networkList = { "Ravi", "shyam", "hanuman" };
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("connecting to " + network);
    }
}

public class polymorphismInInterface {
    public static void main(String args[]) {
        /*
         * 1.you can use only Mycamera method
         * 2.अगर आप ऑब्जेक्ट smartphoe का ले रहे हो और refrence किसी और का ले रहे हो तो
         * आप केवल refrence के method ही use कर सकते हैं|
         */
        Mycamera cam = new mySmartPhone();
        cam.recordVideo();

        // but you can not access cellphone method
        // cam.pickCell();

        mySmartPhone nokia = new mySmartPhone();
        nokia.recordVideo();
        nokia.pickCell();
        nokia.connectToNetwork("1234567890");

    }
}
