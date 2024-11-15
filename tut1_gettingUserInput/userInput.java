import java.util.Scanner;

public class userInput{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //**********  get integer value from user
        // System.out.println("enter first number :");
        // int a = sc.nextInt();
        // System.out.println("enter second number :");
        // int b = sc.nextInt();

        // int result = a+b;
        // System.out.println(result);


        //*************  get float value from user;
        // System.out.print("enter first float number :");
        // float a = sc.nextFloat();
        // System.out.print("enter second float number :");
        // float b = sc.nextFloat();
        // float result = a+b;
        // System.out.println(result);


        //  *************** check number is integer or not
        // System.out.print("enter value and checked value is number :");
        // boolean b1 = sc.hasNextInt();
        // System.out.println(b1);


        // ********************** get string value from user and get only one word
        // System.out.print("enter any string value :");
        // String str = sc.next();
        // System.out.println(str);


        // ********************* get string value with full sentence ;
        // System.out.print("enter any sentence :");
        // String str = sc.nextLine();
        // System.out.println(str);

        // ******************** Task
        float totalMarks = 500f;
        float hindi = sc.nextFloat();
        float English = sc.nextFloat();
        float science = sc.nextFloat();
        float Math = sc.nextFloat();
        float Physics = sc.nextFloat();
        float total = hindi+English+science+Math+Physics;
        float percentage = (total/totalMarks)*100f;
        System.out.println(total);
        System.out.println(percentage);


    }
}