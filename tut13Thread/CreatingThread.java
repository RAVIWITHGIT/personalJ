/* **************************************** Multi Threading *****************************
Multiprocessing and multithreading both are used to achieve multitasking

crating a Thread --> There are two ways to crate a thread in java
1.By Exiting Thread class
2. By implementing Runnable interface

 
 */

// package tut13Thread;

// ************************* Creating a Thread By Exiting Thread class *******

// class MyThread extends Thread {
//     public void run() {
//         int i = 1;
//         while (i < 100) {
//             System.out.println("i am cooking food");
//             i++;
//         }
//     }
// }

// class MyThread2 extends Thread {
//     public void run() {
//         int i = 1;
//         while (i < 100) {
//             System.out.println("i am cheating with her");
//             i++;
//         }
//     }
// }

// class MyThread3 extends Thread {
//     public void run() {
//         int i = 1;
//         while (i < 100) {
//             System.out.println("i am dancing in room");
//             i++;
//         }
//     }
// }

// public class CreatingThread {
//     public static void main(String args[]) {
//         MyThread t1 = new MyThread();
//         MyThread2 t2 = new MyThread2();
//         MyThread3 t3 = new MyThread3();
//         t1.start();
//         t2.start();
//         t3.start();
//     }
// }

// ****************************** creating Thread using Runnable interface ****************

class MyThreadRunnalbe implements Runnable {
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("i am cooking food");
            i++;
        }
    }
}

class MyThreadRunnalbe2 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("i am dancing in room");
            i++;
        }
    }
}

public class CreatingThread {
    public static void main(String args[]) {
        MyThreadRunnalbe bullet1 = new MyThreadRunnalbe();
        Thread t1 = new Thread(bullet1);
        MyThreadRunnalbe2 bullet2 = new MyThreadRunnalbe2();
        Thread t2 = new Thread(bullet2);

        t1.start();
        t2.start();
    }
}
