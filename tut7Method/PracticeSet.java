public class PracticeSet {
    // static int sum(int n) {
    // if (n == 1) {
    // return 1;
    // } else {
    // return n + sum(n - 1);
    // }
    // }

    // static int fibonacciSeries(int n) {
    // if (n == 1 || n == 2) {
    // return n - 1;
    // } else {
    // return fibonacciSeries(n - 1) + fibonacciSeries(n - 2);

    // }

    // }

    // ****************************************** print pattern
    // static void printInnerPattern(int n) {
    // if (n == 1) {
    // System.out.print("*");
    // } else {
    // printInnerPattern(n - 1);
    // System.out.print("*");

    // }

    // }

    // static void printPattern(int n) {
    // if (n == 1) {
    // printInnerPattern(n);

    // System.out.println();

    // } else {
    // printPattern(n - 1);
    // printInnerPattern(n);
    // System.out.println();

    // }

    // }

    // ************************************* print patter reverse
    // static void printInnerPattern(int n) {
    // if (n == 1) {
    // System.out.print("*");
    // } else {
    // printInnerPattern(n - 1);
    // System.out.print("*");

    // }

    // }

    // static void printPattern(int n) {
    // if (n == 1) {
    // printInnerPattern(n);

    // System.out.println();

    // } else {
    // printInnerPattern(n);
    // System.out.println();
    // printPattern(n - 1);

    // }

    // }

    public static void main(String[] args) {
        // int result = sum(5);
        // System.out.println(result);
        // int result = fibonacciSeries(5);
        // System.out.println(result);
        printPattern(5);
    }
}
