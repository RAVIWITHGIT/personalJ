
class MyThr extends Thread {
    public void run() {
        while (true) {
            System.out.println("good morning ravi");
        }
    }
}

class MyThr2 extends Thread {
    public void run() {
        // while (true) {
        // // try {

        // // Thread.sleep(200);
        // // } catch (Exception e) {
        // // System.out.println(e);
        // // }
        // System.out.println("welcome ram");
        // }
    }
}

public class PracticeQuestion {
    public static void main(String args[]) {
        MyThr t1 = new MyThr();
        MyThr2 t2 = new MyThr2();
        t1.setPriority(1);
        t2.setPriority(10);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t2.getState());
        // t1.start();
        t2.start();
        System.out.println(t2.getState());
        System.out.println(Thread.currentThread().getState());

    }
}
