package basicExtraKnowledge.variableType;

/*  ******************************************** variable type *******************************
1. local variable --> create in curly bracket in main method , 
2. instance variable --> outside of curly bracket , use only by creating object
3. static variable --> use in outside of curly bracket , but use without create object

also we can do declaration  and initialization with , in instance and static variable
more go to pdf
 
 */

public class VariableType {

    // instance variable --> we can declaration , without initialization value
    int rollNumber;
    String state;

    // static variable --> we can declaration , without initialization value . not
    // require object for use
    static String country;

    static boolean knowHindi = true;

    public static void main(String args[]) {

        // we can not only declaration , use with initialization
        // int x;
        // System.out.println(x);

        // *** this is right
        // int x;
        // x = 20;
        // System.out.println(x);

        // local variable
        int x = 20;
        System.out.println(x);

        // *******************************8 use instance variable
        // VariableType t1 = new VariableType();
        // System.out.println(t1.rollNumber);
        // System.out.println(t1.state);
        // System.out.println(country);

        VariableType t1 = new VariableType();
        t1.rollNumber = 1;
        t1.state = "rajasthan";
        country = "india";
        System.out.println(t1.rollNumber);
        System.out.println(t1.state);
        System.out.println(country);
        System.out.println(knowHindi);

    }
}
