import java.util.Scanner;
import java.util.Random;

public class PracticeWithCondition{
    public static void main(String args[]){

        // ************************
        // byte m1,m2,m3;
        // float p1,p2,p3;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter first subject marks :");
        // m1 = sc.nextByte();
        // System.out.println("enter second subject marks :");
        // m2 = sc.nextByte();
        // System.out.println("enter third subject marks :");
        // m3 = sc.nextByte();

        // p1 = m1/100f*100;
        // p2 = m2/100f*100;
        // p3 = m3/100f*100;

        // float overAllPercentage = (m1+m2+m3)/300f*100;
        // if(overAllPercentage>=40 && (p1>=33 && p2>=33 && p3>=33)){
        //     System.out.println("congratulation , you have been promoted");
        // }else{
        //     System.out.println("sorry , you have not been promoted, please try again ");
        // }


        //************************** 
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your income in lake per annum");
        // float tax = 0;
        // float income = sc.nextFloat();
        // if(income<=2.5){
        //     tax  = tax+0;
        // }else if(income>2.5f && income<=5f){
        //     tax = tax+0.05f*(income-2.5f);
            
        // }
        // else if(income>5f && income<=10.0f){
        //     tax = tax+0.05f*(5.0f-2.5f);
        //     tax = tax+0.2f*(income-5f);

        // }
        // else if(income>10.0f){
        //     tax = tax+0.05f*(5.0f-2.5f);
        //     tax = tax+0.2f*(10.0f-5f);
        //     tax = tax+0.3f*(income-10.0f);
        // }

        // System.out.println("the total tax paid by the employee is :"+tax);


        // *****************************************
        // Scanner sc = new Scanner(System.in);
        // System.out.print("enter day number :");
        // int dayNumber = sc.nextInt();
        // switch (dayNumber){
        //     case 1 -> System.out.println("this is sunday");
        //     case 2 -> System.out.println("this is monday");
        //     case 3 -> System.out.println("this is tuesday");
        //     case 4 -> System.out.println("this is wednesday");
        //     case 5 -> System.out.println("this is thursday");
        //     case 6 -> System.out.println("this is friday");
        //     case 7 -> System.out.println("this is saturday");
        //     default -> System.out.println("enter valid day number");
        // }

        // *************************************************
        // Scanner sc = new Scanner(System.in);
        // System.out.print("enter year for check this is leap year or not :");
        // int getYear = sc.nextInt();
        // if((getYear%4==0 && getYear%100!=0) || getYear%400==0){
        //     System.out.println("year is leap year ");
        // }else{
        //     System.out.println("this year is not leap year ");
        // }

        //*********************************************** 
        // Scanner sc = new Scanner(System.in);
        // System.out.print("enter url :");
        // String getUrl = sc.next();
        // if(getUrl.endsWith(".org")){
        //     System.out.println("this is organizational website");
        // }
        // else if(getUrl.endsWith(".com")){
        //     System.out.println("this is commercial website");
        // }
        // else if(getUrl.endsWith(".in")){
        //     System.out.println("this is indian website");
        // }

        // ************************************************
        Random randomNumber = new Random();
        Scanner sc = new Scanner(System.in);
        //1 for Rock and 2 for paper and 3 for scissor
        for(int i=0; i<3; i++){
            String userValue = "";
            String cValue = "";
            int computerValue = randomNumber.nextInt(3)+1;
        

        System.out.print("enter your value , 1  for Rock and 2 for paper and 3 for scissor :");
        int myValue = sc.nextInt();

        if(myValue==1){
            userValue = "Rock";
        }else if(myValue==2){
            userValue = "paper";
        }else if(myValue==3){
            userValue = "scissor";
        }

        if(computerValue==1){
            cValue = "Rock";
        }else if(computerValue==2){
            cValue = "paper";
        }else if(computerValue==3){
            cValue = "scissor";
        }



        if((myValue==computerValue) ||(myValue==computerValue) ||(myValue==computerValue) ){
            System.out.println("tie");
        }

        else if((myValue==1 && computerValue==3) || (myValue==3 && computerValue==2) || (myValue==2 && computerValue==1)){
            System.out.printf("you are win , your value is %s and computer value is %s",userValue,cValue);
        }else{
            System.out.printf("computer are win , your value is %s and computer value is %s",userValue,cValue);
        }


        System.out.println();
        }

        



    }
}