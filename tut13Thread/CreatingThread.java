/*
 * **************************************** Multi Threading
 * *****************************
 * Multiprocessing and multithreading both are used to achieve multitasking
 * 
 * crating a Thread --> There are two ways to crate a thread in java
 * 1.By Exiting Thread class
 * 2. By implementing Runnable interface
 * 
 * 
 */

// package tut13Thread;

// ************************* Creating a Thread By Exiting Thread class *******

// class MyThread extends Thread {
// public void run() {
// int i = 1;
// while (i < 100) {
// System.out.println("i am cooking food");
// i++;
// }
// }
// }

// class MyThread2 extends Thread {
// public void run() {
// int i = 1;
// while (i < 100) {
// System.out.println("i am cheating with her");
// i++;
// }
// }
// }

// class MyThread3 extends Thread {
// public void run() {
// int i = 1;
// while (i < 100) {
// System.out.println("i am dancing in room");
// i++;
// }
// }
// }

// public class CreatingThread {
// public static void main(String args[]) {
// MyThread t1 = new MyThread();
// MyThread2 t2 = new MyThread2();
// MyThread3 t3 = new MyThread3();
// t1.start();
// t2.start();
// t3.start();
// }
// }

// ****************************** creating Thread using Runnable interface
// ****************

// class MyThreadRunnalbe implements Runnable {
// public void run() {
// int i = 0;
// while (i < 100) {
// System.out.println("i am cooking food");
// i++;
// }
// }
// }

// class MyThreadRunnalbe2 implements Runnable {
// public void run() {
// int i = 0;
// while (i < 100) {
// System.out.println("i am dancing in room");
// i++;
// }
// }

// }

// public class CreatingThread {
// public static void main(String args[]) {
// MyThreadRunnalbe bullet1 = new MyThreadRunnalbe();
// Thread t1 = new Thread(bullet1);
// MyThreadRunnalbe2 bullet2 = new MyThreadRunnalbe2();
// Thread t2 = new Thread(bullet2);

// t1.start();
// t2.start();
// }
// }

// *************************************** commonly use ConStructor in Thread
// **********************

// class MyThr extends Thread {
// public MyThr(String name) {
// super(name);
// }

// public void run() {
// System.out.println("i am present in run method");
// }
// }

// public class CreatingThread {
// public static void main(String args[]) {
// MyThr t1 = new MyThr("ravi");
// t1.start();
// // System.out.printf("The id of Thread t1 is %d \n", t1.getId());
// System.out.printf("The name of Thread t1 is %s \n", t1.getName());
// }
// }

// ******* withRunnable
// class MyThr implements Runnable {

// public void run() {
// System.out.println("i am present in Thread using Runnable Class");
// }
// }

// public class CreatingThread {
// public static void main(String args[]) {
// MyThr thr1 = new MyThr();
// Thread t1 = new Thread(thr1, "ram");
// t1.start();
// System.out.printf("The name of Thread t1 is %s \n", t1.getName());
// }
// }

/*
 * ******************************************* Thread
 * Priorities*************************************
 * 1.we can give 3 type of priorities of thread
 * Thread.MIN_PRIORITY
 * Thread.NORM_PRIORITY --> this is by default
 * Thread.MAX_PRIORITY
 * 2. Priorities decide which thread run most time
 */

// class MyThr extends Thread {
//     public MyThr(String name) {
//         super(name);
//     }

//     public void run() {
//         int i = 0;
//         while (i < 100) {
//             System.out.printf("Thank you %s \n", this.getName());
//             i++;

//         }
//     }
// }

// class CreatingThread {
//     public static void main(String args[]) {
//         MyThr t1 = new MyThr("ravi MIN PRIORITY");
//         MyThr t2 = new MyThr("raman NORMAL PRIORITY");
//         MyThr t3 = new MyThr("shyam MOST PRIORITY");
//         t3.setPriority(Thread.MAX_PRIORITY);
//         t1.setPriority(Thread.MIN_PRIORITY);
//         t1.start();
//         t2.start();
//         t3.start();
//     }
// }

/* ****************************************** Thread Method *****************************************
1. join(), if you want first run this thread and after that another thread run
2. Thread.sleep() , if you want one thread sleep for some time 
 
 */

// **** join() 
// class MyThr1 extends Thread {
//     public void run() {
//         int i = 0;
//         while (i < 100) {
//             System.out.println("this is first thread");
//         }
//     }
// }

// class MyThr2 extends Thread {
//     public void run() {
//         int i = 0;
//         while (i < 100) {
//             System.out.println("this is second thread");
//         }
//     }
// }

// class CreatingThread {
//     public static void main(String args[]) {
//         MyThr1 t1 = new MyThr1();
//         MyThr2 t2 = new MyThr2();
//         t1.start();
//         try {
//             t1.join();

//         } catch (Exception e) {
//             System.out.println(e);
//         }
//         t2.start();
//     }
// }

//***  sleep()

class MyThr1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("this is first thread");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThr2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("this is second thread");
        }
    }
}

class CreatingThread {
    public static void main(String args[]) {
        MyThr1 t1 = new MyThr1();
        MyThr2 t2 = new MyThr2();
        t1.start();
        t2.start();
    }
}