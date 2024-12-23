// package basicExtraKnowledge.Thread;

/*
 * ****************************************************** thread
 * *********************************
 * 
 */

/*
 * *****************************************************************************
 * *******
 * 1. by default main class has already a thread
 * 2. we can see what is priority of this class -->
 * Thread.currentThread.getPriority();
 * 3. we can set priority manually in this class -->
 * Thread.currentThread.setPriority();
 * 
 */

// public class myThread {
// public static void main(String args[]) {
// System.out.println(Thread.currentThread().getPriority());
// Thread.currentThread().setPriority(7);
// System.out.println(Thread.currentThread().getPriority());
// }
// }

/*
 * *****************************************************************************
 * ***********
 * 1. we can get Thread name in main class , by default is Thread name is "main"
 * 2. we can set Thread name manually
 * 
 */

// public class myThread {
// public static void main(String args[]) {
// System.out.println(Thread.currentThread().getName());
// Thread.currentThread().setName("custom thread");
// System.out.println(Thread.currentThread().getName());
// }
// }

/******************************************************************************************
 * see create Thread name
 */

// class A extends Thread {
// public void run() {
// System.out.println("first Thread.." + Thread.currentThread().getName());
// }
// }

// class b extends Thread {
// public void run() {
// System.out.println("second Thread.." + Thread.currentThread().getName());
// }
// }

// class c extends Thread {
// public void run() {
// System.out.println("third Thread.." + Thread.currentThread().getName());
// }
// }

// public class myThread {
// public static void main(String args[]) {
// A firstThread = new A();
// b secondThread = new b();
// c thirdThread = new c();
// firstThread.start();
// secondThread.start();
// thirdThread.start();
// }
// }

/******************************************************************************************
 * we can use one time start() method in Thread
 * we can do this by create another object
 */

// class A extends Thread {
//     public void run() {
//         System.out.println("first");
//     }
// }

// public class myThread {
//     public static void main(String args[]) {
//         A firstThread = new A();
//         firstThread.start();

//         // *********** we can not use Start() method multiple time
//         firstThread.start();

//     }
// }

/******************************************************************************************
 * 1. convert multiThreading to single Threading by synchronized keyword
 * 2. use when you want first complete first thread then after another thread
 * 3. this is not compulsory that first thread run first , any thread run first
 * and finish then run another run and finish
 */

// *** without synchronized keyword
// class myT {
// public void printTable(int n) {
// for (int i = 0; i < n; i++) {
// try {
// Thread.sleep(100);
// } catch (Exception e) {
// }
// System.out.println(n * i);
// }
// }
// }

// class A extends Thread {
// myT t;

// public A(myT t) {
// this.t = t;
// }

// public void run() {
// t.printTable(5);
// }
// }

// class b extends Thread {
// myT t;

// public b(myT t) {
// this.t = t;
// }

// public void run() {
// t.printTable(100);
// }
// }

// public class myThread {
// public static void main(String args[]) {
// myT t = new myT();
// A firstThread = new A(t);
// b secondThread = new b(t);
// firstThread.start();
// secondThread.start();
// }
// }

// ***** with synchronized keyword
class myT {
    public synchronized void printTable(int n) {
        for (int i = 0; i < n; i++) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
            System.out.println(n * i);
        }
    }
}

class A extends Thread {
    myT t;

    public A(myT t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class b extends Thread {
    myT t;

    public b(myT t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}

public class myThread {
    public static void main(String args[]) {
        myT t = new myT();
        A firstThread = new A(t);
        b secondThread = new b(t);
        firstThread.start();
        secondThread.start();
    }
}
