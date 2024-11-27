// package Exercise3;

import java.util.Random;
import java.util.Scanner;

class Exercise3Class {
    private int getNumber;
    private int getInput;
    private int noOfGuesses;

    public Exercise3Class() {
        Random generateRandom = new Random();
        getNumber = generateRandom.nextInt(10);
    }

    public void takeUserInput(int n) {
        getInput = n;
    }

    public boolean isCorrectNumber() {
        if (getNumber != getInput) {
            noOfGuesses++;
            return true;
        } else {
            noOfGuesses++;
            return false;
        }
    }

    public void result() {
        System.out.printf("computer generate Number is %d\n", getNumber);
        System.out.printf("user Number is %d\n", getInput);
        System.out.printf("total number of time you guesses is %d", noOfGuesses);

    }

}

public class Exercise3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Exercise3Class solutions = new Exercise3Class();
        do {
            System.out.print("enter number :");
            int number = sc.nextInt();
            solutions.takeUserInput(number);
        } while (solutions.isCorrectNumber());

        solutions.result();

    }
}
