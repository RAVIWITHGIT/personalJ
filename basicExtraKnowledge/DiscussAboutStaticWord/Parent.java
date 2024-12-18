package basicExtraKnowledge.DiscussAboutStaticWord;

/*  ********************************************* access child class method in parent class ********
we can access two way
first --> if child method not use static keyword , then if you want use in parent class then first make object and then use
second --> if child method use static keyword , then use access direct . without make new object
 * 
 * 
 */

public class Parent {
    public static void main(String args[]) {

        // ************* first way
        child getMethod = new child();
        getMethod.childMethod();

        // ************* second way
        child.childMethod2();
    }
}
