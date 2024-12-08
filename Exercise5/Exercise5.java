// package Exercise5;

import java.util.Scanner;

class largeNumber extends Exception {
    public largeNumber(String str) {
        super(str);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}

class matchSymbol extends Exception {
    public matchSymbol(String str) {
        super(str);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}

public class Exercise5 {
    public static void main(String args[]) {
        try {
            Scanner Sc = new Scanner(System.in);

            // **** get first Number
            int firstNumber, secondNumber;
            System.out.println("enter first Number");
            firstNumber = Sc.nextInt();

            if (firstNumber > 100000) {
                throw new largeNumber("you can not enter value larger than 100000");
            }
            // ******** get symbol
            System.out.print("enter Symbol :");
            char symbol = Sc.next().charAt(0);

            if (symbol != '+' && symbol != '-' && symbol != '*' && symbol != '/') {
                throw new matchSymbol("you can only enter +,-,*,/ symbol");
            }

            // ******* get Second Value
            System.out.println("enter second Number");
            secondNumber = Sc.nextInt();
            if (secondNumber > 100000) {
                throw new largeNumber("you can not enter value larger than 100000");
            }

            if (symbol == '+') {
                int result = firstNumber + secondNumber;
                System.out.println(result);
            } else if (symbol == '-') {
                int result = firstNumber - secondNumber;
                System.out.println(result);
            } else if (symbol == '*') {
                int result = firstNumber * secondNumber;
                System.out.println(result);
            } else if (symbol == '/') {
                int result = firstNumber / secondNumber;
                System.out.println(result);
            } else {

            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
