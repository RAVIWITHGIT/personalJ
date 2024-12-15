// package Exercise5;

import java.util.Scanner;

class canNotUseThisNumber extends Exception {
    @Override
    public String toString() {
        return "Cannot use 8 or 9 number";
    }
}

class canNotDivideByZero extends Exception {
    @Override
    public String toString() {
        return "Cannot divide by zero";
    }
}

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
            if (firstNumber == 8 || firstNumber == 9) {
                throw new canNotUseThisNumber();
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
            if (secondNumber == 8 || secondNumber == 9) {
                throw new canNotUseThisNumber();
            }
            if (symbol == '/' && secondNumber == 0) {
                throw new canNotDivideByZero();
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
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
